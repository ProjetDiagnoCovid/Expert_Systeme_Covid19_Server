package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.io.Serializable;

public class Etatpandemie implements Serializable {
	private int id;
	private String etat;
	
	public Etatpandemie(String etat) {
		this.etat = etat;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
	

}
