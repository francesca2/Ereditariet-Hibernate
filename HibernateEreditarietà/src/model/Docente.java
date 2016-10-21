package model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "Professore")
public class Docente extends Persona{
	
	
	private int stipendio;
	
	public Docente() {
		super();
	}

	public Docente(String nome, String cognome,int stipendio) {
		super(nome,cognome);
		this.stipendio = stipendio;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

}
