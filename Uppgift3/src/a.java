import java.util.Scanner;

public class a {
	
	public static void main (String[]args) {
		
		int tal = 0;
		int summa = 0;
		int medelvarde = 0;
		int max;
		int[] lista = new int [5];
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Skriv in fem tal: ");
		
		for (int i = 0; i < 5; i++) {
			tal = scan.nextInt();
			lista[i] = tal;
		}
			max = lista[0];
		for (int i = 0; i < 5; i++) {
			summa += lista[i];
			if (max < lista[i]) {
				max = lista[i];
			}
		}
			medelvarde = (summa / lista.length);
		System.out.println("Summan av de fem talen är: " + summa);
		System.out.println("Medelvärdet av de fem talen är: " + medelvarde);
		System.out.println("Det största av de fem talen är: " + max);
		
	}

}
