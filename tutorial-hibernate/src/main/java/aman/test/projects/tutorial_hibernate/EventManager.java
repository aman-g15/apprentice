package aman.test.projects.tutorial_hibernate;

import java.util.Date;

import org.hibernate.Session;

import aman.test.projects.domain.Event;

/**
 * Hello world!
 *
 */
public class EventManager 
{
    public static void main( String[] args )
    {
       EventManager mgr = new EventManager();
       if(args[0].equalsIgnoreCase("store")){
    	   mgr.createAndStoreEvent("MyEvent", new Date());
       }
    }

	private void createAndStoreEvent(String title, Date date) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Event theEvent = new Event();
		theEvent.setTitle(title);
		theEvent.setDate(date);
		session.save(theEvent);
		session.getTransaction().commit();
		
	}
}
