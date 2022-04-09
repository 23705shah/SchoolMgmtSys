/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_Nationality;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobNationality;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsGlobNationality {
        
    public void addData(ApsGlobNationality eo_dao)
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
    
    public void deleteData(ApsGlobNationality eo_gn)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            //Bean_Nationality bn_obj=(Bean_Nationality)session.load(Bean_Nationality.class, new Integer(eo_gn));
            session.delete(eo_gn);
            trans.commit();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_Nationality> getbyID(int pno)
    {
        Bean_Nationality bn_obj=new Bean_Nationality();
        List<Bean_Nationality> bn_Obj1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobNationality");
            //query.setInteger("id", pno);
            bn_obj=(Bean_Nationality)query.uniqueResult();
            bn_Obj1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return bn_Obj1;
    }
    

    
   
    
    
      public List<ApsGlobNationality> retrieveData()
    {
       
        List lst=new ArrayList();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobNationality");
            lst=query.list();
            
            
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
        return lst;
    }
   
    
    public void updateData(ApsGlobNationality apsUpdate)
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