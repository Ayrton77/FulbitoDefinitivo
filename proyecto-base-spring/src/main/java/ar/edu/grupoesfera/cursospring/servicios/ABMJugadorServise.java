package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import ar.edu.grupoesfera.cursospring.dao.ABMJugadorDao;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;

public interface ABMJugadorServise {
	
	
	public void agregarJugador(String nombreDeJugador,Equipo equipoJugador );
	
	public void eliminarJugadorPorid(Long idJugador);
	
	public void modificarUnJugadorPorID(Long idJugador,String nombreNuevo);
	
	public List<Jugador> mostrarUnaListaDeJugadoresPorIdDeEquipo(Long idEquipo);
	
	public Jugador mostrarUnJugadorPorId(Long idDelJugador);
}
