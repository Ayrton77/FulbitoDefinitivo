package ar.edu.grupoesfera.cursospring.controladores;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

import ar.edu.grupoesfera.cursospring.servicios.TorneoService;

import static org.assertj.core.api.Assertions.assertThat;



public class ControladorTorneoTestMocks extends SpringTest{
private TorneoMock controladorTorneo = new TorneoMock();
private Torneo torneoMock;
private HttpServletRequest requestMock;
private HttpSession sessionMock;
private TorneoService TorneoServiceMock;

@Before
public void init(){
	torneoMock = mock(Torneo.class);
	requestMock = mock (HttpServletRequest.class);
	sessionMock = mock (HttpSession.class);
	TorneoServiceMock = mock(TorneoService.class);
	controladorTorneo.setTorneoService(TorneoServiceMock);
	}

@Test
public void AgregarTorneoConMock(){
	torneoMock.setNombreTorneo("Torneo1");
	when(requestMock.getSession()).thenReturn(sessionMock);
	when(torneoMock.getNombreTorneo()).thenReturn("Torneo1");
	//when(controladorTorneo.addTorneo(anyString(),requestMock)).thenReturn("");
	when(TorneoServiceMock.verificarTorneo(torneoMock.getNombreTorneo())).thenReturn("Torneo1");
	ModelAndView mav = controladorTorneo.addTorneo(torneoMock.getNombreTorneo(), requestMock);
	//Assert.asserThat(mav.getViewName()).isEqualTo("listaDeTorneos");
	assertThat(mav.getViewName()).isEqualTo("listaDeTorneos");
	//Assert.assertTrue(message, condition);
	
}
}
