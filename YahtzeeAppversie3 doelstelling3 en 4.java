import java.util.Random;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;
import java.util.*;

public class YahtzeeApp {

	public static void main(String[] args) {
		System.out.println("Welkom bij het spel Yahtzee.");
		System.out.println("Druk op 'Enter' om door te gaan of druk op 'q' om het spel te verlaten:");
		YahtzeeSpel spel = new YahtzeeSpel();
		spel.spelen();
	}
}

class YahtzeeSpel {
	
	ArrayList<Integer> dobbelstenen = new ArrayList<>();
	int[] blokkeren = new int[] {0, 0, 0, 0, 0};
	
	public void Yahtzee() {
		
	dobbelstenen.add(1);
	dobbelstenen.add(2);
	dobbelstenen.add(3);
	dobbelstenen.add(4);
	dobbelstenen.add(5);
	
	for(int element: dobbelstenen) {
        System.out.println(element);
        
		}		
	}
	
	
	void spelen() {
		Scanner sc = new Scanner(System.in);
		char quit = 'q';
		String enter = "";			
		
		System.out.println( "");
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

class Dobbelsteen {

	int dobbelOgen;
	
	 int werpen() {
		Random dobbelen = new Random();
		int dobbelGetal = dobbelen.nextInt(6)+1;
		dobbelOgen = dobbelGetal;
		return dobbelGetal;
	}
}
