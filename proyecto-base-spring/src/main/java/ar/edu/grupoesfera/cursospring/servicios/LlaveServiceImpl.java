package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.LlaveDao;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Llave;

@Service("llaveService")
@Transactional
public class LlaveServiceImpl implements LlaveService {

	@Inject
	private LlaveDao llaveDao;
	
	//crear
	@Override
	public void crearLlave(Fecha fecha) {
		llaveDao.agregarLlaveALaBDD(fecha);
	}
	//mostrar
	@Override
	public List<Llave> mostrarListDeLlavesporId(Long idFecha) {
		return llaveDao.mostrarListDeLlavesBDDPorId(idFecha);
	}
	//eli
	@Override
	public void eliminarUnaLlave(Long idLlave) {
		llaveDao.eliminarUnaLlaveDeLaBDD(idLlave);
		
	}
	//traer1llave
	@Override
	public Llave MOSTRARUnaLlavePorID(Long idLlave) {
		return llaveDao.traerUnaLlaveDeLaBDD(idLlave);
	}
	//listaequipostorneo
	@Override
	public List<Equipo> traerlistaDeEquiposTorneoLlave(Long IdTorneo) {
		return  llaveDao.traerlistaDeEquiposTorneoLlave(IdTorneo);
	}
	@Override
	public void setearEquiposLlaves(Long idTorneo, Long idLlave) {
		llaveDao.setearEquiposLlaves(idTorneo, idLlave);
	}
	@Override
	public List<Equipo> mostrarEquiposLlaves(Long idLlave) {
		return llaveDao.mostrarEquiposLlaves(idLlave);
	}
	
}
