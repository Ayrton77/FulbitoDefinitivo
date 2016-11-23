package ar.edu.grupoesfera.cursospring.dao;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Partido;

public class PartidoDaoImpl extends SpringTest implements partidoDao {
	
	//buscar equipo
	@Override
	public Equipo buscarUnEquipoPorId(Long idEquipo) {
		return getSession().get(Equipo.class, idEquipo);
	}
	//crearpartido
	@Override
	public void agregarPartido(Long idEquipo1, Long idEquipo2) {

		Equipo e3=buscarUnEquipoPorId(idEquipo1);
		Equipo e4=buscarUnEquipoPorId(idEquipo2);
		
		Partido nuevoPartido=new Partido();
		nuevoPartido.setEquipo1(e3);
		nuevoPartido.setEquipo2(e4);
		nuevoPartido.setEquipoGanador(null);
		nuevoPartido.setEquipoPerdedor(null);
		nuevoPartido.setGolesEquipo1(null);
		nuevoPartido.setGolesEquipo2(null);
		getSession().save(nuevoPartido);
	}
}
