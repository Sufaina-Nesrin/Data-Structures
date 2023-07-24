public class Encoding {
    public static String change(String str, int key){
        int newKey = key % 26;//checking the increment no
        char[] charArray = new char[str.length()];
        
     for(int i=0; i<str.length(); i++){
        int letterPosition = str.charAt(i) + newKey;//adding to our char
        //got a number
        if(letterPosition <= 122){//check the number thats inside of the z
             charArray[i] = (char)letterPosition;//if yes directly assign
             //to the new array
        }else{
    // if not add 
        charArray[i] = (char) ( 96+(letterPosition-122));
         }
     }
 

       return new String(charArray);
    }
    public static void main(String[] args) {
        String value = "zxy";
        System.out.println((change(value,27)));
    }
}

