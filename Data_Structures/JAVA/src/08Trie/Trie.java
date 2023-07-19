import java.util.HashMap;
import java.util.Map;



public class Trie{

    static class TrieNode{
        Map<Character, TrieNode> children =  new HashMap<>();
    }

    TrieNode root = new TrieNode();
    char endSymbol = '*';

    public Trie(String str){//pass a string
        populateSuffixTrie(str);//build a suffix trie
    }

    public void populateSuffixTrie(String str){
        for(int i=0; i<str.length(); i++){
         insertSubStringStartingAt(i, str);//passing position and string
        }

    }

    public void insertSubStringStartingAt(int index, String str){//insert
        TrieNode node = root;
        //inserting elements startingfrom position to the end
        for(int i=index; i<str.length(); i++){
//there is hashMap in the node we have to check whether the character is
// there or not
char letter = str.charAt(i);
         if(!node.children.containsKey(letter)) {
 //if not create a hashMap with value of the character and key with node
            TrieNode newNode = new TrieNode();
            node.children.put(letter,newNode);
         } 
            node = node.children.get(letter);//iterate to the next node
     
        }
        node.children.put(endSymbol,null);

    }

    public boolean contains(String str){
// this function check the word that search is there or not 
//for eg we are checking anna here
//take first 'a' to the node if there is no a then we can return false
//likewise check the all       
        TrieNode node = root;
        for(int i = 0; i<str.length(); i++){
            char letter  = str.charAt(i);
            //check the key(letter) is in the node or not
            if(!node.children.containsKey(letter)){
               return false;
            }

            node = node.children.get(letter); //iterating to the next node
        }
        return node.children.containsKey(endSymbol);
    }

    public static void main(String[] args) {
        Trie trie = new Trie("mannan");
        System.out.println(trie.contains("nan"));
    }
}