package si.um.feri.aiv.primer1;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Oseba implements Serializable {

	private static final long serialVersionUID = 9205530829658839428L;

	public Oseba() {
		this("", "","");
	}
	
	public Oseba(String ime, String priimek, String email) {
		this.email = email;
		this.ime = ime;
		this.priimek = priimek;
		datumVpisa=new GregorianCalendar();
	}
	
	private String email;
	private String ime;
	private String priimek;
	private Calendar datumVpisa;

	@Id
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPriimek() {
		return priimek;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public Calendar getDatumVpisa() {
		return datumVpisa;
	}

	public void setDatumVpisa(Calendar datumVpisa) {
		this.datumVpisa = datumVpisa;
	}
	
	private static SimpleDateFormat sdf=new SimpleDateFormat("dd. MM. yyyy HH:mm:ss");

	@Override
	public String toString() {
		return ime + " " + priimek + " ("+email+"); vpis: "+sdf.format(datumVpisa.getTime());
	}
	
}