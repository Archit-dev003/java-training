public class VowelOrConsonant {
    public static void main(String[] args) {
        String word = "cOllege";
        String str = word.toLowerCase();
        
        for(int j=0; j < str.length();j++)
        {
          char ch = str.charAt(j);

            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
            System.out.println(word.charAt(j) + " is vowel");

            else 
            System.out.println(word.charAt(j) + " is consonant");
          }
    }

}
