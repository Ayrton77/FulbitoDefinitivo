package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface ABMEquipoService {
	
	public void crearUnEquipo(String nombreEquipo,Torneo torneo);

	public List<Equipo> mostrarListaDeEquiposDeUnTorneo(Long idTorneo);
	
	public void eliminarUnEquipoDeUnTorneo(Long idEquipo);
	
	public Torneo mostrarUnTorneoPorId(Long idTorneo);
	
	public void modificarEquipo(String nuevoNombre,Long idEquipo);
}
