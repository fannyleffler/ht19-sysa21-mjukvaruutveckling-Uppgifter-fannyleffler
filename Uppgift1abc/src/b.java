import java.text.DecimalFormat;
import java.util.Scanner;

public class b {
		
		public static void main (String[]args) {
			
				String namn;
				double timlön;
				double arbetadeTimmar;
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Ange ditt namn: ");
				namn = scan.nextLine();
				namn = namn.toUpperCase();
				
				System.out.print("Ange din timlön: ");
				timlön = scan.nextDouble();
				
				System.out.print("Ange antalet arbetade timmar: ");
				arbetadeTimmar = scan.nextDouble();
				
				DecimalFormat df = new DecimalFormat("0.00");
				
				System.out.print(namn + " du tjänade " + (df.format(timlön*arbetadeTimmar)) + " kr förra veckan.");

	}

}
