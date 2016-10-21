package model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "Alunno")
public class Studente extends Persona {
	
	private double media;
	
	public Studente() {
		super();
	}

	public Studente(String nome, String cognome,double media) {
		super(nome, cognome);
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}


}
