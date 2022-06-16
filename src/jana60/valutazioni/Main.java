package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int nStudenti;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice sarà in grado di stampare a schermo le promozioni di una classe di studenti.");
		
		do {
			
			System.out.print("Inserisci il numero di alunni della classe: ");
			nStudenti = scan.nextInt();
			
			if(nStudenti <= 0)
				System.out.println("Il numero di studenti non può essere pari a 0 o inferiore, riprova.");
			
		}while(nStudenti <= 0);
		
		Studente[] classe = new Studente[nStudenti];
		int assenze;
		float voti;
		
		for(int i = 0; i < classe.length; i++) {
			
			System.out.print("Inserisci la percentuale di assenze del " + (i + 1) + "° studente: ");
			assenze = scan.nextInt();
			
			System.out.print("Inserisci la media dei voti del "+ (i + 1) + "° studente: ");
			voti = scan.nextFloat();
			
			classe[i] = new Studente(i + 1, assenze, voti);
			
		}
		
		int numeroPromossi = 0;
		
		for(int i = 0; i < classe.length; i++) {
			
			if(classe[i].calcoloPromozione()) {
				
				System.out.println("Lo studente " + classe[i].idStudente + " è stato promosso");
				numeroPromossi++;
				
			}else
				System.out.println("Lo studente " + classe[i].idStudente + " è stato bocciato");
			
		}
		
		System.out.println("Il numero di studenti promossi e\': " + numeroPromossi);
		
		scan.close();
		
	}

}
