package week09;

import java.util.Arrays;

public class ReportDownloader {
    public static void main(String[] args) {
        String reports= "CF32,CF11,CF33,CF99";
        String[] allReports = reports.split(";");

        System.out.println(Arrays.toString(allReports));

        //for(String report):allReports){
        System.out.println("Downloading" + reports + "...");
    }
}
