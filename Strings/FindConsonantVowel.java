
public class FindConsonantVowel {
    public static void main(String args[]){
        String str1 = "Ayushi";
        String str2 = str1.toLowerCase();
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        int vowelCount  = 0;
        int consonantCount  = 0;
        
        for(int i=0;i<str1.length();i++){
            Boolean v = false; 
            for(int j=0;j<vowels.length;j++){
                if(str2.charAt(i) == vowels[j].charAt(0)){
                    v = true;
                    break;
                }
            }
            if(v==true){
                vowelCount++;
            }
            else if(Character.isLetter(str2.charAt(i))){
                consonantCount++;
            }
        }
        System.out.println("Vowel Count : "+vowelCount);
        System.out.println("Consonant Count : "+consonantCount);
    }
}
