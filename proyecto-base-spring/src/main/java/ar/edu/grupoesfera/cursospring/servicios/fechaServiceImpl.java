package ar.edu.grupoesfera.cursospring.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.FechasDao;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("fechaService")
@Transactional
public class fechaServiceImpl implements FechaService {
	
	//crear
	@Inject
	private FechasDao fechaDao;
	
	@Inject
	private ABMEquipoService ABMEquiposService;
	
	@Override
	public void agregarFecha(Torneo torneo) {
		fechaDao.agregarFechaALaBDD(torneo);		
	}
	//mostar
	@Override
	public List<Fecha> mostrarListaDeFechasDeUnTorneoPorId(Long idTorneo) {
		return fechaDao.traerListaDeFechasDeLaBDDPorIdDeTorneo(idTorneo);
	}
	//1 solo torneo
	@Override
	public Torneo mostrarUnTorneoPorId(Long idTorneo) {
		return fechaDao.traerUnTorneoDeLaBDDPorId(idTorneo);
	}
	//traer Una fecha
	@Override
	public Fecha mostrarUnaFechaPorId(Long idFecha) {
		return fechaDao.traerUnaFechaPorId(idFecha);
	}
	
}
