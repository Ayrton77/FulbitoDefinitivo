package ar.edu.grupoesfera.cursospring.servicios;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;

public interface partidoServise {
	
	public Equipo buscarUnEquipoPorId2(Long idEquipo);
	
	public void agregarPartido2(Long idEquipo1,Long idEquipo2);

}
