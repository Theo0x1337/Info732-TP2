
public class Casque {
	
	int id;
	String grade;
	String etat;
	String forme;
	
	
	public Casque(int identifiant, String grade, String etat, String forme ) {
		this.id = identifiant;
		this.grade = grade;
		this.etat = etat;
		this.forme = forme;
		
		
	}
	
	public boolean dejaEnregistrer(int id , Musee Musee) {
		boolean verif = false;
		for (Integer i : Musee.listeCasque.keySet()) {
			if (i== id) {
				verif= true;
			}
			
		}
		return verif;
		

	}
	
	
	public void ajoutMusee(int id, Musee Musee) {
		if (dejaEnregistrer(id, Musee) == false) {
			Musee.listeCasque.put(id, false);
		}
		System.out.println("Ajout du casque dans le musée");
		
	}
	
	
	public boolean casqueActif(int id, Musee Musee){
	
		boolean actif = false;
			if(Musee.listeCasque.containsKey(id)) {
				actif = Musee.listeCasque.get(id);
			
				
						
			}
		return actif;
		
		
	}
	
}

	
