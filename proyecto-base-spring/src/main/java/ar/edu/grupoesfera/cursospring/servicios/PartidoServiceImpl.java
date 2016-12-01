package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.PartidoDao;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("PartidoService")
@Transactional
public class PartidoServiceImpl implements PartidoService{

	@Inject
	private PartidoDao partidoDao;
	
	@Override
	public Equipo traerUnEquipoPorIdS(Long idEquipo) {
		return partidoDao.traerUnEquipoPorId(idEquipo);
	}

	@Override
	public Partido buscarPartidoporIdS(Long idPartido) {
		return partidoDao.buscarPartidoporId(idPartido);
	}

	@Override
		public void crearPartido(Fecha fecha) {
			partidoDao.crearPartido(fecha);
			
		}	
	
	@Override
	public void agreagarEquiposAlPatido(Long idEquipo1, Long idEquipo2, Long idPartido) {
		partidoDao.agreagarEquiposAlPatido(idEquipo1, idEquipo2, idPartido);
		
	}

	@Override
	public List<Equipo> listaDeEquiposEnPartidoS(Long idPartido) {
		return partidoDao.listaDeEquiposEnPartido(idPartido);
	}
	
	@Override
	public List<Equipo> listaDeEquposTorneoIdTorneo(Long idTorneo) {
		return partidoDao.listaDeEquposTorneoIdTorneo(idTorneo);
	}
	
	@Override
	public Torneo traerUnTorneoPorId(Long idTorneo) {
		return partidoDao.traerUnTorneoPorId(idTorneo);
	}
	@Override
	public List<Jugador> listaDeJugadoresXequipo(Long idEquipo) {
		return partidoDao.listaDeJugadoresXequipo(idEquipo);
	}
	@Override
	public void agregarGol(Integer numeroEqupo, Long idPartido) {
		partidoDao.agregarGol(numeroEqupo, idPartido);
		
	}
	@Override
	public void quitarGol(Integer numeroEqupo, Long idPartido) {
		partidoDao.quitarGol(numeroEqupo, idPartido);
		
	}
	@Override
	public void establecerResultado(Long idPartido, Long idEquipo1, Long idEquipo2) {
		partidoDao.establecerResultado(idPartido, idEquipo1, idEquipo2);
		
	}
	@Override
	public Equipo traerEquipoGanador(Long idPartido) {
		return partidoDao.traerEquipoGanador(idPartido);
	}
	@Override
	public Equipo traerEquipoPerdedor(Long idPartido) {
		return partidoDao.traerEquipoPerdedor(idPartido);
	}
	@Override
	public void eliminarEquipoPerdedor(Long idEquipoPerdedor) {
		partidoDao.eliminarEquipoPerdedor(idEquipoPerdedor);
	}

	@Override
	public void agregaGolJugador(Long idJugador) {
		partidoDao.agregaGolJugador(idJugador);
		
	}

	@Override
	public void quitarGolJugador(Long idJugador) {
		partidoDao.quitarGolJugador(idJugador);
	}

	@Override
	public void agregaAmarillaJugador(Long idJugador) {
		partidoDao.agregaAmarillaJugador(idJugador);
		
	}

	@Override
	public void quitarAmarillaJugador(Long idJugador) {
		partidoDao.quitarAmarillaJugador(idJugador);
		
	}

	@Override
	public void agregaRojaJugador(Long idJugador) {
		partidoDao.agregaRojaJugador(idJugador);
		
	}

	@Override
	public void quitarRojaJugador(Long idJugador) {
		partidoDao.quitarRojaJugador(idJugador);
		
	}
	@Override
	public List<Jugador> traerGoleadores(Long idTorneo) {
		return partidoDao.traerGoleadores(idTorneo);
	}

	@Override
	public void setearDisponibilidad(Long idEquipo) {
		partidoDao.setearDisponibilidad(idEquipo);
		
	}

	@Override
	public List<Jugador> traerJugadoresDisponibles(Long IdEquipo) {
		return partidoDao.traerJugadoresDisponibles(IdEquipo);
	}
}

