package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

public interface RegistroLoginService {
	
	
	
	public void crearUsuario(String nombreUsuario,String mailUsuario,String ContraseñaUsuario)throws Exception;
	
	public UsuarioLoguiado buscarUnUsuarioPorMail(String mailUsuario);
	
	public UsuarioLoguiado validarLogin(String mailUsuario,String contraseñaUsuario)throws Exception;
}
