package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Equipo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipo;
	
	@Column
	private String nombreEquipo;
	
	
	//bdd lista de jugadores
	
		@Column
		@OneToMany (mappedBy="equipo", cascade=CascadeType.ALL)
	    private List <Jugador> listaDeJugadores = new ArrayList <> ();
	//BDD CON TORNEO
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idTorneo")
		private Torneo torneo;
	//bdd con llave
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idLlave")
		private Llave llave;
		
		//--------constructor---------//
		public Equipo() {
			
			
		}
		//----------------gt------------//

		public Long getIdEquipo() {
			return idEquipo;
		}


		public void setIdEquipo(Long idEquipo) {
			this.idEquipo = idEquipo;
		}


		public String getNombreEquipo() {
			return nombreEquipo;
		}


		public void setNombreEquipo(String nombreEquipo) {
			this.nombreEquipo = nombreEquipo;
		}


		public List<Jugador> getListaDeJugadores() {
			return listaDeJugadores;
		}


		public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
			this.listaDeJugadores = listaDeJugadores;
		}

		public Torneo getTorneo() {
			return torneo;
		}

		public void setTorneo(Torneo torneo) {
			this.torneo = torneo;
		}

		public Llave getLlave() {
			return llave;
		}

		public void setLlave(Llave llave) {
			this.llave = llave;
		}
		
		
		
		
}
