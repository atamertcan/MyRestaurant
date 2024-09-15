import java.util.Locale;
import java.util.Scanner;

public class Hamburger{


    private String type;
    private double basePrice;

    public Hamburger(String type, double basePrice){
        this.type = type;
        this.basePrice = basePrice;
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void burgerChoser(){
        Scanner s = new Scanner(System.in);

        System.out.println("-".repeat(30));

        System.out.println("- Basic\n" +
                           "- Deluxe");

        System.out.println("-".repeat(30));
        type = s.nextLine();

        if(type.toLowerCase().equals("deluxe")){
            this.basePrice = 10.00;
        }
        else if (type.toLowerCase().equals("basic")){
            this.basePrice = 5.00;
        }
        else{
            System.out.println("Invalid Choice");
        }

    }
    public void toppingChoser(){
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        boolean provide = true;
        while(provide){

            if (counter == 3){

                break;
            }
            System.out.println("-".repeat(30));

            System.out.println("- ketchup\n" +
                               "- mayo\n" +
                               "- ranch\n" +
                               "-Q for quit");

            System.out.println("-".repeat(30));
            switch(sc.nextLine().toLowerCase(Locale.ROOT)){
                case "ketchup":

                    SideItem ketchup = new SideItem();
                    basePrice += ketchup.getToppingPrice();
                    System.out.println("Ketchup is chosen.");
                    counter++;
                    break;

                case "mayo":

                    SideItem mayo = new SideItem();
                    basePrice += mayo.getToppingPrice();
                    System.out.println("Mayo is chosen.");
                    counter++;
                    break;

                case "ranch":

                    SideItem ranch = new SideItem();
                    basePrice += ranch.getToppingPrice();
                    System.out.println("Ranch is chosen.");
                    counter++;
                    break;

                case "q":

                    provide = false;
                    break;

                default:

                    System.out.println("Invalid choice.");
                    break;
            }
        }

    }

}
