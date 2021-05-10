package m06.uf2.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import m06.uf2.logic.main.ProjectAPI;
import m06.uf2.logic.main.SingleSession;
import m06.uf2.logic.models.Coupe;
import m06.uf2.logic.models.Familiar;
import m06.uf2.logic.models.Motocicleta;
import m06.uf2.logic.models.Ocupant;
import m06.uf2.logic.models.Persona;
import m06.uf2.logic.models.Polissa;
import m06.uf2.logic.models.Propietari;
import m06.uf2.logic.models.Scooter;
import m06.uf2.logic.models.Trail;
import m06.uf2.logic.models.Turisme;
import m06.uf2.logic.models.Vehicle;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author manel
 */
public class TestGlobal {
     
    @Test
   //Verificacio d'entitats
   public void Test1() {

      Session session = SingleSession.getSessio();

      assertTrue(session.createCriteria(Coupe.class).list().size() >= 0 );
      assertTrue(session.createCriteria(Familiar.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Motocicleta.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Ocupant.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Persona.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Polissa.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Propietari.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Scooter.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Trail.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Turisme.class).list().size() >= 0 );
      assertTrue(session.createCriteria(Vehicle.class).list().size() >= 0 );

      session.close();
  }
     
     @Test
     //Vehicle i polissa
     public void Test2() {
        
        Session session = SingleSession.getSessio();
        session.beginTransaction();
       
        Trail v;
        Polissa p;
        v = (Trail)ProjectAPI.vehicleFactory(Trail.class);
        p = ProjectAPI.polissaFactory();
        ProjectAPI.addPolissaToVehicle(p, v);
        session.save(v);
        session.save(p);
        assertEquals(v.getPolissaVehicle().getId(), p.getId());
        session.getTransaction().commit();
        session.close();
    }
    
    
    @Test
    // tipus de vehicle i ocupants
    public void Test3() {
        
        Session session = SingleSession.getSessio();
        session.beginTransaction();
        
        Vehicle v, ve;
                
        v = ProjectAPI.addOcupantsToVehicle(ProjectAPI.ocupantsFactory(4),ProjectAPI.vehicleFactory(Familiar.class));
        session.save(v);
        ve = (Vehicle)session.get(Familiar.class, v.getMatricula());
        assertEquals(ve.getOcupants().size(), 4);
        
        v = ProjectAPI.addOcupantsToVehicle(ProjectAPI.ocupantsFactory(2),ProjectAPI.vehicleFactory(Coupe.class));
        session.save(v);
        ve = (Vehicle)session.get(Coupe.class, v.getMatricula());
        assertEquals(ve.getOcupants().size(), 2);
        
        v = ProjectAPI.addOcupantsToVehicle(ProjectAPI.ocupantsFactory(1),ProjectAPI.vehicleFactory(Scooter.class));
        session.save(v);
        ve = (Vehicle)session.get(Scooter.class, v.getMatricula());
        assertEquals(ve.getOcupants().size(), 1);
        
        v = ProjectAPI.addOcupantsToVehicle(ProjectAPI.ocupantsFactory(1),ProjectAPI.vehicleFactory(Trail.class));
        session.save(v);
        ve = (Vehicle)session.get(Trail.class, v.getMatricula());
        assertEquals(ve.getOcupants().size(), 1);
        
        session.getTransaction().commit();
        session.close();
    }
    
    @Test
    // tipus de vehicle i propietaris
    public void Test4() {
        
        Session session = SingleSession.getSessio();
        session.beginTransaction();
        
        Vehicle v, ve;
        List<Persona> prop = ProjectAPI.propietarisFactory(3);
                
        v = ProjectAPI.addPropietarisToVehicle(prop, ProjectAPI.vehicleFactory(Familiar.class));
        session.save(v);
        session.getTransaction().commit();
        session.refresh(v);
        
        Propietari p = (Propietari)session.get(Propietari.class, v.getCopropietaris().get(0).getId());
        assertEquals(p.getPoseeix().contains(v), true);
        
        session.close();
    }
}
