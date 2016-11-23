package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;

@Service("registroLoginDao")
@Transactional
public class RegistroLoginDaoImpl extends SpringTest implements RegistroLoginDao{

	//agregar
	@Override
	public void agregarUnUsuarioLoguiadoALaBDD(String nombreUsuario, String mailUsuario, String ContraseñaUsuario) {

		UsuarioLoguiado usuarioAAgregar=new UsuarioLoguiado();
		usuarioAAgregar.setNombreUsuarioLoguiado(nombreUsuario);
		usuarioAAgregar.setMailUsuarioRegistrado(mailUsuario);
		usuarioAAgregar.setContraseñaUsuarioLoguiadom(ContraseñaUsuario);
		
		getSession().save(usuarioAAgregar);
	}
	//traerUser
	@Override
	public UsuarioLoguiado traerUnUsuarioLoguiadoDeLaBDD(Long idUsuario) {
		return getSession().get(UsuarioLoguiado.class, idUsuario);
	}
	//ver si existe por mail
	@Override
	public Boolean verSiExisteUsuarioEnBDD(String MailUser) {
		
		String mailUsuario=MailUser;
		
		final List<UsuarioLoguiado>usuarioBuscadorPorMail= getSession().createCriteria(UsuarioLoguiado.class).
				add(Restrictions.eq("mailUsuarioRegistrado",mailUsuario)
						).list();
		if(usuarioBuscadorPorMail.size()==0)
		{
			return false;
		}
		else {
			return true;
		}
	}
	//traer un jugador por mail
	@Override
	public UsuarioLoguiado traerUnUsuarioPorMail(String MailUser) {
		
		String mailUsuario=MailUser;
		
		final List<UsuarioLoguiado>users= getSession().createCriteria(UsuarioLoguiado.class).
				add(Restrictions.eq("mailUsuarioRegistrado",mailUsuario)
						).list();
		
		for(UsuarioLoguiado each:users)
		{
			if(each.getMailUsuarioRegistrado().equals(MailUser))
			{
				return each;
			}
			else
			{
				return null;
			}
		}
		return null;
	}
}
