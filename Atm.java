import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float balance=1000;//Balance
		int ch=choice();
		Scanner sc=new Scanner(System.in);
		//Menu
		while(ch!=4) {
			switch(ch)
			{
			case 1:
				System.out.println("Enter the amount to deposite");
				float amount=sc.nextFloat();
				balance=balance+amount;
				System.out.println(amount+" deposited successfully \nThe new balance amount is "+balance);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				float wdraw=sc.nextFloat();
				if(balance<wdraw) {
					System.out.println("Insufficent balance");
					System.out.println("The total balance amount is "+balance);
					break;
				}
				else {
					balance=balance-wdraw;
					System.out.println("  "+wdraw+" was successfully withdrawed \nThe new balance amount is "+balance);
					break;
				}
			case 3 :
				System.out.println("The total balance amount is "+balance);
				break;
			default :
				System.out.println("404:error invalid entry");
				break;
			}
			ch=choice();
			}
		System.out.println("Thanks for using JAVA ATM");
	}
public static int choice() {
	System.out.println("WELCOME TO ATM MACHINE");
	System.out.println("1.Deposite");
	System.out.println("2.Withdraw");
	System.out.println("3.View Balance");
	System.out.println("4.EXIT");
	System.out.println("Enter your choice");
	Scanner sc=new Scanner(System.in);
	int ech=sc.nextInt();
	return(ech);
	}
}
