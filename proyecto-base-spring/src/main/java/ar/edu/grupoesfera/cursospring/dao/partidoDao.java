package ar.edu.grupoesfera.cursospring.dao;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;

public interface partidoDao {
	
	public Equipo buscarUnEquipoPorId(Long idEquipo);
	public void agregarPartido(Long idEquipo1,Long idEquipo2);
}
