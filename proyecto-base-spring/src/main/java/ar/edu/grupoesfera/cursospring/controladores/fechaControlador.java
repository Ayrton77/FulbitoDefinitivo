package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.servicios.FechaService;
import ar.edu.grupoesfera.cursospring.servicios.PartidoService;

@RestController
@Transactional
public class fechaControlador extends SpringTest {
	@Inject
	private FechaService fechaServise;
	
	@Inject
	private PartidoService partidoService;
	//lista
	@RequestMapping("Usuario/{idUsuario}/Torneo/{idTorneo}/listaDefechas")
	public ModelAndView listaDeFechas(
		@PathVariable("idUsuario")Long	idUsuario,
		@PathVariable("idTorneo")Long	idTorneo
	)
	{
		
	
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
