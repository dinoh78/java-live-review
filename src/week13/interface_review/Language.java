package week13.interface_review;

public interface Language {

    public static final String TYPE = "Human";

    String hello();
    public abstract String bye();

    public static void describe(){
        System.out.println("Human language use for communication");
    }

    public default  void translate(String from, String to){
        System.out.println("Translating from " + from + " to " + to);

    }

    private void read(String sentence){
        System.out.println("reading " + sentence);
    }

}
