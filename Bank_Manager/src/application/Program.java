package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> history = new ArrayList<>();

		char conti = 'y';
		
		while (conti == 'y') {
			
			System.out.println("===== BANK MANAGER =====");
			System.out.println("1 - Register new account");
			System.out.println("2 - Deposit");
			System.out.println("3 - Withdraw");
			System.out.println("4 - Check Balance");
			System.out.println("5 - Movements historic");
			System.out.println("6 - Transference between accounts");
			System.out.println("7 - Exit");
			System.out.print("Please, select a number: ");
			int num = sc.nextInt();
			
		}
	}

}
