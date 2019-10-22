package examRemake.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "egzaminas")
public class Egzaminas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String klausimas;
	private String pirmas_atsakymas;
	private String antras_atsakymas;
	private String trecias_atsakymas;
	private String teisingas_atsakymas;
	
	@ManyToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "egzamino_id")
	private Destytojas_ir_Egzaminas destytojas_ir_egzaminas;

	public Egzaminas() {
		
	}

	public Egzaminas(String klausimas, String pirmas_atsakymas, String antras_atsakymas, String trecias_atsakymas,
			String teisingas_atsakymas) {
		
		this.klausimas = klausimas;
		this.pirmas_atsakymas = pirmas_atsakymas;
		this.antras_atsakymas = antras_atsakymas;
		this.trecias_atsakymas = trecias_atsakymas;
		this.teisingas_atsakymas = teisingas_atsakymas;
	}

	public String getKlausimas() {
		return klausimas;
	}

	public void setKlausimas(String klausimas) {
		this.klausimas = klausimas;
	}

	public String getPirmas_atsakymas() {
		return pirmas_atsakymas;
	}

	public void setPirmas_atsakymas(String pirmas_atsakymas) {
		this.pirmas_atsakymas = pirmas_atsakymas;
	}

	public String getAntras_atsakymas() {
		return antras_atsakymas;
	}

	public void setAntras_atsakymas(String antras_atsakymas) {
		this.antras_atsakymas = antras_atsakymas;
	}

	public String getTrecias_atsakymas() {
		return trecias_atsakymas;
	}

	public void setTrecias_atsakymas(String trecias_atsakymas) {
		this.trecias_atsakymas = trecias_atsakymas;
	}

	public String getTeisingas_atsakymas() {
		return teisingas_atsakymas;
	}

	public void setTeisingas_atsakymas(String teisingas_atsakymas) {
		this.teisingas_atsakymas = teisingas_atsakymas;
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
	
	
	
}
