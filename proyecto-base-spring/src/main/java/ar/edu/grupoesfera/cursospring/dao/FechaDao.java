package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface FechaDao {
	
	
	
	public Partido buscarPartidoPorId(Long idPartido);
	
	public void crearFecha(Torneo torneo);
	
	public List<Fecha> mostrarListaDeFechasPorTorneo(Long idTorneo);
	
	public Fecha trearUnaFechaPorId(Long idFecha);
	
	public Torneo traerUnTorneoPorId(Long idTorneo);
	
	public List<Partido> mostarListaDePartidosPorFecha(Long idFecha); 
	
	public void crearPartidoXFechaser(Fecha fecha);
}
