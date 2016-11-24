package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

@Service("partidoDaoImpl")
@Transactional
public class PartidoDaoImpl extends SpringTest implements PartidoDao {
	
	//buscar equipo
	@Override
	public Equipo traerUnEquipoPorId(Long idEquipo) {
		return getSession().get(Equipo.class, idEquipo);
	}
	//buscar partido
	@Override
	public Partido buscarPartidoporId(Long idPartido) {
		return getSession().get(Partido.class, idPartido);

	}
	
	//crearPartido
	@Override
	public void crearPartido(Fecha fecha) {
		Partido p1=new Partido();
		p1.setFecha(fecha);
		
		getSession().save(p1);
		
	}
	//agreagr equipoos ap
	@Override
	public void agreagarEquiposAlPatido(Long idEquipo1, Long idEquipo2, Long idPartido) {
		
		traerUnEquipoPorId(idEquipo1).setPartido(buscarPartidoporId(idPartido));
		traerUnEquipoPorId(idEquipo2).setPartido(buscarPartidoporId(idPartido));

	}
	//mostarListaDeEquiposEnPartido
	@Override
	public List<Equipo> listaDeEquiposEnPartido(Long idPartido) {
		Long idPartido2=idPartido;
		final List<Equipo> listaDeEquiposPartido=getSession().createCriteria(Equipo.class).
				add(Restrictions.eq("partido",getSession().get(Partido.class, idPartido2)
						)).list();
		
		
		return listaDeEquiposPartido;
	}
	
	//1.agregra 1.2 eeuipos de 1 torneo
	@Override
	public List<Equipo> listaDeEquposTorneoIdTorneo(Long idTorneo) {
		Long idTorneo2=idTorneo;
		final List<Equipo> listaDeEquiposTorneo=getSession().createCriteria(Equipo.class).
				add(Restrictions.eq("torneo",getSession().get(Torneo.class, idTorneo2)
						)).list();
		
		
		return listaDeEquiposTorneo;
	}
	//traer 1 tornero
	@Override
	public Torneo traerUnTorneoPorId(Long idTorneo) {
		return getSession().get(Torneo.class,idTorneo);
	}
	//jugar
	//traer jug
	
	@Override
	public List<Jugador> listaDeJugadoresXequipo(Long idEquipo) {
	
	Long idEquipo2=idEquipo;
	final List<Jugador> listaDeJug=getSession().createCriteria(Jugador.class).
			add(Restrictions.eq("equipo",getSession().get(Torneo.class, idEquipo2)
					)).list();
	return listaDeJug;
	}
	//agregar Gol
	@Override
	public void agregarGol(Integer numeroEqupo, Long idPartido) {

		if(numeroEqupo==1){
			getSession().get(Partido.class, idPartido).setGolesEquipo1(
					getSession().get(Partido.class, idPartido).getGolesEquipo1()+1);
		}
		if(numeroEqupo==2)
		{
			getSession().get(Partido.class, idPartido).setGolesEquipo2(
					getSession().get(Partido.class, idPartido).getGolesEquipo2()+1);
		}
		
	}
	
	//quitar gol
	@Override
	public void quitarGol(Integer numeroEqupo, Long idPartido) {
	if(numeroEqupo==1){
		if(getSession().get(Partido.class, idPartido).getGolesEquipo1()!=0)
		{
			getSession().get(Partido.class, idPartido).setGolesEquipo1(
					getSession().get(Partido.class, idPartido).getGolesEquipo1()-1);
		}
	}
	if(numeroEqupo==2)
	{
		if(getSession().get(Partido.class, idPartido).getGolesEquipo1()!=0)
		{
			getSession().get(Partido.class, idPartido).setGolesEquipo2(
					getSession().get(Partido.class, idPartido).getGolesEquipo2()-1);
		}
	}
		
	}
	//resultado
	@Override
	public void establecerResultado(Long idPartido,Long idEquipo1,Long idEquipo2) {

		Integer goles1=getSession().get(Partido.class, idPartido).getGolesEquipo1();
		Integer goles2=getSession().get(Partido.class, idPartido).getGolesEquipo2();
		
		if(goles1>goles2)
		{

			getSession().get(Partido.class, idPartido).setEquipoGanador(getSession().get(Equipo.class, idEquipo1).getIdEquipo());
			getSession().get(Partido.class, idPartido).setEquipoPerdedor(getSession().get(Equipo.class, idEquipo2).getIdEquipo());
			
		}
		if(goles1<goles2)
		{
			getSession().get(Partido.class, idPartido).setEquipoPerdedor(getSession().get(Equipo.class, idEquipo1).getIdEquipo());
			getSession().get(Partido.class, idPartido).setEquipoGanador(getSession().get(Equipo.class, idEquipo2).getIdEquipo());
			
		}
			
		
	//tare eganador y perdedo
		
		
	}
	
		@Override
		public Equipo traerEquipoGanador(Long idPartido) {
			Long num=getSession().get(Partido.class, idPartido).getEquipoGanador();
			
			return getSession().get(Equipo.class,num );
		}
		@Override
		public Equipo traerEquipoPerdedor(Long idPartido) {
			Long idEquipo=getSession().get(Partido.class, idPartido).getEquipoPerdedor();
			return getSession().get(Equipo.class, idEquipo);
		}
		//eliminarPerdedor
		@Override
		public void eliminarEquipoPerdedor(Long idEquipoPerdedor) {

			getSession().delete(getSession().get(Equipo.class, idEquipoPerdedor));
			
		}
}
