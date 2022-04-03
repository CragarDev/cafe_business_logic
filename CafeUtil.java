import java.util.ArrayList;

public class CafeUtil {

    // Just a starter to check run
    public void starter() {
        System.out.println("====== CafeUtil - starter method ======");
        System.out.println("");
        System.out.println("-- starter --");
        System.out.println("");
        System.out.println("====== End starter ======");

    }

    // Get the customer streak goal
    public int getStreakGoal(int numWeeks) {
        // Rewards system for customers who buy everyweek...
        // sum together each integer from 1 to numWeeks
        // for loop
        // Returns the sum
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // Get total for the order
    public double GetOrderTotal(double[] prices) {
        // get the total order amount from the array of prices
        // loop through array and sum up the prices
        double sum = 0.00;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    // Display Menu
    public void displayMenu(ArrayList<String> menuItems) {
        // print the index and value for each item in an arrayList
        // Enhanced for loop with a counter for the index.
        int counter = 0;
        for (String menuItem : menuItems) {
            System.out.println(String.format("%s %s", counter, menuItem));
            counter += 1;
        }

    }

    // add Customer to the line
    public void addCustomer(ArrayList<String> customers) {
        // print enter name to the console
        System.out.println("Please enter your name:");
        // get users name from the enter
        String userName = System.console().readLine();
        // Print greeting
        System.out.println(String.format("Hello, %s", userName));
        // Get the size of the array of customers
        int customersInArray = customers.size();
        // Print out the number of customers ahead of userName
        System.out.println(String.format("There are %s people in front of you!", customersInArray));
        // Add userName to the customers list
        customers.add(userName);
        // Print out all the customers from the customers array
        for (String customer : customers) {
            System.out.println(customer);
        }
    }

    // add Customer to the line
    public void addCustomer() {
        // print enter name to the console
        System.out.println("Please enter customer name (enter 'q' to end session.):");
        // get users name from the enter
        // While loop to gather customers
        String customerEntered = ""; // initialize the customer entered variable
        String exitStrat = "q"; // set the exit variable

        // Customers list
        ArrayList<String> customers = new ArrayList<String>();

        while (customerEntered.equals(exitStrat) == false) {
            // System.out.println("cusent: " + customerEntered);
            customerEntered = System.console().readLine();
            // System.out.println("You have entered: " + customerEntered);
            if (customerEntered.equals(exitStrat)) {
                break;
            }
            customers.add(customerEntered);
        }

        // print out customer list
        System.out.println(String.format("--- Customer List ----"));
        for (String customer : customers) {
            System.out.println(customer);
        }
        // print out customer list
        System.out.println(String.format("=== End Customer List ==="));

    }

    // Price chart
    public void printPriceChart(String product, double price, int maxQuantity) {
        // Print the cost for buying 1 product, then 2, then 3 and so on up to the max
        // for eg, if the product is Columbian Coffee Grounds with a price of 15.00 and
        // a maxQuantity of 3
        // you should print"
        // <name of product>
        // 1 - $15.00
        // 2 - $30.00
        // 3 - $45.00

        // Print name of product
        System.out.println(product);

        // loop till reach the maxQuantity
        double sumPricing = 0;
        int counter = 1;
        ArrayList<String> bulkPricingList = new ArrayList<String>();
        for (int i = 1; i <= maxQuantity; i++) {
            sumPricing += price;
            bulkPricingList.add(String.format("%s - $%.2f%n", counter, sumPricing));
            counter += 1;
        }
        for (String listItem : bulkPricingList) {
            System.out.println(listItem);
        }

    }

    // Price chart
    public void printPriceChartDiscount(String product, double price, int maxQuantity) {
        // Print the cost for buying 1 product, then 2, then 3 and so on up to the max
        // for eg, if the product is Columbian Coffee Grounds with a price of 15.00 and
        // a maxQuantity of 3
        // you should print"
        // <name of product>
        // 1 - $15.00
        // 2 - $30.00
        // 3 - $45.00

        // Print name of product
        System.out.println(product);

        // loop till reach the maxQuantity
        double sumPricing = 0;
        int counter = 1;
        ArrayList<String> bulkPricingList = new ArrayList<String>();
        for (int i = 1; i <= maxQuantity; i++) {
            sumPricing += price;
            bulkPricingList.add(String.format("%s - $%.2f%n", counter, sumPricing));
            // System.out.println(String.format("%s - $%.2f%n", counter, sumPricing));
            // discount the price for a second and on of .50c
            sumPricing -= (.50);
            counter += 1;
        }
        for (String listItem : bulkPricingList) {
            System.out.println(listItem);
        }

    }

    // Overload the displaymenu
    public Boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        // Print a menu
        //
        int menuSize = menuItems.size();
        int priceSize = prices.size();
        // First check to see if the arrays are the same size
        if (menuSize != priceSize) {
            return false;
        }

        // for loop for index and getting from
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(String.format(i + " " + menuItems.get(i) + " -- " + prices.get(i)));
        }
        return true;
    }

    // bottom
}