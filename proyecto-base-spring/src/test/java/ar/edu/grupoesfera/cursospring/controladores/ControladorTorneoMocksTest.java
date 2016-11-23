package ar.edu.grupoesfera.cursospring.controladores;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;
import ar.edu.grupoesfera.cursospring.servicios.ABMTorneoService;
import ar.edu.grupoesfera.cursospring.servicios.TorneoService;
import static org.assertj.core.api.Assertions.assertThat;
public class ControladorTorneoMocksTest {

	private ABMTorneoControlador controladorTorneo = new ABMTorneoControlador();
	private Torneo torneoMock;
	private HttpServletRequest requestMock;
	private HttpSession sessionMock;
	private ABMTorneoService TorneoServiceMock;
	private UsuarioLoguiado usuarioMock;

	
	@Before
	public void init(){
		torneoMock = mock(Torneo.class);
		usuarioMock = mock(UsuarioLoguiado.class);
		requestMock = mock (HttpServletRequest.class);
		sessionMock = mock (HttpSession.class);
		TorneoServiceMock = mock(ABMTorneoService.class);
		controladorTorneo.setABMTorneoService(TorneoServiceMock);
		}
	
	@Test
	public void AgregarTorneo(){
		when(requestMock.getSession()).thenReturn(sessionMock);
		//when(TorneoServiceMock.crearUnTorneo("Torneo1", usuarioMock));
		//this.TorneoServiceMock.crearUnTorneo("Torneo1", usuarioMock);
		ModelAndView mav = controladorTorneo.agregarTorneo2(usuarioMock.getIdUsuarioLoguiado(), "Torneo1");
		assertThat(mav.getViewName()).isEqualTo("listaDeTorneos");

	}
}
