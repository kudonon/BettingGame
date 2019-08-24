import java.util.Scanner; 
import java.util.Random;

public class BettingGame {

	public double comp, choice;
	public double money, wager;
	public int x,n,z;
	public int ent;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Welcome to FunGame 101");
		System.out.println("Press 'enter' to start");
		scan.nextLine();
		
		System.out.println("Do you know how to play? [1 = yes; 2 = no]");
		int ent = scan.nextInt();
		
		while (!(ent == 1||ent == 2)) {
			System.out.print("Please adhere to the commands");
			System.out.print("Try again");
			ent = scan.nextInt();
		}
		
		if (ent == 2) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		
		double money = 20.00;
		
		System.out.println("You start out with $20.00");
		System.out.println();
		
		while (!(money <= 0.00 || money >= 60.00)) {
			
			System.out.println("How much do you want to wager?");
			double wager = scan.nextDouble();
			
			while (wager > money) {
				System.out.println("You do not have that much");
				System.out.println("Try Again");
				wager = scan.nextDouble();
			}
			
			System.out.println("Pick a Weapon [1 = Rock, 2 = Scissors, 3 = Paper]");
			int choice = scan.nextInt();
			
			do {
				if (choice == 1) {
					System.out.println("You have picked up a Rock");
				} else if (choice == 2) {
					System.out.println("You have picked up a pair of Scissors");
				} else if (choice == 3) {
					System.out.println("You have picked up a piece of Paper");
				} else {
					System.out.println("You have not picked anything");
					System.out.println("Try Again");
					choice = scan.nextInt();
				}
			} while (!(choice == 1 || choice == 2|| choice ==3));
			
			System.out.println("");
			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			int comp = 1 + rand.nextInt(3);
			
			if (comp == 1) {
				System.out.println("The computer has picked up a Rock");
			} else if (comp == 2) {
				System.out.println("The computer has picked up a pair of Scissors");
			} else if (comp == 3) {
				System.out.println("The computer has picked up a piece of Paper");
			}
			
			System.out.println("");
			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			if ((comp == 1 && choice == 2) || (comp == 2 && choice == 3) || (comp == 3 && choice == 1)) {
				System.out.println("You have lost this battle");
				System.out.println("You lose your $" + wager);
				money = money - wager;
			} else if ((choice == 1 && comp == 2) || (choice == 2 && comp == 3) || (choice == 3 && comp == 1)) {
				System.out.println("You have won this battle");
				System.out.println("You gain $" + (wager *2));
				money = money + (wager * 2);
			} else {
				System.out.println("It is a tie");
				System.out.println("You get your $" + wager + " back");
			}
			
			System.out.println("");

			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			System.out.println("Current Balance : $" + money);
			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
		}
		
		try {
		    Thread.sleep(1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("-------------------------GAME OVER-------------------------");
		System.out.println("The Results are...");

		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		if (money < 0.00) {
			System.out.println("You Lose");
		} else {
			System.out.println("You Win");
		}
		
		
		
	}
	
}




