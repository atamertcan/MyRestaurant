
public class MealOrder {

    private SideItem sideItem;
    private Hamburger hamburger;

    public MealOrder(SideItem sideItem, Hamburger hamburger) {
        this.sideItem = sideItem;
        this.hamburger = hamburger;
    }

    public void totalPrice(){
        System.out.println("-".repeat(30));
        System.out.printf("Total: %.2f\n", hamburger.getBasePrice() + sideItem.getChipsPrice());
        System.out.printf("Content: %s chips, %s hamburger,",
                                                            sideItem.getSize().toLowerCase(),
                                                            hamburger.getType());

    }


}
