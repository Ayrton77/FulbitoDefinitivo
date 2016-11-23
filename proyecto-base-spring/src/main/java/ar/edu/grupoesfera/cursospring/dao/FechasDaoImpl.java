package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

@Service("fechadsDao")
@Transactional
public class FechasDaoImpl extends SpringTest implements FechasDao {
	
	//crear
	@Override
	public void agregarFechaALaBDD(Torneo torneo) {
		Fecha fechaAGuardar=new Fecha();
		fechaAGuardar.setTorneoFecha(torneo);
		getSession().save(fechaAGuardar);
	}
	//traer
	@Override
	public List<Fecha> traerListaDeFechasDeLaBDDPorIdDeTorneo(Long idTorneo) {
		Long idTorneo2=idTorneo;
		final List<Fecha> listaDeFechas=getSession().createCriteria(Fecha.class).
				add(Restrictions.eq("torneoFecha",getSession().get(Torneo.class, idTorneo2)
						)).list();
		
		
		return listaDeFechas;
	}
	//traer1 torneo
	@Override
	public Torneo traerUnTorneoDeLaBDDPorId(Long idTorneo) {
		return getSession().get(Torneo.class, idTorneo);
	}
	//traer una fechapor id
@Override
	public Fecha traerUnaFechaPorId(Long idFecha) {
		return getSession().get(Fecha.class, idFecha);
	}	
}
