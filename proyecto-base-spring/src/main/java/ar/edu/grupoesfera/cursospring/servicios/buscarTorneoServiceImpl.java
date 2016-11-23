package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.buscarTorneoDAO;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;

@Service("buscarTorneoService")
@Transactional
public class buscarTorneoServiceImpl implements buscarTorneoService {
	
	@Inject
	 private buscarTorneoDAO buscarTorneoDAO;
	
	@Override
	public List<Equipo> buscarTorneo(String nombreTorneo) {
		return buscarTorneoDAO.buscarTorneoBDD(nombreTorneo);
	}
}
