package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.servicios.ABMEquipoService;

@RestController
@Transactional
public class ABMEquipoControlador extends SpringTest{
	
	@Inject
	private ABMEquipoService ABMEquipoService;
	
	public ABMEquipoService getABMEquipoService() {
		return ABMEquipoService;
	}
	public void setABMEquipoService(ABMEquipoService aBMEquipoService) {
		ABMEquipoService = aBMEquipoService;
	}
	@RequestMapping("Usuario/{idUsuario}/Torneo/{idTorneo}/ver")
	public ModelAndView mostrarlistaDeEquipos(
			@PathVariable("idTorneo") Long idTorneo,
			@PathVariable("idUsuario") Long idUsuario
			)
	{
		
		ModelMap modeloABMEquipo=new ModelMap();
		modeloABMEquipo.put("listaDeEquipos",ABMEquipoService.mostrarListaDeEquiposDeUnTorneo(idTorneo));
		modeloABMEquipo.put("idTorneo", idTorneo);
		
		
		return new ModelAndView("listaDeEquipos",modeloABMEquipo);
	}
	//elimina
	@RequestMapping("torneo/{idTorneo}/equipo/{idEquipo}/eliminarEquipo")
	public ModelAndView EliminarUnEquipo(
			@PathVariable("idTorneo") Long idTorneo,
			@PathVariable("idEquipo") Long idEquipo
			)
	{
		ModelMap modeloABMEquipo=new ModelMap();
		ABMEquipoService.eliminarUnEquipoDeUnTorneo(idEquipo);
		modeloABMEquipo.put("listaDeEquipos",ABMEquipoService.mostrarListaDeEquiposDeUnTorneo(idTorneo));
		modeloABMEquipo.put("idTorneo", idTorneo);
		
		
		return new ModelAndView("listaDeEquipos",modeloABMEquipo);
	}
	//agrega	
	@RequestMapping("torneo/{idTorneo}/agregarEquipo1")
	public ModelAndView agregar1Equipo		
	(
			@PathVariable("idTorneo") Long idTorneo
			)
	{
		ModelMap modeloABMEquipo=new ModelMap();
		modeloABMEquipo.put("idTorneo", idTorneo);
		modeloABMEquipo.put("equipo", new Equipo());
		
		return new ModelAndView("agregarEquipoForm",modeloABMEquipo);
	}
	//agrega2
	@RequestMapping("torneo/{idTorneo}/agregarEquipo2")
	public ModelAndView agregar1Equipo2
	(
			@PathVariable("idTorneo") Long idTorneo,
			@RequestParam("nombreEquipo") String nombreEquipo
			)
	{
		ModelMap modeloABMEquipo=new ModelMap();
		ABMEquipoService.crearUnEquipo(nombreEquipo,ABMEquipoService.mostrarUnTorneoPorId(idTorneo));
		
		modeloABMEquipo.put("idTorneo", idTorneo);
		modeloABMEquipo.put("listaDeEquipos", ABMEquipoService.mostrarListaDeEquiposDeUnTorneo(idTorneo));
		
		return new ModelAndView("listaDeEquipos",modeloABMEquipo);
	}
	//modificar
	@RequestMapping("torneo/{idTorneo}/equipo/{idEquipo}/modificarEquipo1")
	public ModelAndView modificarEquipo		
	(
			@PathVariable("idTorneo") Long idTorneo,
			@PathVariable("idEquipo") Long idEquipo
			)
	{
		ModelMap modeloABMEquipo=new ModelMap();
		modeloABMEquipo.put("idTorneo", idTorneo);
		modeloABMEquipo.put("idEquipo", idEquipo);
		modeloABMEquipo.put("equipo", new Equipo());
		
		return new ModelAndView("modificarEquipoForm",modeloABMEquipo);
	}
	//modificar2
	@RequestMapping("torneo/{idTorneo}/equipo/{idEquipo}/modificarEquipo2")
	public ModelAndView modificarEquipo2
	(
			@PathVariable("idTorneo") Long idTorneo,
			@PathVariable("idEquipo") Long idEquipo,
			@RequestParam("nombreEquipo") String nombreEquipo
			)
	{
		ModelMap modeloABMEquipo=new ModelMap();
		ABMEquipoService.modificarEquipo(nombreEquipo, idEquipo);
		modeloABMEquipo.put("idTorneo", idTorneo);
		modeloABMEquipo.put("listaDeEquipos", ABMEquipoService.mostrarListaDeEquiposDeUnTorneo(idTorneo));
		
		return new ModelAndView("listaDeEquipos",modeloABMEquipo);
	}
}
