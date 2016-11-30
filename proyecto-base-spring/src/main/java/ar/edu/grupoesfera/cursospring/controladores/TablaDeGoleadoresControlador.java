package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.servicios.PartidoService;

@RestController
@Transactional
public class TablaDeGoleadoresControlador {
	
	@Inject
	private PartidoService partidoServise;
	
	@RequestMapping("UsuarioRegistrado/{usuario}/Torneo/{idToneo}/tablaDeGoleadores")
	public ModelAndView mostrarTablaDeGoleadores(
			@PathVariable("usuario") Long idUsuario,
			@PathVariable("idToneo") Long idTorneo
			)
	{
		ModelMap tablaModelo=new ModelMap();
		tablaModelo.put("listaDeGoleadores",partidoServise.traerGoleadores(idTorneo));
		return new ModelAndView("tablaDeGoleadores",tablaModelo);
	}
	@RequestMapping("Torneo/{idToneo}/tablaDeGoleadores")
	public ModelAndView mostrarTablaDeGoleadores(
			
			@PathVariable("idToneo") Long idTorneo
			)
	{
		ModelMap tablaModelo=new ModelMap();
		tablaModelo.put("listaDeGoleadores",partidoServise.traerGoleadores(idTorneo));
		return new ModelAndView("tablaDeGoleadores",tablaModelo);
	}
}
