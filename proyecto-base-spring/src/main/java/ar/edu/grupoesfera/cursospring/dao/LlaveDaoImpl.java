package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Llave;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("llaveDaoImpl")
@Transactional
public class LlaveDaoImpl extends SpringTest  implements LlaveDao {
	
	
	
	//crear
	@Override
	public void agregarLlaveALaBDD(Fecha fecha) {
		
		Llave llaveAGuardar=new Llave();
		llaveAGuardar.setFecha(fecha);
		getSession().save(llaveAGuardar);
		
	}
	//lista de llaves
	@Override
	public List<Llave> mostrarListDeLlavesBDDPorId(Long idFecha) {
		Long idFecha2=idFecha;
		final List<Llave> listDeLlaves=getSession().createCriteria(Llave.class).
				add(Restrictions.eq("fecha",getSession().get(Fecha.class, idFecha2)
						)).list();
		return listDeLlaves;
	}
	//eliminarllave
	@Override
	public void eliminarUnaLlaveDeLaBDD(Long idLlave) {
		
		getSession().delete(getSession().get(Llave.class, idLlave));
		
	}
	//traer una llave
	@Override
	public Llave traerUnaLlaveDeLaBDD(Long idLlave) {

		return getSession().get(Llave.class, idLlave);
		
	}
	//traer equipois de torneo
	@Override
	public List<Equipo> traerlistaDeEquiposTorneoLlave(Long IdTorneo) {
		Long idTorneo2=IdTorneo;
		final List<Equipo> listaDeEquipos=getSession().createCriteria(Equipo.class).
				add(Restrictions.eq("torneo",getSession().get(Torneo.class, idTorneo2)
						)).list();
		return listaDeEquipos;
	}
	//setearEquipoLlaves
	@Override
	public void setearEquiposLlaves(Long idTorneo,Long idLlave) {
		
		List<Equipo> equiposTorneo=traerlistaDeEquiposTorneoLlave(idTorneo);
		Llave llaveAsignada=getSession().get(Llave.class, idLlave);
		for(Equipo each:equiposTorneo)
		{
			each.setLlave(llaveAsignada);
		}
		
		
	}
	//MOSTRAR Equipos para llaves
	@Override
	public List<Equipo> mostrarEquiposLlaves(Long idLlave) {
		Long idLlave2=idLlave;
		final List<Equipo> listaDeEquipos=getSession().createCriteria(Equipo.class).
				add(Restrictions.eq("llave",getSession().get(Llave.class, idLlave2)
						)).list();
		return listaDeEquipos;
	}
}
