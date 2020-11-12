
public class Habitant {
	int nnig;
	String statusCivique;
	String spécialité;
	String voie;
	int numero;
	int poids;
	
	
	public Habitant (int nnig, String sc, String spe, String voie, int num, int poids){
		this.nnig = nnig;
		this.statusCivique = sc;
		this.spécialité = spe;
		this.voie = voie;
		this.numero = num;
		this.poids = poids;
	}
	
	public Casque RameneCasque(int Id,String grade, String etat, String forme) {
		
		Casque casque = new Casque(Id, grade, etat, forme );
		
		return casque;
	
		
		
	}
}
