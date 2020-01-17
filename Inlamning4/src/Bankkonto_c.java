import java.util.Scanner;

public class Bankkonto_c {

	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		Bankkonto_a bankkonto = new Bankkonto_a();
		
		boolean run = true;
		int val;
		int belopp;
		
		while (run == true) {
			System.out.print("Insättning eller uttag? (0-insättning, 1-uttag): ");
			val = scan.nextInt();
			if (val == 0) {
				System.out.print("Ange belopp: ");
				belopp = scan.nextInt();
				bankkonto.credit(belopp);
				System.out.print("Saldo: " + bankkonto.getBalance());
			}
			else if (val == 1) {
				System.out.println("Ange belopp: ");
				belopp = scan.nextInt();
				bankkonto.withdraw(belopp);
				System.out.println("Saldo: " + bankkonto.getBalance());
			}
				System.out.println();
				System.out.println("Vill du avsluta? ");
				
			if (scan.next().equals("J")) {
				System.out.println("Saldo: " + bankkonto.getBalance());
				run = false;
			}
		}	scan.close();
	}
}