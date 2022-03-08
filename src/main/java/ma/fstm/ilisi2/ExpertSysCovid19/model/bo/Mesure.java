package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.io.Serializable;

public abstract class Mesure implements Serializable{
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract int getValeur();

}
