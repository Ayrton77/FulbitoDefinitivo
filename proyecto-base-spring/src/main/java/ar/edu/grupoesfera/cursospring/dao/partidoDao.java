package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface PartidoDao {
	
	public Equipo traerUnEquipoPorId(Long idEquipo);
	
	public Partido buscarPartidoporId(Long idPartido);
	
	public void crearPartido(Fecha fecha);
	
	public void agreagarEquiposAlPatido(Long idEquipo1,Long idEquipo2,Long idPartido);
	
	public List<Equipo> listaDeEquiposEnPartido(Long idPartido);
	
	//agregar
	public List<Equipo> listaDeEquposTorneoIdTorneo(Long idTorneo);
	
	public Torneo traerUnTorneoPorId(Long idTorneo);
	
	//jugar
	public List<Jugador> listaDeJugadoresXequipo(Long idEquipo);
	
	public void agregarGol(Integer numeroEqupo,Long idPartido);
	
	public void quitarGol(Integer numeroEqupo,Long idPartido);
	
	public void establecerResultado(Long idPartido,Long idEquipo1,Long idEquipo2);
	
	public Equipo traerEquipoGanador(Long idPartido);
	
	public Equipo traerEquipoPerdedor(Long idPartido);
	
	public void eliminarEquipoPerdedor(Long idEquipoPerdedor);
	
	//--------Goles y tarjetas-------////
	//--------Goles y tarjetas-------////
		public void agregaGolJugador(Long idJugador);
		public void quitarGolJugador(Long idJugador);
		public void agregaAmarillaJugador(Long idJugador);
		public void quitarAmarillaJugador (Long idJugador);
		public void agregaRojaJugador(Long idJugador);
		public void quitarRojaJugador(Long idJugador);
		public List<Jugador> traerGoleadores(Long idTorneo);
}
