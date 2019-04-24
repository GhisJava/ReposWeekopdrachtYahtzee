import java.util.Scanner;
import java.lang.*;

public class YahtzeeApp {

	public static void main(String[] args) {
		System.out.println("Druk op 'Enter' om door te gaan of druk op 'q'om het spel te beeëindigen:");
		Scanner sc = new Scanner(System.in);
		char quit = 'q';
		String enter = "";			

		boolean doorgaan = true; 									 
		while (doorgaan) {
			String Toets = sc.nextLine();
		  if (Toets.equals("q")) {
				System.out.println("Het spel is gestopt");
				doorgaan = false;
				
			} else if (Toets.equals(enter))
				System.out.println("");
		  
				else if ((Toets != enter) || (Toets != "q")) {
				System.out.println("Toets een 'enter' om door te gaan of een 'q' om te stoppen:");
			}
		}
	}
}
