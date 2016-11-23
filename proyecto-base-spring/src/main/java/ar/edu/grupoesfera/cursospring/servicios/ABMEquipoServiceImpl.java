package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.ABMEquipoDao;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("abmEquipoService")
@Transactional
public class ABMEquipoServiceImpl implements ABMEquipoService{

	@Inject
	private ABMEquipoDao ABMEquipoDao;
	//crear
	@Override
	public void crearUnEquipo(String nombreEquipo, Torneo torneo) {
		ABMEquipoDao.guardarUnquipoEnLaBDD(nombreEquipo, torneo);
		
	}
	
	//lista
	@Override
	public List<Equipo> mostrarListaDeEquiposDeUnTorneo(Long idTorneo) {
		return ABMEquipoDao.traerListaDeEquiposDeUnTorneoBDD(idTorneo);
	}
	//eliminar
	@Override
	public void eliminarUnEquipoDeUnTorneo(Long idEquipo) {
		ABMEquipoDao.eliminarUnEquipoDeLaBDD(idEquipo);
		
	}
	//mostarTorneo
	@Override
	public Torneo mostrarUnTorneoPorId(Long idTorneo) {
		return ABMEquipoDao.traerUnTorneoPorId(idTorneo);
	}
	//modificar
	@Override
	public void modificarEquipo(String nuevoNombre, Long idEquipo) {
		ABMEquipoDao.modificarUnEquipoDeLaBDD(nuevoNombre, idEquipo);
		
	}
}
