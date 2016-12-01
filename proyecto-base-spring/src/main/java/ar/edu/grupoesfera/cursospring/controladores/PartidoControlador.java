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
import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;
import ar.edu.grupoesfera.cursospring.modelo.Partido;
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
public class PartidoControlador extends SpringTest {
	
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
	
	
	@RequestMapping("pruebaPartido")
	public ModelAndView partido()
	{
		ModelMap modeloPartido=new ModelMap();
		//-
		
		Torneo t1=new Torneo();
		getSession().save(t1);
		Equipo e1=new Equipo();
		abme.crearUnEquipo("boca", t1);
		abme.crearUnEquipo("river", t1);
		
		
		
		
				
		modeloPartido.put("listaDeEquipos", partidoService.listaDeEquposTorneoIdTorneo(1l));
		
		
		//-
		return new ModelAndView("pruebaPartido",modeloPartido);
	}
	
	//equipos en aprtdo
	@RequestMapping("Torneo/{idTorneo}/fecha/{idFecha}/partido/{idPartido}/listaDeEquipo")
	public ModelAndView mostrarEquipoPartido(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		
		ModelMap modeloPartido=new ModelMap();
		//-
		modeloPartido.put("listaDeEquipos", partidoService.listaDeEquiposEnPartidoS(idPartido));
		modeloPartido.put("idTorneo",idTorneo);
		
		//-
		return new ModelAndView("listaDeEquiposPartido",modeloPartido);
	}
	//agregarEquipoAPartido
	
	@RequestMapping("Torneo/{idTorneo}/partido/{idPartido}/agregarEquipoAPartido1")
	public ModelAndView agregarUnEquipoPartido1(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap modeloPartido=new ModelMap();
		
				modeloPartido.put("listaDeEquipos", partidoService.listaDeEquposTorneoIdTorneo(idPartido));
				
				
				modeloPartido.put("idTorneo",idTorneo);

		modeloPartido.put("listaDeEquiposSelect",partidoService.listaDeEquposTorneoIdTorneo(idPartido) );
		modeloPartido.put("equipo", new Equipo());
		modeloPartido.put("partido", new Partido());
		modeloPartido.put("idPartido",idPartido);
		
		//-
		return new ModelAndView("agregarEquipoAPartidoForm",modeloPartido);
	}
	//agregar equipo2
	@RequestMapping(value="Torneo/{idTorneo}/partido/{idPartido}/agregarEquipoAPartido2",method=RequestMethod.GET)
	public ModelAndView agregarUnEquipoPartido2(
			@PathVariable ("idPartido") Long idPartido,
			@RequestParam("idEquipo1")Long idEquipo1,
			@RequestParam("idEquipo2")Long idEquipo2,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap modeloPartido=new ModelMap();
		partidoService.agreagarEquiposAlPatido(idEquipo1, idEquipo2, idPartido);
		//-id torneo 1l temporal
		modeloPartido.put("idTorneo",idTorneo);

		modeloPartido.put("listaDeEquipos",partidoService.listaDeEquiposEnPartidoS(idPartido) );
		modeloPartido.put("idPartido",idPartido);
		modeloPartido.put("idEquipo1",idEquipo1);
		modeloPartido.put("idEquipo2",idEquipo2);
		//-
		
		return new ModelAndView("listaDeEquiposPartido",modeloPartido);
	}
	
	//--jugar partido---//
	@RequestMapping("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/jugar")
	public ModelAndView listaDeJugadoresXEquipo(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable("idEquipo1")Long idEquipo1,
			@PathVariable("idEquipo2")Long idEquipo2,
			@PathVariable ("idTorneo") Long idTorneo

			) throws Exception
	{
		
		
		ModelMap modeloPartido=new ModelMap();
		modeloPartido.put("idTorneo",idTorneo);
		modeloPartido.put("listaJugadoresEquipo1", partidoService.listaDeJugadoresXequipo(idEquipo1));
		modeloPartido.put("listaJugadoresEquipo2", partidoService.listaDeJugadoresXequipo(idEquipo2));
		modeloPartido.put("idEquipo1",idEquipo1);
		modeloPartido.put("idEquipo2",idEquipo2);
		return new ModelAndView("jugarListaDeEquipos",modeloPartido);


	}
	//jugar 2
	@RequestMapping("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/jugar2")
	public ModelAndView listaDeJugadoresXEquipo2(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable("idEquipo1")Long idEquipo1,
			@PathVariable("idEquipo2")Long idEquipo2,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap modeloPartido=new ModelMap();
		modeloPartido.put("idTorneo",idTorneo);
		modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
		modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
		modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
		//goles
		
		modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
		modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
		modeloPartido.put("jugador", new Jugador());
		//-
		modeloPartido.put("idEquipo1",idEquipo1);
		modeloPartido.put("idEquipo2",idEquipo2);
		modeloPartido.put("idPartido",idPartido);
		return new ModelAndView("jugarComandos",modeloPartido);


	}
	//agregar gol
	@RequestMapping (value="Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/equipo/{numeroEquipo}/agregarGol" ,method=RequestMethod.POST)
	public ModelAndView agregarGol(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable("idEquipo1")Long idEquipo1,
			@PathVariable("idEquipo2")Long idEquipo2,
			@PathVariable ("numeroEquipo") Integer numeroEquipo,
			@PathVariable ("idTorneo") Long idTorneo,
			@RequestParam ("Idjugador") Long Idjugador
			)
	{
		ModelMap modeloPartido=new ModelMap();
		
		partidoService.agregarGol(numeroEquipo, idPartido);
		partidoService.agregaGolJugador(Idjugador);
			//goles
		
				modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
				modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
				modeloPartido.put("jugador", new Jugador());
				//-	
		modeloPartido.put("idTorneo",idTorneo);
			modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
			modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
			modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
			modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
			modeloPartido.put("idEquipo1",idEquipo1);
			modeloPartido.put("idEquipo2",idEquipo2);
			modeloPartido.put("idPartido",idPartido);
		return new ModelAndView("jugarComandos",modeloPartido);


	}
	
	//quitarGol
	@RequestMapping ("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/equipo/{numeroEquipo}/quitarGol")
	public ModelAndView quitarGol(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable("idEquipo1")Long idEquipo1,
			@PathVariable("idEquipo2")Long idEquipo2,
			@PathVariable ("numeroEquipo") Integer numeroEquipo,
			@PathVariable ("idTorneo") Long idTorneo,
			@RequestParam ("Idjugador") Long Idjugador
			)
	{
		ModelMap modeloPartido=new ModelMap();
		
		partidoService.quitarGol(numeroEquipo, idPartido);
		partidoService.quitarGolJugador(Idjugador);
		//goles
	
			modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
			modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
			modeloPartido.put("jugador", new Jugador());
			//-	
		modeloPartido.put("idTorneo",idTorneo);
			modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
			modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
			modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
			modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
			modeloPartido.put("idEquipo1",idEquipo1);
			modeloPartido.put("idEquipo2",idEquipo2);
			modeloPartido.put("idPartido",idPartido);
		return new ModelAndView("jugarComandos",modeloPartido);


	}
	//agregar amarilla
		@RequestMapping (value="Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/equipo/{numeroEquipo}/agregarAmarrilla" ,method=RequestMethod.POST)
		public ModelAndView agregarAmarilla(
				@PathVariable ("idPartido") Long idPartido,
				@PathVariable("idEquipo1")Long idEquipo1,
				@PathVariable("idEquipo2")Long idEquipo2,
				@PathVariable ("numeroEquipo") Integer numeroEquipo,
				@PathVariable ("idTorneo") Long idTorneo,
				@RequestParam ("Idjugador") Long Idjugador
				)
		{
			ModelMap modeloPartido=new ModelMap();
			
			partidoService.agregaAmarillaJugador(Idjugador);
				//goles
			
					modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
					modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
					modeloPartido.put("jugador", new Jugador());
					//-	
			modeloPartido.put("idTorneo",idTorneo);
				modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
				modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
				modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
				modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
				modeloPartido.put("idEquipo1",idEquipo1);
				modeloPartido.put("idEquipo2",idEquipo2);
				modeloPartido.put("idPartido",idPartido);
			return new ModelAndView("jugarComandos",modeloPartido);


		}
		
		//quitar amatilla
		@RequestMapping ("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/equipo/{numeroEquipo}/quitarAmarrilla")
		public ModelAndView quitaAmatilla(
				@PathVariable ("idPartido") Long idPartido,
				@PathVariable("idEquipo1")Long idEquipo1,
				@PathVariable("idEquipo2")Long idEquipo2,
				@PathVariable ("numeroEquipo") Integer numeroEquipo,
				@PathVariable ("idTorneo") Long idTorneo,
				@RequestParam ("Idjugador") Long Idjugador
				)
		{
			ModelMap modeloPartido=new ModelMap();
			
			partidoService.quitarAmarillaJugador(Idjugador);
			//goles
		
				modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
				modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
				modeloPartido.put("jugador", new Jugador());
				//-	
			modeloPartido.put("idTorneo",idTorneo);
				modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
				modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
				modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
				modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
				modeloPartido.put("idEquipo1",idEquipo1);
				modeloPartido.put("idEquipo2",idEquipo2);
				modeloPartido.put("idPartido",idPartido);
			return new ModelAndView("jugarComandos",modeloPartido);


		}
		
		//agregarroja
				@RequestMapping (value="Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/equipo/{numeroEquipo}/agregarRoja" ,method=RequestMethod.POST)
				public ModelAndView agregarRoja(
						@PathVariable ("idPartido") Long idPartido,
						@PathVariable("idEquipo1")Long idEquipo1,
						@PathVariable("idEquipo2")Long idEquipo2,
						@PathVariable ("numeroEquipo") Integer numeroEquipo,
						@PathVariable ("idTorneo") Long idTorneo,
						@RequestParam ("Idjugador") Long Idjugador
						)
				{
					ModelMap modeloPartido=new ModelMap();
					
					partidoService.agregaRojaJugador(Idjugador);
						//goles
					
							modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
							modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
							modeloPartido.put("jugador", new Jugador());
							//-	
					modeloPartido.put("idTorneo",idTorneo);
						modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
						modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
						modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
						modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
						modeloPartido.put("idEquipo1",idEquipo1);
						modeloPartido.put("idEquipo2",idEquipo2);
						modeloPartido.put("idPartido",idPartido);
					return new ModelAndView("jugarComandos",modeloPartido);


				}
				
				//quitar roja
				@RequestMapping ("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/equipo/{numeroEquipo}/quitarRoja")
				public ModelAndView quitarRoja(
						@PathVariable ("idPartido") Long idPartido,
						@PathVariable("idEquipo1")Long idEquipo1,
						@PathVariable("idEquipo2")Long idEquipo2,
						@PathVariable ("numeroEquipo") Integer numeroEquipo,
						@PathVariable ("idTorneo") Long idTorneo,
						@RequestParam ("Idjugador") Long Idjugador
						)
				{
					ModelMap modeloPartido=new ModelMap();
					
					partidoService.quitarRojaJugador(Idjugador);
					//goles
				
						modeloPartido.put("listaDeJugadores1",partidoService.listaDeJugadoresXequipo(idEquipo1));
						modeloPartido.put("listaDeJugadores2",partidoService.listaDeJugadoresXequipo(idEquipo2));
						modeloPartido.put("jugador", new Jugador());
						//-	
					modeloPartido.put("idTorneo",idTorneo);
						modeloPartido.put("equipo1", partidoService.traerUnEquipoPorIdS(idEquipo1));//cambiar
						modeloPartido.put("equipo2", partidoService.traerUnEquipoPorIdS(idEquipo2));//cambiar
						modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
						modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
						modeloPartido.put("idEquipo1",idEquipo1);
						modeloPartido.put("idEquipo2",idEquipo2);
						modeloPartido.put("idPartido",idPartido);
					return new ModelAndView("jugarComandos",modeloPartido);


				}
		
	//tarjetas
	@RequestMapping ("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/resultado")
	public ModelAndView resultado(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable("idEquipo1")Long idEquipo1,
			@PathVariable("idEquipo2")Long idEquipo2,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap modeloPartido=new ModelMap();
		modeloPartido.put("idTorneo",idTorneo);
			partidoService.establecerResultado(idPartido, idEquipo1, idEquipo2);
			modeloPartido.put("equipoGanador", partidoService.buscarPartidoporIdS(idPartido).getEquipoGanador());

			modeloPartido.put("equipoGanador", partidoService.traerEquipoGanador(idPartido));
			modeloPartido.put("equipoPerdedor", partidoService.traerEquipoPerdedor(idPartido));
			modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
			
		
		return new ModelAndView("resultadoPartido",modeloPartido);


	}
	
	@RequestMapping ("Torneo/{idTorneo}/partido/{idPartido}/{idEquipo1}/{idEquipo2}/eliminarPerdedor")
	public ModelAndView eliminarPerdedor(
			@PathVariable ("idPartido") Long idPartido,
			@PathVariable("idEquipo1")Long idEquipo1,
			@PathVariable("idEquipo2")Long idEquipo2,
			@PathVariable ("idTorneo") Long idTorneo
			)
	{
		ModelMap modeloPartido=new ModelMap();
		modeloPartido.put("idTorneo",idTorneo);
			partidoService.eliminarEquipoPerdedor(partidoService.traerEquipoPerdedor(idPartido).getIdEquipo());
			modeloPartido.put("equipoPerdedor", partidoService.traerEquipoPerdedor(idPartido));
			modeloPartido.put("partido", partidoService.buscarPartidoporIdS(idPartido));
			
		
		return new ModelAndView("eliminado",modeloPartido);


	}
	
}
