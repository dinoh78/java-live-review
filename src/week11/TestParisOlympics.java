package week11;
///static import lets using static menmer without class name
import static week11.ParisOlympics.*;
import static java.lang.Math.*;

public class TestParisOlympics {
    public static void main(String[] args) {
        ParisOlympics.showAllMedals();
        System.out.println(ParisOlympics.EVENT);

        System.out.println(max(10,5));
        System.out.println(max(10,-4));

    }
}
