package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.CustomerEntity;

/**
 * Session Bean implementation class CustomerEJB
 */
@Stateless
@LocalBean
public class CustomerEJB {

   @PersistenceContext
   private EntityManager em;
   
    public CustomerEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(CustomerEntity customerentity)
    {
    	System.out.println("======Adding customer to DB========");
    	em.persist(customerentity);
    }

}
