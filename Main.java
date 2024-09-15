public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger("basic", 5.00);
        burger.burgerChoser();
        burger.toppingChoser();


        SideItem item = new SideItem(1.50, "MEDIUM");
        item.sideItemSize();

        MealOrder meal = new MealOrder(item,burger);

        meal.totalPrice();


    }

}


