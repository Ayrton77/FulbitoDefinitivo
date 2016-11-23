package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service
@Transactional
public class buscarTorneoDaoImpl extends SpringTest implements buscarTorneoDAO {
	
	@Override
	public List<Equipo> buscarTorneoBDD(String nombreTorneo) {
		String nombreTorneo2=nombreTorneo;
		final List<Equipo> listaDeTorneos=getSession().createCriteria(Torneo.class).
				add(Restrictions.like("nombreTorneo",nombreTorneo2+"%")
						).list();
		
		
		return listaDeTorneos;
	}
	
}
