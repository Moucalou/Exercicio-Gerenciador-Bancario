package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> history = new ArrayList<>();
		List<String> owner = new ArrayList<>();
		List<Integer> number = new ArrayList<>();
		List<Double> balance = new ArrayList<>();

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
			sc.nextLine();
			
			switch (num) {
			case 1:
				System.out.print("Enter account owner name: ");
				String name = sc.nextLine();
				owner.add(name);
				System.out.print("Enter account number: ");
				int accountNumber = sc.nextInt();
				sc.nextLine();
				number.add(accountNumber);
				System.out.print("Do you want to start a balance? (y/n) ");
				char startBalance = sc.next().charAt(0);
				switch (startBalance) {
				case 'y':
					System.out.print("Please insert the amount of money: ");
					double money = sc.nextDouble();
					balance.add(money);
					break;
				case 'n':
					money = 0.0;
					balance.add(money);
					break;
				}
				history.add("Created account " + number.getLast() + ". Owner " + owner.getLast() + ". Balance: R$ " + balance.getLast());
				System.out.println("Created account " + number.getLast() + ". Owner " + owner.getLast() + ". Balance: R$ " + balance.getLast());
				break;
			case 2:
				System.out.print("Please, insert the account you want to deposit: ");
				accountNumber = sc.nextInt();
				sc.nextLine();
				int index = number.indexOf(accountNumber);
				System.out.print("Enter the amount you want to deposit: ");
				double money = sc.nextDouble();
				double newBalance = money + balance.get(index);
				balance.set(index, newBalance);
				history.add("Accomplished a deposit of R$ " + money + " at account " + accountNumber);
				System.out.println("Accomplished a deposit of R$ " + money + " at account " + accountNumber);
				break;
			case 3:
				System.out.print("Please, insert the account you want to withdraw: ");
				accountNumber = sc.nextInt();
				sc.nextLine();
				index = number.indexOf(accountNumber);
				System.out.print("Enter the amount you want to withdraw: ");
				money = sc.nextDouble();
				newBalance = balance.get(index) - money;
					if (newBalance <= 0) {
						System.out.println("The current balance of this account is: R$" + balance.get(index));
						System.out.print("Are you sure you want to continue? (y/n) ");
						char withdraw = sc.next().charAt(0);
						switch (withdraw) {
						case 'y':
							balance.set(index, newBalance);
							System.out.println("This account is now NEGATIVE");
							System.out.println("New Balance = R$ " + balance.get(index));
							history.add("Withdrawed R$ " + money + " at account " + accountNumber);
							break;
						case 'n':
							history.add("User tried to withdraw R$ " + money + " from account " + accountNumber + " but it gave up due new Balance is negative");
							return;
						}
					}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			}
			
		}
	}

}
