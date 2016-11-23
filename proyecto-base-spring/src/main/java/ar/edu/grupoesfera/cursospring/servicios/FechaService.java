package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface FechaService {
	
	public void agregarFecha(Torneo torneo);
	
	public List<Fecha> mostrarListaDeFechasDeUnTorneoPorId(Long idTorneo);

	public Torneo mostrarUnTorneoPorId(Long idTorneo);
	
	public Fecha mostrarUnaFechaPorId(Long idFecha); 

}
