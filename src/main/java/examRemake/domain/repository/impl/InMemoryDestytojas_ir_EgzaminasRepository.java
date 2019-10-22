package examRemake.domain.repository.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import examRemake.domain.Destytojas_ir_Egzaminas;
import examRemake.domain.repository.Destytojas_ir_EgzaminasRepository;

@Repository
public class InMemoryDestytojas_ir_EgzaminasRepository implements Destytojas_ir_EgzaminasRepository {

	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Destytojas_ir_Egzaminas> getAllDestytojas_ir_Egzaminas() {
		
		Session session = factory.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Destytojas_ir_Egzaminas> cr = cb.createQuery(Destytojas_ir_Egzaminas.class);
		Root<Destytojas_ir_Egzaminas> root = cr.from(Destytojas_ir_Egzaminas.class);
		cr.select(root);
		Query<Destytojas_ir_Egzaminas> query = session.createQuery(cr);
		List<Destytojas_ir_Egzaminas> listAllDestytojas_ir_Egzaminas = query.getResultList();
				
		return listAllDestytojas_ir_Egzaminas;
	}

}
