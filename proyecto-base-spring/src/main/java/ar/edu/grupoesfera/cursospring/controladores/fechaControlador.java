package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;
import ar.edu.grupoesfera.cursospring.servicios.ABMEquipoService;
import ar.edu.grupoesfera.cursospring.servicios.ABMJugadorServise;
import ar.edu.grupoesfera.cursospring.servicios.ABMTorneoService;
import ar.edu.grupoesfera.cursospring.servicios.FechaService;
import ar.edu.grupoesfera.cursospring.servicios.PartidoService;
import ar.edu.grupoesfera.cursospring.servicios.RegistroLoginService;

@RestController
@Transactional
public class fechaControlador extends SpringTest {
	@Inject
	private FechaService fechaServise;
	
	@Inject
	private PartidoService partidoService;
	
	@Inject 
	private RegistroLoginService rg ;
	@Inject 
	private ABMTorneoService abmt ;
	
	@Inject 
	private ABMEquipoService abme ;
	@Inject 
	private ABMJugadorServise abmj ;
	
	@Inject
	private FechaService fs;
	
	//lista
	@RequestMapping("Usuario/{idUsuario}/Torneo/{idTorneo}/listaDefechas")
	public ModelAndView listaDeFechas(
		@PathVariable("idUsuario")Long	idUsuario,
		@PathVariable("idTorneo")Long	idTorneo
	) throws Exception
	{
		//--quitar
		
		
		
		rg.crearUsuario("a", "a", "a");
		abmt.crearUnTorneo("t1", getSession().get(UsuarioLoguiado.class, 1l));
		abme.crearUnEquipo("e1", getSession().get(Torneo.class, 1l));
		abme.crearUnEquipo("e2", getSession().get(Torneo.class, 1l));
		abmj.agregarJugador("j1", getSession().get(Equipo.class, 1l),1l);
		abmj.agregarJugador("j2", getSession().get(Equipo.class, 2l),1l);
		abmj.agregarJugador("j3", getSession().get(Equipo.class, 2l),1l);
		fs.crearFecha(getSession().get(Torneo.class, 1l));
		partidoService.crearPartido(getSession().get(Fecha.class, 1l));
		partidoService.agreagarEquiposAlPatido(1l, 2l, 1l);
		//--
	
		ModelMap modeloFecha=new ModelMap();
		modeloFecha.put("listaDeFechas", fechaServise.mostrarListaDeFechasPorTorneo(idTorneo));
		modeloFecha.put("idTorneo",idTorneo);
		return new ModelAndView("listaDeFechas",modeloFecha);
	}
	//agregarFecha
	@RequestMapping("Torneo/{idTorneo}/agregarFecha")
	public ModelAndView agregarFecha(
		@PathVariable("idTorneo")Long	idTorneo
	)
	{
		ModelMap modeloFecha=new ModelMap();
		
		
		fechaServise.crearFecha(fechaServise.traerUnTorneoPorId(idTorneo));
		modeloFecha.put("listaDeFechas", fechaServise.mostrarListaDeFechasPorTorneo(idTorneo));
		modeloFecha.put("idTorneo",idTorneo);
		return new ModelAndView("listaDeFechas",modeloFecha);
	}
	//ver fecha
	@RequestMapping("Torneo/{idTorneo}/fecha/{idFecha}/ver")
	public ModelAndView verFecha(
			@PathVariable("idTorneo")Long	idTorneo,
			@PathVariable("idTorneo")Long	idFecha
					
		)
		{
			ModelMap modeloFecha=new ModelMap();
			
			
			fechaServise.crearFecha(fechaServise.traerUnTorneoPorId(idTorneo));
			modeloFecha.put("listaDePartidos", fechaServise.mostarListaDePartidosPorFecha(idFecha));
			modeloFecha.put("idTorneo",idTorneo);
			modeloFecha.put("idFecha",idFecha);
			return new ModelAndView("listaDePartidos",modeloFecha);
		}
	
	//agregar
		@RequestMapping("Torneo/{idTorneo}/fecha/{idFecha}/agregarPartido")
		public ModelAndView agregarPARTIDO(
		@PathVariable("idTorneo")Long	idTorneo,
		@PathVariable("idFecha")Long	idFecha
				
	)
	{
		ModelMap modeloFecha=new ModelMap();
		
		
		partidoService.crearPartido(fechaServise.trearUnaFechaPorId(idFecha));
		modeloFecha.put("listaDeFechas", fechaServise.mostrarListaDeFechasPorTorneo(idTorneo));
		modeloFecha.put("listaDePartidos", fechaServise.mostarListaDePartidosPorFecha(idFecha));
		
		modeloFecha.put("idTorneo",idTorneo);
		modeloFecha.put("idFecha",idFecha);
		return new ModelAndView("listaDePartidos",modeloFecha);
	}
	
	
}
