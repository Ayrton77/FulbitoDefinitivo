package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.partidoDao;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;

@Service("partidoservicee")
@Transactional
public class PartidoServiceImpl implements partidoServise{

	//no ta el injec
	private partidoDao partidoDaoo;
	
	@Override
	public Equipo buscarUnEquipoPorId2(Long idEquipo) {
		return partidoDaoo.buscarUnEquipoPorId(idEquipo);
	}

	@Override
	public void agregarPartido2(Long idEquipo1, Long idEquipo2) {
		partidoDaoo.agregarPartido(idEquipo1, idEquipo2);
		
	}

}
