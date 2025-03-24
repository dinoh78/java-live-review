package week08;

public class StringIntro {

    public static void main(String[] args) {
        //Creating and Comparing String objects
        String str1 = "java review"; //object is in string pool
        String str2 = new String("java review"); //object is in heap area, outside string pool

        //compare using == vs equals
        System.out.println(str1 == str2); //false , they are not pointing to same object in memory
        System.out.println(str1.equals(str2)); //true, comparing values

        String str3 = "java review";
        System.out.println(str1 == str3); //true -> same object in string pool
        System.out.println(str1.equals(str3)); //true -> same values

        System.out.println("java" == "java");//true
        System.out.println("JAVA".equals("java")); //false
        System.out.println("JAVA".equalsIgnoreCase("java")); //true

        str1 += " and coding"; //"java review", " and coding", "java review and coding"
        System.out.println("str1 = " + str1);

        System.out.println("------ length() ------");
        //get length of string
        String password = "NewYorkabc123@321";
        System.out.println("password length = " + password.length());

        if (password.length() < 12) {
            System.err.println("Password must be at least 12 characters");
        } else {
            System.out.println("Password is set as " + password);
        }

        String word1 = "javascript";
        String word2 = "python";
        String longer;
        if (word1.length() > word2.length()) {
            longer = word1;
        } else {
            longer = word2;
        }

        System.out.println("longer = " + longer);

        System.out.println("----charAt----");
        String lang = "java";
        System.out.println("lang.length() = " + lang.length());
        System.out.println(lang.charAt(0));
        System.out.println(lang.charAt(1));
        System.out.println(lang.charAt(2));
        System.out.println(lang.charAt(3));
        //System.out.println(lang.charAt(4)); StringOutOfBoundsException
        System.out.println("March".charAt(0));

        char second = "ruby".charAt(1);
        System.out.println("seconds letter of ruby is " + second);

        System.out.println("----- get last character -----");
        String word = "Avocado";
        System.out.println("last character of word = " + word.charAt( word.length()-1 ));

        System.out.println("------Case conversion----");
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        String pet = "Bird";
        if (pet.toLowerCase().equals("cat")) {
            System.out.println("meow");
        }else if (pet.toLowerCase().equals("bird")) {
            System.out.println("chirp");
        }
    }
}
