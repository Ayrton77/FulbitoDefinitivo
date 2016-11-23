package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UsuarioLoguiado {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuarioLoguiado;
	
	@Column
	private String nombreUsuarioLoguiado;
	
	@Column
	private String contraseñaUsuarioLoguiadom;
	
	//bdd con torneo
	@Column
	@OneToMany (mappedBy="usuarioLoguiado", cascade=CascadeType.ALL)
    private List <Torneo> listaDeTorneos = new ArrayList <> ();
	
	//constructor
	public UsuarioLoguiado()
	{}

	//geter and seters
	public Long getIdUsuarioLoguiado() {
		return idUsuarioLoguiado;
	}

	public void setIdUsuarioLoguiado(Long idUsuarioLoguiado) {
		this.idUsuarioLoguiado = idUsuarioLoguiado;
	}

	public String getNombreUsuarioLoguiado() {
		return nombreUsuarioLoguiado;
	}

	public void setNombreUsuarioLoguiado(String nombreUsuarioLoguiado) {
		this.nombreUsuarioLoguiado = nombreUsuarioLoguiado;
	}

	public String getContraseñaUsuarioLoguiadom() {
		return contraseñaUsuarioLoguiadom;
	}

	public void setContraseñaUsuarioLoguiadom(String contraseñaUsuarioLoguiadom) {
		this.contraseñaUsuarioLoguiadom = contraseñaUsuarioLoguiadom;
	}

	public List<Torneo> getListaDeTorneos() {
		return listaDeTorneos;
	}

	public void setListaDeTorneos(List<Torneo> listaDeTorneos) {
		this.listaDeTorneos = listaDeTorneos;
	}
	
	
}
