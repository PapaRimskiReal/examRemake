package examRemake.Service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examRemake.Service.Destytojas_ir_EgzaminasService;
import examRemake.domain.Destytojas_ir_Egzaminas;
import examRemake.domain.repository.Destytojas_ir_EgzaminasRepository;

@Service
public class Destytojas_ir_EgzaminasServiceImpl implements Destytojas_ir_EgzaminasService {

	@Autowired
	SessionFactory factory;

	@Autowired
	private Destytojas_ir_EgzaminasRepository destytojas_ir_EgzaminasRepository;
	
	public List<Destytojas_ir_Egzaminas> getAllDestytojas_ir_Egzaminas() {
		return destytojas_ir_EgzaminasRepository.getAllDestytojas_ir_Egzaminas();
	}

}
