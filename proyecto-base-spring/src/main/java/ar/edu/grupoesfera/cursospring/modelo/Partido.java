package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Partido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPartido;
	
	
	@Column
	private Equipo equipo1;

	@Column 
	private Equipo equipo2;

	@Column 
	private Equipo equipoGanador;

	@Column 
	private Equipo equipoPerdedor;
	
	@Column 
	private Integer golesEquipo1;
	
	@Column 
	private Integer golesEquipo2;

	public Long getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public Equipo getEquipoGanador() {
		return equipoGanador;
	}

	public void setEquipoGanador(Equipo equipoGanador) {
		this.equipoGanador = equipoGanador;
	}

	public Equipo getEquipoPerdedor() {
		return equipoPerdedor;
	}

	public void setEquipoPerdedor(Equipo equipoPerdedor) {
		this.equipoPerdedor = equipoPerdedor;
	}

	public Integer getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(Integer golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public Integer getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(Integer golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	
	
}
