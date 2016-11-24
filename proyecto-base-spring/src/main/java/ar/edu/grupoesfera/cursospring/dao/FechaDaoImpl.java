package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("fechaDao")
@Transactional
public class FechaDaoImpl extends SpringTest implements FechaDao{

	//buco par
	@Override
	public Partido buscarPartidoPorId(Long idPartido) {
		return getSession().get(Partido.class, idPartido);
		
	}
	
	//creo fecha
	@Override
	public void crearFecha(Torneo torneo) {
		System.out.println("crear");
		Fecha nuevaFecha=new Fecha();
		nuevaFecha.setTorneoFecha(torneo);
		getSession().save(nuevaFecha);
		
	}
	//list fechas
	@Override
	public List<Fecha> mostrarListaDeFechasPorTorneo(Long idTorneo) {
		Long idTorneo2=idTorneo;
		final List<Fecha> listaDeFechas=getSession().createCriteria(Fecha.class).
				add(Restrictions.eq("torneoFecha",getSession().get(Torneo.class, idTorneo2)
						)).list();
		
		
		return listaDeFechas;
	}
	//una fecha det
	@Override
	public Fecha trearUnaFechaPorId(Long idFecha) {
		System.out.println("fecha");
		return getSession().get(Fecha.class,idFecha);
	}
	//traer 1 torneo
	@Override
	public Torneo traerUnTorneoPorId(Long idTorneo) {
		return getSession().get(Torneo.class, idTorneo);
	}
	//lista partidos
	@Override
	public List<Partido> mostarListaDePartidosPorFecha(Long idFecha) {
		Long idFecha2=idFecha;
		final List<Partido> listaDePartidos=getSession().createCriteria(Partido.class).
				add(Restrictions.eq("fecha",getSession().get(Fecha.class, idFecha2)
						)).list();
		
		
		return listaDePartidos;
	}
	//crearpartido
	@Override
	public void crearPartidoXFechaser(Fecha fecha) {
		Partido partidoNuevo=new Partido();
		partidoNuevo.setFecha(fecha);
		getSession().save(partidoNuevo);
		
	}
}
