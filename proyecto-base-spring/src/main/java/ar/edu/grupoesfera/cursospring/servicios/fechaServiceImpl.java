package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.FechaDao;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("fechaService")
@Transactional
public class FechaServiceImpl implements FechaService {

	@Inject
	private FechaDao fechaDao;
	
	@Override
	public Partido buscarPartidoPorId(Long idPartido) {
		return fechaDao.buscarPartidoPorId(idPartido);
	}

	@Override
	public void crearFecha(Torneo torneo) {
		fechaDao.crearFecha(torneo);
		
	}

	@Override
	public List<Fecha> mostrarListaDeFechasPorTorneo(Long idTorneo) {
		return fechaDao.mostrarListaDeFechasPorTorneo(idTorneo);
	}

	@Override
	public Fecha trearUnaFechaPorId(Long idFecha) {
		return fechaDao.trearUnaFechaPorId(idFecha);
	}
	
	@Override
	public Torneo traerUnTorneoPorId(Long idTorneo) {
		return fechaDao.traerUnTorneoPorId(idTorneo);
	}
	@Override
	public List<Partido> mostarListaDePartidosPorFecha(Long idFecha) {
		return fechaDao.mostarListaDePartidosPorFecha(idFecha);
	}
	@Override
	public void crearPartidoXFechaser(Fecha fecha) {
		fechaDao.crearPartidoXFechaser(fecha);
		
	}
}
