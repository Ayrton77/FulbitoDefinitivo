package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Jugador {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Idjugador;
	
	@Column
	private String nombreJugador;
	
	
	//bdd--
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idEquipo")
		private Equipo equipo;
	
	//-const
	public Jugador() {

		
	}


	
	
	//gt

	
	public Long getIdjugador() {
		return Idjugador;
	}



	public Equipo getEquipo() {
		return equipo;
	}




	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}




	public void setIdjugador(Long idjugador) {
		Idjugador = idjugador;
	}



	public String getNombreJugador() {
		return nombreJugador;
	}



	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	
	
	
}
