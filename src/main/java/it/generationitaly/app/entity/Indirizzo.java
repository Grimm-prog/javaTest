package it.generationitaly.app.entity;

public class Indirizzo {

	private int id;
	private String citta;
	private String via;
	private String civico;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCivico() {
		return civico;
	}

	public void setCivico(String civico) {
		this.civico = civico;
	}

	@Override
	public String toString() {
		return "Indirizzo [id=" + id + ", citta=" + citta + ", via=" + via + ", civico=" + civico + "]";
	}

}
