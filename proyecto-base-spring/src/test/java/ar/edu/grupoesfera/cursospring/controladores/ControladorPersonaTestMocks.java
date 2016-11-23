package ar.edu.grupoesfera.cursospring.controladores;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import static org.mockito.Mockito.*;//agregar import 
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;
import ar.edu.grupoesfera.cursospring.servicios.RegistroLoginService;
import static org.assertj.core.api.Assertions.assertThat;

public class ControladorPersonaTestMocks {
	private RegistroLoginControlador controladorPersonaMock = new RegistroLoginControlador();
	private UsuarioLoguiado PersonaMock;
	private HttpServletRequest requestMock;
	private HttpSession sessionMock;
	private RegistroLoginService personaServiceMock;
	
	@Before
	public void init(){
		PersonaMock = mock(UsuarioLoguiado.class);
		requestMock = mock (HttpServletRequest.class);
		sessionMock = mock (HttpSession.class);
		personaServiceMock = mock(RegistroLoginService.class);
		controladorPersonaMock.setRegistroLoginService(personaServiceMock);
		}
	@Test
	public void UsuarioQueLogueaCorrectamente() throws Exception {
		when(requestMock.getSession()).thenReturn(sessionMock);
		this.personaServiceMock.crearUsuario("Ayrton", "ayrton@hotmail.com", "hola1234");
		when(personaServiceMock.buscarUnUsuarioPorMail("ayrton@hotmail.com")).thenReturn(PersonaMock);
		//ejecuto
		ModelAndView mav = controladorPersonaMock.login(PersonaMock.getMailUsuarioRegistrado(), PersonaMock.getContraseñaUsuarioLoguiadom());
		//compruebo que me lleva a la vista correcta
		assertThat(mav.getViewName()).isEqualTo("home2");
	}
	@Test
	public void VerificarQueVuelveAlLoginSiElUserEsIncorrecto() throws Exception{
		//personaServiceMock.crearUsuario(anyString(), anyString(), anyString());
		when(this.personaServiceMock.validarLogin(anyString(), anyString())).thenReturn(null);
		ModelAndView mav2 = controladorPersonaMock.registro2("asdasd","asdas@hotmail.com","password01");
		ModelAndView mav = controladorPersonaMock.login(PersonaMock.getMailUsuarioRegistrado(), PersonaMock.getContraseñaUsuarioLoguiadom());
		assertThat(mav2.getViewName()).isEqualTo("errorJSP");
		assertThat(mav2.getModel().get("mensajeError")).isEqualTo("User invalido");
	}

}
