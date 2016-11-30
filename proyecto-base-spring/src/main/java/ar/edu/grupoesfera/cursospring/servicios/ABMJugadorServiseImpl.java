package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.ABMJugadorDao;
import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;

@Service("abmjugador")
@Transactional

public class ABMJugadorServiseImpl  implements ABMJugadorServise{
	
	@Inject
	private ABMJugadorDao ABMjugadorDao;

	//agrego jug
	@Override
	
	public void agregarJugador(String nombreDeJugador,Equipo equipoJugador,Long idTorneo ) {
		ABMjugadorDao.guardarUnJugadorEnLaBDD(nombreDeJugador, equipoJugador,idTorneo);
		
	}
	//elimino jugador
	@Override
	public void eliminarJugadorPorid(Long idJugador) {
		
		ABMjugadorDao.borrarUnJugadorDeLaBDD(idJugador);
		
	}
	//modificar un jugador por id
	public void modificarUnJugadorPorID(Long idJugador, String nombreNuevo) {
		
		ABMjugadorDao.modificarUnJugadorDeLaBDD(idJugador, nombreNuevo);
		
	};
	//muestro lista de juga por id de equ
	@Override
	
	public List<Jugador> mostrarUnaListaDeJugadoresPorIdDeEquipo(Long idEquipo) {
		return 	ABMjugadorDao.mostrarListaDeJugadoresDeUnEquipoPorID(idEquipo);

		
	}
	//traer un jugador por id
	@Override
	public Jugador mostrarUnJugadorPorId(Long idDelJugador) {
		return ABMjugadorDao.mostrarUnJugadorPorId(idDelJugador);
	}
	
}
