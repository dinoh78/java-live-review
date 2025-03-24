
package week02.variables;
/*
rank, flag, country, gold, silver, bronze, total
 */
public class ParisOlympicResults {
    public static void main(String[] args) {
        int rank = 1;
        String flag = "\uD83C\uDDFA\uD83C\uDDF8";
        String country = "United States";
        int gold = 40, silver = 44, bronze = 42, total = 126;

        //headers:
        System.out.println("Team\t\t\t\t\t\tGold\tSilver\tBronze\tTotal");
        System.out.println(rank + " " + flag + " " + country + "\t\t\t" + gold +"\t\t" +silver + "\t\t" + bronze + "\t\t" + total);

        //China:
        rank = 2;
        flag = "\uD83C\uDDE8\uD83C\uDDF3";
        country = "China";
        gold = 40;
        silver = 27;
        bronze = 24;
        total = 91;
        System.out.println(rank + " " + flag + " " + country + "\t\t\t\t\t" + gold +"\t\t" +silver + "\t\t" + bronze + "\t\t" + total);








    }
}