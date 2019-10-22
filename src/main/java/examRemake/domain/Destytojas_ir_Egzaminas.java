package examRemake.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "destytojas_ir_egzaminas", uniqueConstraints = @UniqueConstraint(columnNames = {"egzamino_pavadinimas"}))
public class Destytojas_ir_Egzaminas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String egzamino_pavadinimas;
	private String login;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "destytojas_ir_egzaminas")
	private List<Egzaminas> egzaminas = new ArrayList<Egzaminas>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "destytojas_ir_egzaminas")
	private List<Studentas> studentas = new ArrayList<Studentas>();

	public Destytojas_ir_Egzaminas() {
		
	}

	public Destytojas_ir_Egzaminas(String egzamino_pavadinimas, String login) {
		this.egzamino_pavadinimas = egzamino_pavadinimas;
		this.login = login;
	}

	public String getEgzamino_pavadinimas() {
		return egzamino_pavadinimas;
	}

	public void setEgzamino_pavadinimas(String egzamino_pavadinimas) {
		this.egzamino_pavadinimas = egzamino_pavadinimas;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public List<Egzaminas> getEgzaminas() {
		return egzaminas;
	}

	public void setEgzaminas(List<Egzaminas> egzaminas) {
		this.egzaminas = egzaminas;
	}

	public List<Studentas> getStudentas() {
		return studentas;
	}

	public void setStudentas(List<Studentas> studentas) {
		this.studentas = studentas;
	}
	
	
}
