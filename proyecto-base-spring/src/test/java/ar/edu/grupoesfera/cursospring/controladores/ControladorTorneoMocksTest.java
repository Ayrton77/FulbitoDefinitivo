package ar.edu.grupoesfera.cursospring.controladores;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;
import ar.edu.grupoesfera.cursospring.servicios.ABMTorneoService;
import static org.assertj.core.api.Assertions.assertThat;
public class ControladorTorneoMocksTest {
	
	private ABMTorneoControlador controladorTorneo = new ABMTorneoControlador();
	private Torneo torneoMock;
	private HttpServletRequest requestMock;
	private HttpSession sessionMock;
	private ABMTorneoService TorneoServiceMock;
	private UsuarioLoguiado usuarioMock;
	private List<Torneo> listaTorneos;

	
	@Before
	public void init(){
		//listaTorneos = mock(List<Torneo>);
		torneoMock = mock(Torneo.class);
		usuarioMock = mock(UsuarioLoguiado.class);
		requestMock = mock (HttpServletRequest.class);
		sessionMock = mock (HttpSession.class);
		TorneoServiceMock = mock(ABMTorneoService.class);
		controladorTorneo.setABMTorneoService(TorneoServiceMock);
		}
	
	@Test
	public void AgregarTorneo(){
		usuarioMock.setIdUsuarioLoguiado(10L);
		torneoMock.setNombreTorneo("Torneo1");
		controladorTorneo.agregarTorneo1(usuarioMock.getIdUsuarioLoguiado());
		ModelAndView mav = controladorTorneo.agregarTorneo2(usuarioMock.getIdUsuarioLoguiado(), torneoMock.getNombreTorneo());
		assertThat(mav.getViewName()).isEqualTo("listaDeTorneos");
	}
	
	
}
