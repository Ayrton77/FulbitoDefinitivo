package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import javax.inject.Inject;

import org.aspectj.lang.annotation.Before;
import org.hibernate.criterion.Restrictions;
import org.junit.runner.Request;
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
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.servicios.ABMJugadorServise;

@RestController
@Transactional
public class ABMJugadorControlador extends SpringTest {

	@Inject
	private ABMJugadorServise abmjugadorservice;
	
	
	
	@RequestMapping("prueba")
	public ModelAndView prueba1()
	{
		
		ModelMap modelo1=new ModelMap();
		abmjugadorservice.agregarJugador("axel", getSession().get(Equipo.class, 1L));
		modelo1.put("listaDeJugadores", abmjugadorservice.mostrarUnaListaDeJugadoresPorIdDeEquipo(1L));
		return new ModelAndView("prueba",modelo1);
	}
	
	//-ABMJUGADOR--//
	
	//mostrarListaDeJugadores
	@RequestMapping("torneo/{idTorneo}/equipo/{idEquipo}/ver")
	public ModelAndView mostrarListaDeJugadoresDeUnEquipo(
			@PathVariable("idEquipo") Long idEquipo,
			@PathVariable("idTorneo") Long idTorneo
			)
	{
		
		ModelMap modeloABMJugador=new ModelMap();
		modeloABMJugador.put("listaDeJugadores", abmjugadorservice.mostrarUnaListaDeJugadoresPorIdDeEquipo(idEquipo));
		modeloABMJugador.put("idEquipo",idEquipo);
		return new ModelAndView("listaDeJugadores",modeloABMJugador);
	}
	
	//agregarUnJugador
	@RequestMapping("{idEquipo}/agregarJugador1")
	public ModelAndView agregarUnJugadorAUnEquipo(
			@PathVariable("idEquipo") Long idEquipo
			)
	{
		ModelMap modeloABMJugador=new ModelMap();
		modeloABMJugador.put("jugador", new Jugador());
		return new ModelAndView("agregarJugadorForm",modeloABMJugador);
	}
	//agregarJugador2
	@RequestMapping(value="{idEquipo}/agregarJugador2",method=RequestMethod.POST)
	public ModelAndView agregarUnJugadorAUnEquipo2(
			@PathVariable("idEquipo") Long idEquipo,
			@RequestParam("nombreJugador") String nombreJugador
			
			)
	{
		ModelMap modeloABMJugador=new ModelMap();
		
		abmjugadorservice.agregarJugador(nombreJugador, 
				//optener id el equipo con la id
				getSession().get(Equipo.class, idEquipo)
				
				);
		
		
		modeloABMJugador.put("listaDeJugadores", abmjugadorservice.mostrarUnaListaDeJugadoresPorIdDeEquipo(idEquipo));
		modeloABMJugador.put("idEquipo", idEquipo);
		return new ModelAndView("listaDeJugadores",modeloABMJugador);
	}
	//eliminarJugador
	@RequestMapping("{idEquipo}/{idJugador}/eliminarJugador")
	public ModelAndView eliminarJugador(
			@PathVariable("idEquipo") Long idEquipo,
			@PathVariable("idJugador") Long idJugador
			
			
			
			)
	{
		ModelMap modeloABMJugador=new ModelMap();
		
		abmjugadorservice.eliminarJugadorPorid(idJugador);
		
		modeloABMJugador.put("listaDeJugadores", abmjugadorservice.mostrarUnaListaDeJugadoresPorIdDeEquipo(idEquipo));
		modeloABMJugador.put("idEquipo", idEquipo);
		return new ModelAndView("listaDeJugadores",modeloABMJugador);
	}
	//modificarJugador
	@RequestMapping("{idEquipo}/{idJugador}/modificarJugador1")
	public ModelAndView modificarJugador1(
			@PathVariable("idEquipo") Long idEquipo,
			@PathVariable("idJugador") Long idJugador
			
			
			
			)
	{
		ModelMap modeloABMJugador=new ModelMap();
		
		
		modeloABMJugador.put("jugador",abmjugadorservice.mostrarUnJugadorPorId(idJugador));
		modeloABMJugador.put("listaDeJugadores", abmjugadorservice.mostrarUnaListaDeJugadoresPorIdDeEquipo(idEquipo));
		modeloABMJugador.put("idEquipo", idEquipo);
		modeloABMJugador.put("idJugador", idJugador);
		
		return new ModelAndView("modificarJugadorForm",modeloABMJugador);
	}
	//modificarJugador2
	@RequestMapping("{idEquipo}/{idJugador}/modificarJugador2")
	public ModelAndView modificarJugador1(
			@PathVariable("idEquipo") Long idEquipo,
			@PathVariable("idJugador") Long idJugador,
			@RequestParam("nombreJugador")String nuevoNombreJugador
			
			
			
			)
	{
		ModelMap modeloABMJugador=new ModelMap();
		
		abmjugadorservice.modificarUnJugadorPorID(idJugador, nuevoNombreJugador);
		modeloABMJugador.put("listaDeJugadores", abmjugadorservice.mostrarUnaListaDeJugadoresPorIdDeEquipo(idEquipo));
		modeloABMJugador.put("idEquipo", idEquipo);
		modeloABMJugador.put("idJugador", idJugador);
		
		return new ModelAndView("listaDeJugadores",modeloABMJugador);
	}
}
