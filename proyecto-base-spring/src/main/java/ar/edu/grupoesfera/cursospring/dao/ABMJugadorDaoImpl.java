package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("abmjugadordao")
@Transactional
public class ABMJugadorDaoImpl extends SpringTest implements ABMJugadorDao{
 

		
		
	
	
	
	//save jugador
	@Override
	
	public void guardarUnJugadorEnLaBDD(String nombreDeJugador,Equipo equipoJugador, Long idTorneo) {
		
		Jugador jugadorAGuardar=new Jugador();
		jugadorAGuardar.setNombreJugador(nombreDeJugador);
		jugadorAGuardar.setEquipo(equipoJugador);
		jugadorAGuardar.setTorneoJugador(getSession().get(Torneo.class, idTorneo));
		getSession().save(jugadorAGuardar);
	}
	//eliminarJugadordelabdd
	@Override
	public void borrarUnJugadorDeLaBDD(Long idJugador) {

		getSession().delete(getSession().get(Jugador.class, idJugador));;

		
	}
	//modificar Jugador
	public void modificarUnJugadorDeLaBDD(Long idJugador,String nuevoNombre) {
		
		getSession().get(Jugador.class, idJugador).setNombreJugador(nuevoNombre);
		
	};
	
	
	
	//mostar por iddeEquipo lista de jug
	@Override
	
	public List<Jugador> mostrarListaDeJugadoresDeUnEquipoPorID(Long idDelEquipo) {
		Long idEquipo=idDelEquipo;
		
		
		
		final List<Jugador> listaDeJugadores=getSession().createCriteria(Jugador.class).
				add(Restrictions.eq("equipo",getSession().get(Equipo.class, idEquipo)
						)).list();
		
		
		return listaDeJugadores;
	}
	//traer un jugador
	@Override
	public Jugador mostrarUnJugadorPorId(Long idDelJugador) {
		return getSession().get(Jugador.class, idDelJugador);
	}
}
