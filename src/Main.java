public class Main {

    public static void main(String[] args) {
	double FREE_SHIP = 100;
	double itemCost = 150;
	double shippingCost = 0;
	double totalCost = 0;
        if (itemCost < FREE_SHIP)
        {   shippingCost = itemCost * .02; // if the item cost is over $100, then we will calculate the shipping cost to be 2% of the item cost and store the shipping cost
            totalCost = itemCost + shippingCost; // if the item cost is over $100, then we find the total cost by adding the shipping cost to the item cost
            System.out.println("The shipping cost is $" + shippingCost + ". The total cost is $" + totalCost); // outputs the shipping cost and total cost if the item cost is over $100
        }
        else // item cost is >= $100
        {
            System.out.println("Shipping is free. The total cost is $" + itemCost); // if item cost is $100 or more, then the output tells us that shipping is free and outputs the total cost at the cost of the item alone
        }
    }

}
