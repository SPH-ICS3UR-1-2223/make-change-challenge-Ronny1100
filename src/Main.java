import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Enter a price");
		double TotalAmount = in.nextDouble();
		//Read in the amount paid
		System.out.println("Enter how much you paid.");
		double AmountPaid = in.nextDouble();
		//Print out the amount of change
		double change = AmountPaid - TotalAmount;
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		System.out.println("Your change is $"+change);
		int num100 = (int)(change/100);
		System.out.println(num100+" x $100");
		change = change-num100*100;
		
		int num50 = (int)(change/50);
		System.out.println(num50+" x $50");
		change = change-num50*50;
		
		int num20 = (int)(change/20);
		System.out.println(num20+" x $20");
		change = change-num20*20;
		

		int num10 = (int)(change/10);
		System.out.println(num10+" x $10");
		change = change-num10*10;
		
		int num5 = (int)(change/5);
		System.out.println(num5+" x $5");
		change = change-num5*5;
		
		int num2 = (int)(change/2);
		System.out.println(num2+" x $2");
		change = change-num2*2;
		
		int num1 = (int)(change/1);
		System.out.println(num1+" x $1");
		change = change-num1*1;
		
		int num025 = (int)(change/0.25);
		System.out.println(num025+" x $0.25");
		change = change-num025*0.25;
		
		int num010 = (int)(change/0.10);
		System.out.println(num1+" x $0.10");
		change = change-num010*0.10;
		
		int num005 = (int)(change/0.05);
		System.out.println(num1+" x $0.05");
		change = change-num005*0.05;
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
//			double TotalAmount = 13.85; {
//				System.out.println(("Total amount is&"+random.textlnt(1000));
//			double AmountPaid = 50.00; {
//				System.out.println("You paid")
//			}
//			double Change;
//			String BreakChange = "100; 50; 20; 10; 5; 2; 1; 0.25; 0.10; 0.05"; {
//				
//			}
			
		}
		
}
	
