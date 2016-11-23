package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;

public interface buscarTorneoDAO {
	
	public List<Equipo> buscarTorneoBDD(String nombreTorneo);
}
