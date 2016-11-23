package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.ABMTorneoDao;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

@Service("ABMTorneoService")
@Transactional
public class ABMTorneoServiceImpl implements ABMTorneoService{
	@Inject
	private ABMTorneoDao ABMTorneoDao;
	
	@Override
	public void crearUnTorneo(String nombreDelTorneo, UsuarioLoguiado usuario) {

		ABMTorneoDao.guardarUnTorneoEnLaBDD(nombreDelTorneo, usuario);
		
	}

	@Override
	public List<Torneo> mostrarListaDeEquiposDeUnUsuario(Long idUsuario) {
		return ABMTorneoDao.traerListaDeToneowsDeUnUsuarioBDD(idUsuario);
	}

	@Override
	public void eliminarUnTorneo(Long idTorneo) {
		ABMTorneoDao.eliminarUnTorneoDeLaBDD(idTorneo);
		
		
	}

	@Override
	public UsuarioLoguiado mostrarUnUsuarioPorId(Long idUsuario) {
		return mostrarUnUsuarioPorId(idUsuario);
	}

	@Override
	public void modificarUnTorneo(String nuevoNombreTorneo, Long idTorneo) {
		ABMTorneoDao.modificarUnTorneoDeLaBDD(nuevoNombreTorneo, idTorneo);
		
	}

}
