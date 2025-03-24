package week09;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 3,940,000,000 results (1.39 seconds)";
        String[] resultArr = result.split(" ");
        System.out.println(Arrays.toString(resultArr));

        String countStr = resultArr[1].replace(",","");
        System.out.println("countStr = " + countStr);

        long count = Long.parseLong(countStr);
        System.out.println("count = " + count);

        if (count >= 100_000) {
            System.out.println("Too many results, narrow your search");
        } else {
            System.out.println("Search results are valid");
        }

        double seconds = Double.parseDouble(resultArr[3].replace("(",""));
        System.out.println("seconds = " + seconds);

        if (seconds <= 0.85) {
            System.out.println("Search performance check passed");
        } else {
            System.out.println("Search performance check failed");
        }
    }
}