package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

@Service("ABMTorneoDao")
@Transactional

public class ABMTorneoDaoImpl extends SpringTest implements ABMTorneoDao {
	//agregar
	@Override
	public void guardarUnTorneoEnLaBDD(String nombreDelTorneo, UsuarioLoguiado usuario) {
		Torneo torneoAGuardar=new Torneo();
		torneoAGuardar.setNombreTorneo(nombreDelTorneo);
		torneoAGuardar.setUsuarioLoguiado(usuario);
		getSession().save(torneoAGuardar);
	}
	//lista
	@Override
	public List<Torneo> traerListaDeToneowsDeUnUsuarioBDD(Long idUsuario) {
		Long idUsuario2=idUsuario;
		final List<Torneo> listaDeTorneos=getSession().createCriteria(Torneo.class).
				add(Restrictions.eq("usuarioLoguiado",getSession().get(UsuarioLoguiado.class, idUsuario2)
						)).list();
		
		
		return listaDeTorneos;
	}
	
//eliminar
	@Override
	public void eliminarUnTorneoDeLaBDD(Long idTorneo) {
		getSession().delete(getSession().get(Torneo.class, idTorneo));

		
	}
//traer user
	@Override
	public UsuarioLoguiado traerUnUsuarioPorId(Long idUsuario) {
		return getSession().get(UsuarioLoguiado.class, idUsuario);
		

	}
//modif 
	@Override
	public void modificarUnTorneoDeLaBDD(String nuevoNombreTorneo, Long idTorneo) {
		Torneo torneoEditado=getSession().get(Torneo.class, idTorneo);
		torneoEditado.setNombreTorneo(nuevoNombreTorneo);
			
	}
 
}
