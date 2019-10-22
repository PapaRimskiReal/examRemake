package examRemake.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "studentas")
public class Studentas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studento_id;
	private int TeisinguAtsakymuKiekis;
		
	@ManyToOne()
 	@JoinColumn(name = "egzamino_pavadinimas")
	private Destytojas_ir_Egzaminas destytojas_ir_egzaminas;

	public Studentas() {
		
	}

	public Studentas(String studento_id, int TeisinguAtsakymuKiekis) {
		
		this.studento_id = studento_id;
		this.TeisinguAtsakymuKiekis = TeisinguAtsakymuKiekis;
	}

	public Destytojas_ir_Egzaminas getDestytojas_ir_egzaminas() {
		return destytojas_ir_egzaminas;
	}

	public void setDestytojas_ir_egzaminas(Destytojas_ir_Egzaminas destytojas_ir_egzaminas) {
		this.destytojas_ir_egzaminas = destytojas_ir_egzaminas;
	}

	public int getId() {
		return id;
	}

	public String getStudento_id() {
		return studento_id;
	}

	public void setStudento_id(String studento_id) {
		this.studento_id = studento_id;
	}

	public int getTeisinguAtsakymuKiekis() {
		return TeisinguAtsakymuKiekis;
	}

	public void setTeisinguAtsakymuKiekis(int teisinguAtsakymuKiekis) {
		TeisinguAtsakymuKiekis = teisinguAtsakymuKiekis;
	}
	
	
}
