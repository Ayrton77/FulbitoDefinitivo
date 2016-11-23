package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.servicios.ABMEquipoService;
import ar.edu.grupoesfera.cursospring.servicios.ABMTorneoService;
import ar.edu.grupoesfera.cursospring.servicios.buscarTorneoService;

@RestController
@Transactional
public class buscarJugadorControlador extends SpringTest {
	
	@Inject
	private buscarTorneoService buscarTorneoService;
	
	@Inject
	private ABMTorneoService abmTorneoService;
	
	@Inject
	private ABMEquipoService abmEquipoService;
	
	@RequestMapping(value="buscarTorneo" , method=RequestMethod.POST)
	public ModelAndView buscarTorneo(
			@RequestParam ("nombreTorneo") String nombreTorneo
			)
	{
		
		ModelMap modeloBuscar=new ModelMap();
		modeloBuscar.put("listaDeTorneos", buscarTorneoService.buscarTorneo(nombreTorneo));
		//--
		Torneo t1=new Torneo();
		Equipo e1=new Equipo();
		t1.setNombreTorneo("torneo");
		e1.setTorneo(t1);
		
		getSession().save(t1);
		
		e1.setNombreEquipo("boca");
		Equipo e2=new Equipo();
		
		e2.setTorneo(t1);
		e2.setNombreEquipo("river");
		getSession().save(e1);
		getSession().save(e2);
		//--
		return new ModelAndView("listaDeTorneosBuscados",modeloBuscar);
	}
	
	//ver detalles
	//menu
	@RequestMapping("/torneoBuscado/{IdTorneo}/menu")
	public ModelAndView buscarTorneoMenuTorneo(
			@PathVariable ("IdTorneo") Long idTorneo
			)
	{
		
		ModelMap modeloBuscar=new ModelMap();
		modeloBuscar.put("idTorneo",idTorneo);
		modeloBuscar.put("nombreTorneo",abmEquipoService.mostrarUnTorneoPorId(idTorneo).getNombreTorneo());
		modeloBuscar.put("torneo", abmEquipoService.mostrarUnTorneoPorId(idTorneo));
		//--
		return new ModelAndView("menuTorneoBuscado",modeloBuscar);
	}
	//fecha
	@RequestMapping("/torneoBuscado/{IdTorneo}/fechas")
	public ModelAndView buscarTorneoFechas(
			@PathVariable ("IdTorneo") Long idTorneo
			)
	{
		
		ModelMap modeloBuscar=new ModelMap();
		modeloBuscar.put("idTorneo",idTorneo);
		
		//--
		return new ModelAndView("listaDeFechas",modeloBuscar);
	}
	
}
