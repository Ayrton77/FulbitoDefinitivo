package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;

public interface ABMJugadorDao {
	
	public void guardarUnJugadorEnLaBDD(String nombreDeJugador,Equipo equipoJugador);
	
	public void borrarUnJugadorDeLaBDD(Long idJugador);
	
	public void modificarUnJugadorDeLaBDD(Long idJugador,String nuevoNombre);
	
	public List<Jugador> mostrarListaDeJugadoresDeUnEquipoPorID(Long idDelEquipo);
	
	public Jugador mostrarUnJugadorPorId(Long idDelJugador);
	
}
