package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.apache.taglibs.standard.extra.spath.Token;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;
import ar.edu.grupoesfera.cursospring.servicios.ABMEquipoService;
import ar.edu.grupoesfera.cursospring.servicios.RegistroLoginService;

@RestController
public class RegistroLoginControlador {

	@Inject
	private RegistroLoginService RegistroLoginService;
	
	//home
	@RequestMapping("home")
	public ModelAndView home()
	{
		ModelMap home=new ModelMap();
		
		home.put("usuario",new UsuarioLoguiado());
		home.put("torneo", new Torneo());
		return new ModelAndView("home",home);
	}
	//Registro
	@RequestMapping("registro1")
	public ModelAndView registro1()
	{
		ModelMap home=new ModelMap();
		home.put("usuario",new UsuarioLoguiado());
		return new ModelAndView("registroForm",home);
		
	}
	//creo usuario y valido registro
	@RequestMapping(value="registro2",method=RequestMethod.POST)
	public ModelAndView registro2(
			@RequestParam("nombreUsuarioLoguiado")String nombreUser,
			@RequestParam("mailUsuarioRegistrado")String mailUser,
			@RequestParam("contraseñaUsuarioLoguiadom")String passUser
		
			)
	{
		
		
		ModelMap home=new ModelMap();
		try {
			RegistroLoginService.crearUsuario(nombreUser, mailUser, passUser);
			home.put("usuario",new UsuarioLoguiado());
			home.put("torneo", new Torneo());
			return new ModelAndView("home",home);
			
		} catch (Exception e) {
			home.put("mensajeError", e.getMessage());
			home.put("mensajeError", "User invalido");
			return new ModelAndView("errorJSP",home);
		}
	
	}
	
	public RegistroLoginService getRegistroLoginService() {
		return RegistroLoginService;
	}
	public void setRegistroLoginService(RegistroLoginService registroLoginService) {
		RegistroLoginService = registroLoginService;
	}
	//logueo
	@RequestMapping(value="home2",method=RequestMethod.POST)
	public ModelAndView login(
			@RequestParam("mailUsuarioRegistrado")String mailUser,
			@RequestParam("contraseñaUsuarioLoguiadom")String passUser
		
			)
	{
		
		
		ModelMap home=new ModelMap();
		try {
			UsuarioLoguiado userActivo=RegistroLoginService.validarLogin(mailUser, passUser);
			home.put("usuario",new UsuarioLoguiado());
			home.put("torneo2", new Torneo());
			home.put("userActivo", userActivo);
			return new ModelAndView("home2",home);
			
		} catch (Exception e) {
			home.put("mensajeError", e.getMessage());
			home.put("mensajeError2", "Usuario Invalido");
			return new ModelAndView("errorJSP",home);
		}
	
	}
}
