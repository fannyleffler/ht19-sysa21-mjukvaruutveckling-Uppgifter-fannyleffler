import java.util.Scanner;

public class b {
		
		public static void main (String[]args) {
					
			int talEtt;
			int talTva;	
			boolean run = true;	
			
			Scanner scan = new Scanner (System.in);
			
			while (run) {
					System.out.print("Skriv in det första talet: ");
					talEtt = scan.nextInt();
					
				if (talEtt == 0) {
					run = false;
					System.out.print("Tackar");
				}		
				else {
					System.out.print("Skriv in det andra talet: ");
					talTva = scan.nextInt();

				if (talEtt < talTva) {
					System.out.println(talEtt + " är mindre än " + talTva);
				}
				else if (talEtt > talTva) {
					System.out.print(talEtt + " är större än " + talTva);
				}
				else {
					System.out.println("Talen är lika");
				}
		
				}
			}
	}


}