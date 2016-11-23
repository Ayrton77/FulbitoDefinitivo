package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Fecha;
import ar.edu.grupoesfera.cursospring.modelo.Torneo;

public interface FechasDao {

		public void agregarFechaALaBDD(Torneo torneo);
		
		public List<Fecha> traerListaDeFechasDeLaBDDPorIdDeTorneo(Long idTorneo);
		
		public Torneo traerUnTorneoDeLaBDDPorId(Long idTorneo);
		
		public Fecha traerUnaFechaPorId(Long idFecha);
}
