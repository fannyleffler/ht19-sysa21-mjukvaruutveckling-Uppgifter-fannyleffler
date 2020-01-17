
import java.util.Scanner;

public class a {
		
		public static void main (String[]args) {
			
			Scanner scan = new Scanner(System.in);
			
			String ord1;
			String ord2;
			
			System.out.print("Skriv ett ord: ");
			ord1 = scan.nextLine();
			System.out.print("Skriv ytterligare ett ord: ");
			ord2 = scan.nextLine();
			System.out.println();
			System.out.println(ord1 + " " + ord2);
			System.out.println((ord1 + ord2).length());

	}

}