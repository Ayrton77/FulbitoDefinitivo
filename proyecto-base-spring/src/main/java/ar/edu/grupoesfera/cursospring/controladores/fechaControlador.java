package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.dao.FechasDao;
import ar.edu.grupoesfera.cursospring.dao.SpringTest;
import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;
import ar.edu.grupoesfera.cursospring.servicios.ABMEquipoService;
import ar.edu.grupoesfera.cursospring.servicios.FechaService;

@RestController
@Transactional
public class fechaControlador extends SpringTest {
	
	@Inject
	private FechaService fechaService;
	
	
	
	@RequestMapping("Usuario/{idUsuario}/Torneo/{IdTorneo}/listaDefechas")
	public ModelAndView verListaDeFechas(
			
			@PathVariable("IdTorneo") Long idTorneo
			)
	{
		ModelMap fechas=new ModelMap();
		//--sacar
		Torneo t1=new Torneo();
		
		getSession().save(t1);
		
		Equipo e1=new Equipo();
		e1.setNombreEquipo("equipo1");
		e1.setTorneo(t1);
		Equipo e2=new Equipo();
		e2.setNombreEquipo("equipo2");
		e2.setTorneo(t1);
		getSession().save(e1);
		getSession().save(e2);
		//
		fechaService.agregarFecha(fechaService.mostrarUnTorneoPorId(idTorneo));
		
		
		fechas.put("idTorneo", idTorneo);
		fechas.put("listaDeFechas",fechaService.mostrarListaDeFechasDeUnTorneoPorId(idTorneo));
		return new ModelAndView("listaDeFechas",fechas);
	}
}
