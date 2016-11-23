package ar.edu.grupoesfera.cursospring.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Equipo;
import ar.edu.grupoesfera.cursospring.modelo.Jugador;

public class bddPrueba extends SpringTest{

	@Test
	@Transactional
	@Rollback(true)
	public void testPrueba1()  {
		
		Equipo equipo1=new Equipo();
		equipo1.setNombreEquipo("boca");
		Equipo equipo2=new Equipo();
		equipo1.setNombreEquipo("river");
		Jugador jugador1=new Jugador();
		jugador1.setEquipo(equipo1);
		jugador1.setNombreJugador("axel");
		Jugador jugador2=new Jugador();
		jugador2.setEquipo(equipo1);
		jugador2.setNombreJugador("AYTON");
		Jugador jugador3=new Jugador();
		jugador3.setEquipo(equipo2);
		jugador3.setNombreJugador("MAXY");
		getSession().save(equipo1);
		getSession().save(equipo2);
		getSession().save(jugador1);
		getSession().save(jugador2);
		getSession().save(jugador3);
		
		//System.out.println(getSession().get(Jugador.class, 1L).getEquipo().getNombreEquipo());
		//System.out.println(getSession().get(Jugador.class, 1L).getNombreJugador());

		
		//final List<Jugador> res=(List<Jugador>) getSession().createCriteria(Jugador.class).list();
		
		
		
		
		//System.out.println(getSession().get(Jugador.class, jugador1.getIdjugador()).getEquipo().getNombreEquipo());
		//System.out.println(getSession().get(Jugador.class, 1L).getEquipo().getNombreEquipo());
	
		
		
		// busca todas las direcciones de los barrios de la comuna 1

		// busca todas las direcciones de los barrios de la comuna 1
		
		getSession().get(Jugador.class, 1L).setNombreJugador("axelset");
				
		
		
		Long idEquipo=1L;
		final List<Jugador> res=getSession().createCriteria(Jugador.class).
				add(Restrictions.eq("equipo",getSession().get(Equipo.class, idEquipo)
						))
				
				
				
				.list();
		for(Jugador each:res)
		{
			System.out.println("\n nombre j:"+ each.getNombreJugador());
		}
		
		//..MASCERCANA
		/*Long idEquipo=1L;
		final List<Jugador> res=getSession().createCriteria(Jugador.class).
				add(Restrictions.eq("equipo",getSession().get(Equipo.class, idEquipo)
						))
				
				
				
				.list();
		
		 */
			  
		
		/*
			final List<Jugador> res=getSession().createCriteria(Jugador.class).add(Restrictions
					.like("equipo", getSession().get(Jugador.class, 1L).getEquipo())
					).list();
			*/
			
		
					
			
			
			
		/*System.out.println(getSession().get(Jugador.class, 1L).getEquipo().getIdEquipo());
		
		List<Jugador> res= getSession().createCriteria(Jugador.class)
			.add(Restrictions.eq("nombreJugador", "axel")).list();
		
		
		

		for(Jugador each:res)
		{
			System.out.println("\n nombre j:"+ each.getNombreJugador());
		}
		
		List<Equipo> res2=getSession().createCriteria(Equipo.class)
		.list();

		for(Equipo each2:res2)
		{
			System.out.println("\n nombre Equipo:"+ each2.getNombreEquipo());
		}*/
	
	}

}
