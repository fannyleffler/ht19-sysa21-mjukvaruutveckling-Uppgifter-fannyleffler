import java.util.Scanner;

public class a {

		public static void main (String[]args) {
			
			int talEtt;
			int talTva;
			
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Skriv in det första talet: ");
			talEtt = scan.nextInt();
			System.out.print("Skriv in det andra talet: ");
			talTva = scan.nextInt();
			
				if (talEtt < talTva) {
					System.out.println(talEtt + " är mindre än " + talTva);
				}
				
				else if (talEtt > talTva) {
					System.out.print(talEtt + " är större än " + talTva);
				}
				
				else if (talEtt == talTva) {
					System.out.println("Talen är lika");
				}

	}
		
}