package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.servicios.partidoServise;

@RestController
@Transactional
public class PartidoControlador extends SpringTest {
	
	@Inject
	private partidoServise partidoService;
	
	@RequestMapping("partidoPrueba")
	public ModelAndView prueba22()
	{
		Torneo t1=new Torneo();
		Equipo e1=new Equipo();
		e1.setTorneo(t1);
		getSession().save(t1);
		
		e1.setNombreEquipo("boca");
		Equipo e2=new Equipo();
		
		e2.setTorneo(t1);
		e2.setNombreEquipo("river");
		getSession().save(e1);
		getSession().save(e2);
		
		partidoService.agregarPartido2(partidoService.buscarUnEquipoPorId2(1L).getIdEquipo(),partidoService.buscarUnEquipoPorId2(2L).getIdEquipo() );
		ModelMap modedlo=new ModelMap();
		return new ModelAndView("Prueba2",modedlo);
	}
}
