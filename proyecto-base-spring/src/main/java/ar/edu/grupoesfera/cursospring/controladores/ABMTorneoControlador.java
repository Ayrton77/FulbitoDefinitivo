package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

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
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.modelo.UsuarioLoguiado;
import ar.edu.grupoesfera.cursospring.servicios.ABMTorneoService;

@RestController
@Transactional
public class ABMTorneoControlador extends SpringTest {
	
	@Inject
	private ABMTorneoService ABMTorneoService;
	//Getter and setter del servicio
	
	public ABMTorneoService getABMTorneoService() {
		return ABMTorneoService;
	}
	public void setABMTorneoService(ABMTorneoService aBMTorneoService) {
		ABMTorneoService = aBMTorneoService;
	}
	//Getter and setter del servicio
	
	
	
	//lista
	@RequestMapping("usuario/{idUsuario}/listaDeTorneos")
	public ModelAndView mostrarListaDeTorneos(
			@PathVariable ("idUsuario") Long idUsuario
			)
	{
		
		
		
		ModelMap ABMTorneoModelo=new ModelMap();
		ABMTorneoModelo.put("listaDeTorneos", ABMTorneoService.mostrarListaDeEquiposDeUnUsuario(idUsuario));
		ABMTorneoModelo.put("idUsuario",idUsuario);
		return new ModelAndView("listaDeTorneos",ABMTorneoModelo);
	}
	//agregar
	@RequestMapping("torneo/{idUsuario}/agregarTorneo1")
	public ModelAndView agregarTorneo1(
			@PathVariable ("idUsuario") Long idUsuario
			)
	{
		ModelMap ABMTorneoModelo=new ModelMap();
		ABMTorneoModelo.put("listaDeTorneos", ABMTorneoService.mostrarListaDeEquiposDeUnUsuario(idUsuario));
		ABMTorneoModelo.put("idUsuario",idUsuario);
		ABMTorneoModelo.put("torneo", new Torneo());
		return new ModelAndView("agregarTorneoForm",ABMTorneoModelo);
	}
	//agregar2
	@RequestMapping("usuario/{idUsuario}/agregarTorneo2")
	public ModelAndView agregarTorneo2(
			
			@PathVariable ("idUsuario") Long idUsuario,
			@RequestParam("nombreTorneo")String nombreTorneo
			)
	{
		ModelMap ABMTorneoModelo=new ModelMap();
		//cambiar linea
		ABMTorneoService.crearUnTorneo(nombreTorneo,getSession().get(UsuarioLoguiado.class, idUsuario));
		ABMTorneoModelo.put("listaDeTorneos", ABMTorneoService.mostrarListaDeEquiposDeUnUsuario(idUsuario));
		ABMTorneoModelo.put("idUsuario",idUsuario);
		//ABMTorneoModelo.put("idUser","id");
		return new ModelAndView("listaDeTorneos",ABMTorneoModelo);
	}
	
	//eliminar
	@RequestMapping("Usuario/{idUsuario}/Torneo/{idTorneo}/eliminarTorneo")
	public ModelAndView eliminarTorneo(
			
			@PathVariable ("idUsuario") Long idUsuario,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap ABMTorneoModelo=new ModelMap();
		ABMTorneoService.eliminarUnTorneo(idTorneo);
		ABMTorneoModelo.put("listaDeTorneos", ABMTorneoService.mostrarListaDeEquiposDeUnUsuario(idUsuario));
		ABMTorneoModelo.put("idUsuario",idUsuario);
		return new ModelAndView("listaDeTorneos",ABMTorneoModelo);
	}
	
	//modificar
		@RequestMapping("Usuario/{idUsuario}/Torneo/{idTorneo}/modificarTorneo1")
		public ModelAndView modificarTorneo(
				
				@PathVariable ("idUsuario") Long idUsuario,
				@PathVariable ("idTorneo") Long idTorneo
				)
		{
			ModelMap ABMTorneoModelo=new ModelMap();
		
			ABMTorneoModelo.put("torneo", new Torneo());
			ABMTorneoModelo.put("idUsuario",idUsuario);
			return new ModelAndView("modificarTorneoForm",ABMTorneoModelo);
		}
		
		//modificar2
		
				@RequestMapping(value="usuario/{idUsuario}/torneo/{idTorneo}/modificarTorneo2",method=RequestMethod.POST)
				public ModelAndView modificarTorneo2(
						
						@PathVariable ("idUsuario") Long idUsuario,
						@PathVariable ("idTorneo") Long idTorneo,
						@RequestParam("nombreTorneo")String nombreTorneo
						)
				{
					ModelMap ABMTorneoModelo=new ModelMap();
					ABMTorneoService.modificarUnTorneo(nombreTorneo, idTorneo);
					ABMTorneoModelo.put("torneo", new Torneo());
					ABMTorneoModelo.put("listaDeTorneos", ABMTorneoService.mostrarListaDeEquiposDeUnUsuario(idUsuario));
					ABMTorneoModelo.put("idUsuario",idUsuario);
					return new ModelAndView("listaDeTorneos",ABMTorneoModelo);
				}
	
}
