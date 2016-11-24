package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Partido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPartido;
	
	
	//bdd--con equipo
	@Column
	@OneToMany (mappedBy="partido", cascade=CascadeType.ALL)
    private List <Equipo> listaDeEquiposEnPartido = new ArrayList <> ();
	
	//--bddconfecha
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFecha")
	private Fecha fecha;
	
	@Column 
	private String equipo1;
	
	@Column 
	private Long idEquipo1;
	
	@Column 
	private String equipo2;
	
	@Column 
	private Long idEquipo2;
	
	@Column
	private Integer GolesEquipo1=0;
	
	@Column 
	private Integer GolesEquipo2=0;
	@Column 
	private Long equipoGanador;
	
	@Column 
	private Long equipoPerdedor;
	
	//cont
	public Partido()
	{
		
	}
	//geter and seters



	public List<Equipo> getListaDeEquiposEnPartido() {
		return listaDeEquiposEnPartido;
	}

	public Long getIdPartido() {
		return idPartido;
	}



	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}



	public void setListaDeEquiposEnPartido(List<Equipo> listaDeEquiposEnPartido) {
		this.listaDeEquiposEnPartido = listaDeEquiposEnPartido;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public Long getIdEquipo1() {
		return idEquipo1;
	}

	public void setIdEquipo1(Long idEquipo1) {
		this.idEquipo1 = idEquipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}

	public Long getIdEquipo2() {
		return idEquipo2;
	}

	public void setIdEquipo2(Long idEquipo2) {
		this.idEquipo2 = idEquipo2;
	}

	public Integer getGolesEquipo1() {
		return GolesEquipo1;
	}

	public void setGolesEquipo1(Integer golesEquipo1) {
		GolesEquipo1 = golesEquipo1;
	}

	public Integer getGolesEquipo2() {
		return GolesEquipo2;
	}

	public void setGolesEquipo2(Integer golesEquipo2) {
		GolesEquipo2 = golesEquipo2;
	}

	public Long getEquipoGanador() {
		return equipoGanador;
	}

	public void setEquipoGanador(Long equipoGanador) {
		this.equipoGanador = equipoGanador;
	}

	public Long getEquipoPerdedor() {
		return equipoPerdedor;
	}

	public void setEquipoPerdedor(Long equipoPerdedor) {
		this.equipoPerdedor = equipoPerdedor;
	}

	
	
}
