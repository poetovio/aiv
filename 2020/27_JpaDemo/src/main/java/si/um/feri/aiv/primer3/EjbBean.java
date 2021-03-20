package si.um.feri.aiv.primer3;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "ejbTri")
public class EjbBean implements Ejb {

	Logger log=LoggerFactory.getLogger(EjbBean.class);
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Oseba najdi(int id) {
		log.info("EjbBean: najdi(id)");
		return em.find(Oseba.class, id);
	}

	@Override
	public Oseba shrani(Oseba o) {
		log.info("EjbBean: shrani");
		for (Kontakt k :o.getKontakti())
			em.persist(k);
		em.persist(o);
		return o;
	}
	
	@Override
	public void akcija(int id) {
		log.info("EjbBean: akcija");
		
		Oseba o2=najdi(id);
		log.info(o2.toString());
		for (Kontakt k :o2.getKontakti())
			log.info(k.toString());
	}

}
