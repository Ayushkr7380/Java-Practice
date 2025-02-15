public class StringFunctions {
    public static void main(String args[]){
        String str1 = "Ayush";
        String str2 = "Ayush";

        //toUpperCase()
        System.out.println("UpperCase : "+str1.toUpperCase());

        //toLowerCase()
        System.out.println("LowerCase : "+str1.toLowerCase());

        //equals()
        System.out.println("Equal function returns true or false ,In this case it returs : "+str1.equals(str2));

        if(str1.equals(str2)){
            System.out.println("Both Strings are equal.");
        }
        else{
            System.out.println("Strings are different.");
        }

        //contains()
        System.out.println(str1+" contains b : "+str1.contains("b"));
        
        //endsWith()
        System.out.println(str1+" ends with h : "+str1.endsWith("h"));
        
    }
}
