package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;

public interface buscarTorneoService {
	
	public List<Equipo> buscarTorneo(String nombreTorneo);
}
