package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

public interface ABMTorneoDao {
	
	public void guardarUnTorneoEnLaBDD(String nombreDelTorneo,UsuarioLoguiado usuario);
	
	public List<Torneo> traerListaDeToneowsDeUnUsuarioBDD(Long idUsuario);
	
	public void eliminarUnTorneoDeLaBDD(Long idTorneo);
	
	public UsuarioLoguiado traerUnUsuarioPorId(Long idUsuario);
	
	public void modificarUnTorneoDeLaBDD(String nuevoNombreTorneo,Long idTorneo);
}
