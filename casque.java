
public class casque {
	
	int id;
	String grade;
	String etat;
	String forme;
	
	
	public casque(int identifiant, String grade, String etat, String forme ) {
		this.id = identifiant;
		this.grade = grade;
		this.etat = etat;
		this.forme = forme;
		
		
	}
	
	public boolean dejaEnregistrer(int id , musee Musee) {
		boolean verif = false;
		for (Integer i : Musee.listeCasque.keySet()) {
			if (i== id) {
				verif= true;
			}
			
		}
		return verif;
		

	}
	
	
	public void ajoutMusee(int id, musee Musee) {
		if (dejaEnregistrer(id, Musee) == false) {
			Musee.listeCasque.put(id, false);
		}
		System.out.println("Ajout du casque dans le musée");
		
	}
	

}

	
