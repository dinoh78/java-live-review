package week04;
public class IphonePrices {
    public static void main(String[] args) {
        String iphoneModel = "16 Pro";
        System.out.println("iPhone " + iphoneModel);

        switch (iphoneModel) {
            case "16 Pro":
                System.out.println("From $999 or $41.62/mo. for 24 mo");
                break;
            case "16":
                System.out.println("From $799 or $33.29/mo. for 24 mo");
                break;
            case "15":
                System.out.println("From $699 or $29.12/mo. for 24 mo");
                break;
            case "14":
                System.out.println("From $599 or $24.95/mo. for 24 mo");
                break;
            case "SE":
                System.out.println("From $429 or $17.87/mo. for 24 mo");
                break;
            default:
                System.out.println(iphoneModel + " is not valid");
        }

        System.out.println("====== Enhanced switch =======");

        switch (iphoneModel) {
            case "16 Pro" -> System.out.println("From $999 or $41.62/mo. for 24 mo");
            case "16" -> System.out.println("From $799 or $33.29/mo. for 24 mo");
            case "15" -> System.out.println("From $699 or $29.12/mo. for 24 mo");
            case "14" -> System.out.println("From $599 or $24.95/mo. for 24 mo");
            case "SE" -> System.out.println("From $429 or $17.87/mo. for 24 mo");
            default -> System.out.println(iphoneModel + " is not valid");
        }
    }
}
