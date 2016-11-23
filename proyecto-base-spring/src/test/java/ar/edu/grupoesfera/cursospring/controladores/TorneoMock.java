package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.servicios.TorneoService;

@Controller
public class TorneoMock {
	//Uso el servicio
	@Inject
	TorneoService torneoService;
	
	@RequestMapping(path="/addTorneo", method = RequestMethod.POST)
    public ModelAndView addTorneo(@ModelAttribute("torneo") Torneo torneo, HttpServletRequest request) {
	//Usuario usuarioValidado = personaService.validarUsuario(usuario.getUsuario(), usuario.getPassword());
	//Torneo torneoAgregado =  torneoService.AgregarTorneo("Torneo1")
		//String torneoAgregado = torneoService.verificarTorneo(torneo.getNombreTorneo());
		Torneo torneoAgregado= new Torneo();
		torneo.setNombreTorneo("Torneo1");
	if(torneoAgregado.equals(torneo)){
		//request.getSession().setAttribute("ROL",usuarioValidado.getRol());
		ModelMap model = new ModelMap();
		model.put("error", "torneo existente");
		return new ModelAndView("home", model);
	} 
	else {
		request.getSession().setAttribute("Torneo1", torneoAgregado);
		return new ModelAndView("listaDeTorneos");
	}
	    }

	public TorneoService getTorneoService() {
		return torneoService;
	}

	public void setTorneoService(TorneoService torneoService) {
		this.torneoService = torneoService;
	}

}
