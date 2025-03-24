package week04;
/*
   GasMileageCalculator
    current, previous, gallons,
    calculate and assign to mpg (miles per gallon)
    if mpg more than = 25 -> good gas mileage
    otherwise poor gas mileage
 */

public class GasMileageCalculator {
    public static void main(String[] args) {
        int current = 50655;
        int previus = 50_000;
        int gallons = 30;
        int mpg = (current-previus)/ 20;
        System.out.println("mpg = " + mpg);

        if(mpg >=25) {
            System.out.println("Good gas milage");
        }else{
            System.out.println("Bad gas milage");
        }

    }
}
