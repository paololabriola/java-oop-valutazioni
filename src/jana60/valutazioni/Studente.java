package jana60.valutazioni;

public class Studente {

	int idStudente;
	int percentualeAssenze;
	float mediaVoti;
	
	public Studente(int idStudente, int assenze, float mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = assenze;
		this.mediaVoti = mediaVoti;
	}
	
	boolean calcoloPromozione() {
		
		boolean esito;
		
		if(percentualeAssenze < 25 && mediaVoti >= 2) {
			
			esito = true;
			
		}else if(percentualeAssenze < 50 && mediaVoti > 2) {
			
			esito = true;
			
		}else {
			
			esito = false;
			
		}
		
		return esito;
		
	}
	
}
