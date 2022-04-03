import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        System.out.println("====== Starting TestCafe ======");
        System.out.println("");
        System.out.println("-- TestCafe --");
        System.out.println("");

        CafeUtil cafeUtil = new CafeUtil();
        cafeUtil.starter();
        System.out.println("");

        int streakGoal = cafeUtil.getStreakGoal(10);
        System.out.println(String.format("Customer Streak %s.", streakGoal));
        System.out.println("");

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeUtil.getStreakGoal(10));
        System.out.println("");

        double[] lineItems = { 3.5, 1.5, 4.0, 4.5, 6.25, 2.25 };
        double orderTotal = cafeUtil.GetOrderTotal(lineItems);
        System.out.println("----- Order Total Test-----");
        System.out.printf("Order total: %s \n\n", orderTotal);
        System.out.println("");

        System.out.println("----- Display Menu Test-----");
        System.out.println("");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafeUtil.displayMenu(menu);
        System.out.println("");

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            cafeUtil.addCustomer(customers);
            System.out.println("\n");
        }
        System.out.println("");

        cafeUtil.printPriceChart("Columbian Coffee Grounds", 15.00, 3);
        cafeUtil.printPriceChartDiscount("Starbucks Fake Coffee Beans", 2.00, 6);
        System.out.println("");

        // Array for menu Items:
        // Products
        ArrayList<String> menuProduct = new ArrayList<String>();
        menuProduct.add("drip coffee");
        menuProduct.add("cappuccino");
        menuProduct.add("latte");
        menuProduct.add("mocha");
        for (String item : menuProduct) {
            System.out.println(item);
        }

        // Prices
        ArrayList<Double> menuPrices = new ArrayList<Double>();
        menuPrices.add(2.00);
        menuPrices.add(3.50);
        menuPrices.add(4.00);
        menuPrices.add(5.25);
        menuPrices.add(6.25);

        for (Double price : menuPrices) {
            System.out.println(price);
        }

        cafeUtil.displayMenu(menuProduct, menuPrices);

        System.out.println("");
        // Add customers till 'q'
        cafeUtil.addCustomer();

        System.out.println("");
        System.out.println("====== End TestCafe ======");
    }
}