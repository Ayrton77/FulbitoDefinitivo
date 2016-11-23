package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Llave;

public interface LlaveDao {
	
	public void agregarLlaveALaBDD(Fecha fecha);
	
	public List<Llave> mostrarListDeLlavesBDDPorId(Long idFecha);
	
	public void eliminarUnaLlaveDeLaBDD(Long idLlave);
	
	public Llave traerUnaLlaveDeLaBDD(Long idLlave);

	public List<Equipo> traerlistaDeEquiposTorneoLlave(Long IdTorneo);
	
	public void setearEquiposLlaves(Long idTorneo,Long idLlave);
	
	public List<Equipo> mostrarEquiposLlaves(Long idLlave);
}
