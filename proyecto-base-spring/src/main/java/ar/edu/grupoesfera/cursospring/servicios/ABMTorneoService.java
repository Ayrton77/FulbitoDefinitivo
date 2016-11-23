package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

public interface ABMTorneoService {
	
	public void crearUnTorneo(String nombreDelTorneo,UsuarioLoguiado usuario);
	
	public List<Torneo> mostrarListaDeEquiposDeUnUsuario(Long idUsuario);
	
	public void eliminarUnTorneo(Long idTorneo);
	
	public UsuarioLoguiado mostrarUnUsuarioPorId(Long idUsuario);
	
	public void modificarUnTorneo(String nuevoNombreTorneo,Long idTorneo);

}
