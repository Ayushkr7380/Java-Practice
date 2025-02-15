public class StringFunctions {
    public static void main(String args[]){
        String str1 = "Ayush";
        String str2 = "Ayush";

        //Uppercase
        System.out.println("UpperCase : "+str1.toUpperCase());

        //Lowercase
        System.out.println("LowerCase : "+str1.toLowerCase());

        //Equals
        System.out.println("Equal function returns true or false ,In this case it returs : "+str1.equals(str2));
        
        if(str1.equals(str2)){
            System.out.println("Both Strings are equal.");
        }
        else{
            System.out.println("Strings are different.");
        }
    }
}
