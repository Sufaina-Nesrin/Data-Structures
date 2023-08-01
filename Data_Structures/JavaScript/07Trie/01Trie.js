class TrieNode{
    constructor(){
        this.children = {};
    }
}

class Trie{
    constructor(str){
        this.root = new TrieNode();
        this.endSymbol = "*";
        this.populateSuffix(str)
    }

    populateSuffix(str){
        for(let i=0; i<str.length; i++){
            this.instertSubString(i, str);
        }
    }
    
    instertSubString(indx, str){
        let node = this.root;
       for(let i=indx; i<str.length; i++){
        let letter = str[i];
        if (!node.children[letter]) {
            //Putting it all together, node.children[letter] = new TrieNode(); is a way to add a new child node to the current node node, where the key (property name) of the child node is the character letter, and the value is a new TrieNode
            node.children[letter] = new TrieNode();
          }
          node = node.children[letter]
       }
       node.children[this.endSymbol] = null;
    }

    contains(str){
        let node = this.root;

        for(let i=0; i<str.length; i++){
            let letter = str[i];
            if(!node.children.hasOwnProperty(letter)){
                return false
            }
            node = node.children[letter];
        }
        return node.children.hasOwnProperty(this.endSymbol);
    }   
    
}

const trie = new Trie("mannan");
console.log(trie.contains("annan"));