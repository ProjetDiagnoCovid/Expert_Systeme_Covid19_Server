package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.io.Serializable;

public class Temperature extends Mesure implements Serializable{
	private int id;
	private int valeur;

	@Override
	public int getValeur() {
		return valeur;
	}
	public Temperature(int valeur) {
		this.valeur = valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
