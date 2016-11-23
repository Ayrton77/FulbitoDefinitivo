package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.dao.RegistroLoginDao;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

@Service("registroLoginService")
@Transactional
public class RegistroLoginServiceImpl implements RegistroLoginService{
	
	@Inject
	private RegistroLoginDao registroLoginDao;
	//crear
	@Override
	public void crearUsuario(String nombreUsuario, String mailUsuario, String ContraseñaUsuario) throws Exception {
		
		if(registroLoginDao.verSiExisteUsuarioEnBDD(mailUsuario)==true)
		{
			throw new Exception("El mail "+ mailUsuario +"ya esta en uso");
		}
		else
		{
			registroLoginDao.agregarUnUsuarioLoguiadoALaBDD(nombreUsuario, mailUsuario, ContraseñaUsuario);
		}
	}
	//mostar uns usuario por mail
	@Override
	public UsuarioLoguiado buscarUnUsuarioPorMail(String mailUsuario) {

		return registroLoginDao.traerUnUsuarioPorMail(mailUsuario);
	}
	//vaalidar login
	@Override
	public UsuarioLoguiado validarLogin(String mailUsuario, String contraseñaUsuario) throws Exception {

		UsuarioLoguiado usuarioTratado=registroLoginDao.traerUnUsuarioPorMail(mailUsuario);
		if(usuarioTratado==null)
		{
			throw new Exception("El usuario que buscar no exite");
		}
		else
		{
			if(usuarioTratado.getContraseñaUsuarioLoguiadom().equals(contraseñaUsuario))
			{
				return usuarioTratado;
			}
			else
			{
				throw new Exception("Contraseña Incorrecta");
			}
		}
	}
}
