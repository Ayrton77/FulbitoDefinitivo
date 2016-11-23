package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Llave;
import ar.edu.grupoesfera.cursospring.servicios.FechaService;
import ar.edu.grupoesfera.cursospring.servicios.LlaveService;

@RestController
@Transactional
public class llaveControlador {
	
	@Inject
	private LlaveService llaveService;
	
	@Inject
	private FechaService fechaService;
	
	//agregar1
	@RequestMapping("Torneo/{idTorneo}/fecha/{idFecha}/agregarLlave1")
	public ModelAndView agregarLlaveee1(
			@PathVariable ("idFecha") Long idFecha,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap llaveModelo=new ModelMap();
		llaveModelo.put("llave",new Llave());
		llaveModelo.put("idTorneo", idTorneo);
		llaveModelo.put("idFecha", idFecha);
		llaveService.setearEquiposLlaves(idTorneo, 1l);
		return new ModelAndView("agregarLlaveForm",llaveModelo);
			
	}
	//agregar2
		@RequestMapping("Torneo/{idTorneo}/fecha/{idFecha}/agregarLlave2")
		public ModelAndView agregarLlave2(
				@PathVariable ("idFecha") Long idFecha,
				@PathVariable ("idTorneo") Long idTorneo
				)
		{
			ModelMap llaveModelo=new ModelMap();
			llaveService.crearLlave(fechaService.mostrarUnaFechaPorId(idFecha));
			llaveModelo.put("idTorneo", idTorneo);
			llaveModelo.put("idFecha", idFecha);
			llaveModelo.put("listaDeLlaves", llaveService.mostrarListDeLlavesporId(idFecha));
			llaveModelo.put("listaDeFechas", fechaService.mostrarListaDeFechasDeUnTorneoPorId(idTorneo));
			return new ModelAndView("listaDeFechas",llaveModelo);
					
		}
}
