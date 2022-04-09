/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import config.HibernateUtil;
import beans.Bean_ApsPanel;
import beans.Bean_Session;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsAdmsPanel;
import eo.ApsAdmsSession;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsAdmsSession {
    
        
    public void addSession(ApsAdmsSession eo_sess_dao)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(eo_sess_dao);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteSession(ApsAdmsSession Objsess)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            //Bean_Session pnl=(Bean_Session)session.load(Bean_Session.class, new Integer(id));
            session.delete(Objsess);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_Session> getbyID(int pno)
    {
        Bean_Session sess=new Bean_Session();
        List<Bean_Session> session1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsAdmsSession");
            //query.setInteger("id", pno);
            sess=(Bean_Session)query.uniqueResult();
            session1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return session1;
    }
    

    
    
      public List<ApsAdmsSession> retrieveSession()
    {
       
        List sess=new ArrayList();
        ApsAdmsSession sess1=new ApsAdmsSession();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsAdmsSession");
            sess=query.list();
            //sess.add(sess1.getSessionid());
            //sess.add(sess1.getTitle());
          //  trans.commit();
            
        }
       catch (HibernateException hex) {
            trans.rollback();
            hex.printStackTrace();
        } 
        
        finally {
            session.flush();
            session.close();
        }
        return sess;
    }
    
    
   
    
    public void updateSession(ApsAdmsSession admSess)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            // System.out.println("DAO Veruft "+ admpnl);
            trans=session.beginTransaction();
            session.update(admSess);
            // System.out.println("DAO 3 "+ admpnl);
            trans.commit();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        
    }
    
}