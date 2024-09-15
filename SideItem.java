import java.util.Scanner;

public class SideItem{

    private double toppingPrice = 1.00;
    private double chipsPrice;
    private String size;
    private String type;


    public SideItem(double chipsPrice, String size) {
        this.chipsPrice = chipsPrice;
        this.size = size;
    }

    public SideItem(){

    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public String getSize() {
        return size;
    }

    public void sideItemSize(){
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(30));

        System.out.println("- Small\n" +
                           "- Medium\n" +
                           "- Large");
        System.out.println("-".repeat(30));

        switch (sc.nextLine().toLowerCase()){
            case "small":
                chipsPrice -= 0.50;
                break;
            case "medium":
                break;
            case "large":
                chipsPrice += 0.50;
                break;
            default:
                System.out.println("Invalid Choice.");
                chipsPrice -= 1.50;
        }

    }
}
