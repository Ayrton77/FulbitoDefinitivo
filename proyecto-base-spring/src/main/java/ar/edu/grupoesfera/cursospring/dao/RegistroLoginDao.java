package ar.edu.grupoesfera.cursospring.dao;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

public interface RegistroLoginDao {

		public void agregarUnUsuarioLoguiadoALaBDD(String nombreUsuario,String mailUsuario,String Contrase�aUsuario);
		
		public UsuarioLoguiado  traerUnUsuarioLoguiadoDeLaBDD(Long idUsuario);

		public Boolean verSiExisteUsuarioEnBDD(String MailUser);
		
		public UsuarioLoguiado traerUnUsuarioPorMail(String MailUser);
}
