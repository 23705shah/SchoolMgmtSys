/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_Prof;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobProf;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsGlobProf {
        
    public void addData(ApsGlobProf eo_dao)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(eo_dao);
            trans.commit();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteData(ApsGlobProf bn_Obj)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
           // Bean_Prof bn_obj=(Bean_Prof)session.load(Bean_Prof.class, new Integer(id));
            session.delete(bn_Obj);
            trans.commit();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_Prof> getbyID(int pno)
    {
        Bean_Prof bn_obj=new Bean_Prof();
        List<Bean_Prof> bn_Obj1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobProf");
            //query.setInteger("id", pno);
            bn_obj=(Bean_Prof)query.uniqueResult();
            bn_Obj1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return bn_Obj1;
    }
    

    
   
    
    
      public List<ApsGlobProf> retrieveData()
    {
       
        List lst=new ArrayList();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobProf");
            lst=query.list();
            //lst.add(lst1.getProfessionid());
            //lst.add(lst1.getDescr());
            
            trans.commit();
            
        }
       catch (HibernateException hex) {
            trans.rollback();
            hex.printStackTrace();
        } 
        
        finally {
            session.flush();
            session.close();
        }
        return lst;
    }
   
    
    public void updateData(ApsGlobProf apsUpdate)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            // System.out.println("DAO Veruft "+ admpnl);
            trans=session.beginTransaction();
            session.update(apsUpdate);
            // System.out.println("DAO 3 "+ admpnl);
            trans.commit();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
    }
    
}