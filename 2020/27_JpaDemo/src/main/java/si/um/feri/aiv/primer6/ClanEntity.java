package si.um.feri.aiv.primer6;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClanEntity extends Clan implements Serializable {
	
	private static final long serialVersionUID = -7037212818278577394L;

	private int id;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
