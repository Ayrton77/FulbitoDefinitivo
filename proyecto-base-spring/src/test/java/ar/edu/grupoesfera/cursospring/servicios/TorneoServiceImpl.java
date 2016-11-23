package ar.edu.grupoesfera.cursospring.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public class TorneoServiceImpl {
	List<Torneo> listaTorneos = new ArrayList<Torneo>();
	
	public String AgregarTorneo(String nombre){
		Torneo torneo = new Torneo();
		torneo.setNombreTorneo(nombre);
		listaTorneos.add(torneo);
		return torneo.getNombreTorneo();
		
	}
	
	public String verificarTorneo(String nombre){
		for(Torneo torneito: listaTorneos)
		{
			
			if(torneito.getNombreTorneo().equals(nombre))
				return torneito.getNombreTorneo();
	}
		return "No se encontro torneo";
	}
}
