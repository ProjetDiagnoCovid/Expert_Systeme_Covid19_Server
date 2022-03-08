package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.io.Serializable;

public class Historique_fiche implements Serializable {
	private int id;
	private Client client;
	
	public Historique_fiche(int id, Client client) {
		super();
		this.id = id;
		this.client = client;
	}
	
	

}
