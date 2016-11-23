package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("abmEquipoDao")
@Transactional
public class ABMEquipoDaoImpl extends SpringTest implements ABMEquipoDao{

	//crear eq
	@Override
	public void guardarUnquipoEnLaBDD(String nombreEquipo, Torneo torneo) {

		Equipo equipoAGuardar=new Equipo();
		equipoAGuardar.setNombreEquipo(nombreEquipo);
		equipoAGuardar.setTorneo(torneo);
		
		getSession().save(equipoAGuardar);
	}
	
	//lista
	@Override
	public List<Equipo> traerListaDeEquiposDeUnTorneoBDD(Long idTorneo) {
		Long idTorneo2=idTorneo;
		final List<Equipo> listaDeEquipos=getSession().createCriteria(Equipo.class).
				add(Restrictions.eq("torneo",getSession().get(Torneo.class, idTorneo2)
						)).list();
		
		
		return listaDeEquipos;
	}
	//eliminar
	@Override
	public void eliminarUnEquipoDeLaBDD(Long idEquipo) {
		
		getSession().delete(getSession().get(Equipo.class, idEquipo));

		
	}
	//traerTorneo
	@Override
	public Torneo traerUnTorneoPorId(Long IdTorneo) {
		return getSession().get(Torneo.class, IdTorneo);
	}
	
	//modificar
	@Override
	public void modificarUnEquipoDeLaBDD(String nuevoNombreEquipo, Long IdEquipo) {
		Equipo EquipoEditado=getSession().get(Equipo.class, IdEquipo);
		EquipoEditado.setNombreEquipo(nuevoNombreEquipo);
	}
}
