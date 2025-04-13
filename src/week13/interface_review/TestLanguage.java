package week13.interface_review;

public class TestLanguage {
    public static void main(String[] args) {
        /*
        Language lan = new Language() { //anonymous sub-class
            @Override
            public String hello() {
                return "Merhaba!";
            }

            @Override
            public String bye() {
                return "Gule gule!";
            }
        };
        */
        //Language l = new Language(); ERROR - cannot create object of interface

        English english = new English();
        Spanish spanish = new Spanish();

        System.out.println(english.hello());
        System.out.println(spanish.hello());

        System.out.println(english.bye());
        System.out.println(spanish.bye());

        //variable
        System.out.println(english.TYPE);
        System.out.println(Language.TYPE);
    }
}

