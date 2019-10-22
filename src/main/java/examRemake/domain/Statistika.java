package examRemake.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statistika")
public class Statistika {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String egzamino_pavadinimas;
	private int A;
	private int B;
	private int C;
	private int teisingiAtsakymai;
	private int uzduotaKlausimu;
	
	public Statistika() {
		
	}

	public Statistika(String egzamino_pavadinimas, int a, int b, int c, int teisingiAtsakymai, int uzduotaKlausimu) {
		this.egzamino_pavadinimas = egzamino_pavadinimas;
		A = a;
		B = b;
		C = c;
		this.teisingiAtsakymai = teisingiAtsakymai;
		this.uzduotaKlausimu = uzduotaKlausimu;
	}

	public String getEgzamino_pavadinimas() {
		return egzamino_pavadinimas;
	}

	public void setEgzamino_pavadinimas(String egzamino_pavadinimas) {
		this.egzamino_pavadinimas = egzamino_pavadinimas;
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getTeisingiAtsakymai() {
		return teisingiAtsakymai;
	}

	public void setTeisingiAtsakymai(int teisingiAtsakymai) {
		this.teisingiAtsakymai = teisingiAtsakymai;
	}

	public int getUzduotaKlausimu() {
		return uzduotaKlausimu;
	}

	public void setUzduotaKlausimu(int uzduotaKlausimu) {
		this.uzduotaKlausimu = uzduotaKlausimu;
	}

	public int getId() {
		return id;
	}
	
	
	
}
