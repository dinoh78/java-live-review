package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("brown","black","yellow","pink","white","silver","purple"));
        System.out.println("colors = " + colors);
        System.out.println("count = " + colors.size());

        //find the index of 'yellow'
        System.out.println(colors.indexOf("yellow"));
        System.out.println(colors.indexOf("java"));

        //replace yellow with java
        colors.set(colors.indexOf("yellow") , "java");
        System.out.println("colors = " + colors);

        for(String col : colors) {
            System.out.println("col = " + col);
        }

        //remove all colors that are len of less than 6
        colors.removeIf(col -> col.length() < 6);
        System.out.println("colors = " + colors);
    }
}