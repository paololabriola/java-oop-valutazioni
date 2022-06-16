package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Dichiarazione variabile numero studenti.
		int nStudenti;
		//Dichiarazione variabile di tipo scanner per prendere valori in input da tastiera.
		Scanner scan = new Scanner(System.in);
		//Descrizione utilizzo del codice.
		System.out.println("Questo codice sarà in grado di stampare a schermo le promozioni di una classe di studenti.");
		//Inizializzazione variabile contente il numero degli studenti della classe con relativo ciclo di controllo.
		do {
			
			System.out.print("Inserisci il numero di alunni della classe: ");
			nStudenti = scan.nextInt();
			
			if(nStudenti <= 0)
				System.out.println("Il numero di studenti non può essere pari a 0 o inferiore, riprova.");
			
		}while(nStudenti <= 0);
		//Dichiarazione array classe di tipo Studente con dimensione massima inserita precedentemente in input.
		Studente[] classe = new Studente[nStudenti];
		//Dichiarazione variabile delle assenze dell'alunno.
		int assenze;
		//Dichiarazione variabile dei voti dell'alunno.
		float voti;
		//Ciclo di riempimento dell'array classe
		for(int i = 0; i < classe.length; i++) {
			//Inizializzazione della percentuale di assenze dell'alunno corrente.
			System.out.print("Inserisci la percentuale di assenze del " + (i + 1) + "° studente: ");
			assenze = scan.nextInt();
			//Inizializzazione della media dei vori dell'alunno corrente.
			System.out.print("Inserisci la media dei voti del "+ (i + 1) + "° studente: ");
			voti = scan.nextFloat();
			//Salvataggio dei valori appena inseriti nello slot corrente dell'array di studenti con assegnazione dell'id.
			classe[i] = new Studente(i + 1, assenze, voti);
			
		}
		//Dichiarazione contatore per il calcolo del totale degli alunni promossi.
		int numeroPromossi = 0;
		//Ciclo di controllo per ogni studente dell'array classe.//Formattazione dell'indice della tabella.
		System.out.format("%25s %10s %25s %10s %10s %10s %10s", "Id Alunno", "|", "Percentuale Assenze", "|", "Media Voti", "|", "Esito");
		//Per mandare a capo il separatore
		System.out.println();
		//Separatore che divide l'indice dal corpo della tabella
		System.out.format("%s", "---------------------------------------------------------------------------------------------------------------------");
	
		for(int i = 0; i < classe.length; i++) {
			
			if(classe[i].calcoloPromozione()) {
	
				//incremento contatore alunni promossi.
				numeroPromossi++;
				System.out.println();
				//Formattazione tabella
				System.out.format("%25s %10s %25s %10s %10.1f %10s %10s", classe[i].idStudente, "|", classe[i].percentualeAssenze + "%", "|", classe[i].mediaVoti, "|", "Promosso");
				
			}else {
				
				System.out.println();
				//Formattazione tabella
				System.out.format("%25s %10s %25s %10s %10.1f %10s %10s", classe[i].idStudente, "|", classe[i].percentualeAssenze + "%", "|", classe[i].mediaVoti, "|", "Bocciato");
			}
		}
		//Stampa del numero totale di alunni promossi.
		System.out.println("\nIl numero di studenti promossi è: " + numeroPromossi);
		//Chiusura dello scanner.
		scan.close();
		
	}

}
