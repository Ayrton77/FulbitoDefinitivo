package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Llave;

public interface LlaveService {
	
	public void crearLlave(Fecha fecha);
	
	public List<Llave> mostrarListDeLlavesporId(Long idFecha);
	
	public void eliminarUnaLlave(Long idLlave);
	
	public Llave MOSTRARUnaLlavePorID(Long idLlave);
	
    public List<Equipo> traerlistaDeEquiposTorneoLlave(Long IdTorneo);
	
	public void setearEquiposLlaves(Long idTorneo,Long idLlave);
	
	public List<Equipo> mostrarEquiposLlaves(Long idLlave);

}
