package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface ABMEquipoDao {
	
	public void guardarUnquipoEnLaBDD(String nombreEquipo,Torneo torneo);
	
	public List<Equipo> traerListaDeEquiposDeUnTorneoBDD(Long idTorneo);
	
	public void eliminarUnEquipoDeLaBDD(Long idEquipo);
	
	public Torneo traerUnTorneoPorId(Long IdTorneo);
	
	public void modificarUnEquipoDeLaBDD(String nuevoNombreEquipo,Long IdEquipo);
}
