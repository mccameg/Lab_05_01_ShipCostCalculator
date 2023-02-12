public class Main {

    public static void main(String[] args) {
	double FREE_SHIP = 100;
	double itemCost = 150;
	double shippingCost = 0;
	double totalCost = 0;
        if (itemCost < FREE_SHIP)
        {   shippingCost = itemCost * .02;
            totalCost = itemCost + shippingCost;
            System.out.println("The shipping cost is $" + shippingCost + ". The total cost is $" + totalCost);
        }
        else

        System.out.println("Shipping is free. The total cost is $" + itemCost);
    }

}
