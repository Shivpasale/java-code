import java.util.Scanner;
class ElectricityBillCalculator 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
         	System.out.print("Enter the number of units consumed: ");
        	int unitsConsumed = scanner.nextInt();
		double totalBill = 0;
        	if (unitsConsumed <= 50) 
		{
            		totalBill = unitsConsumed * 0.50;
        	} 
		else if (unitsConsumed > 50 && unitsConsumed <= 150) 
		{
            		totalBill = 50 * 0.50 + (unitsConsumed - 50) * 0.75;
        	} 
		else if (unitsConsumed > 150 && unitsConsumed <= 250) 
		{
            		totalBill = 50 * 0.50 + 100 * 0.75 + (unitsConsumed - 150) * 1.20;
        	} 
		else if (unitsConsumed > 250) 
		{
            		totalBill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unitsConsumed - 250) * 1.50;
        	}
                totalBill *= 1.20;
        	System.out.println("\nTotal Electricity Bill: Rs. " + totalBill);
    	}
}
