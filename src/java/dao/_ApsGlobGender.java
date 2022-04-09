/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_Gender;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobGender;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
/**
 *
 * @author 119401amman
 */
public class _ApsGlobGender {
    
    
    // Add Gender
    public void addData(ApsGlobGender eo_dao)
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
    
    // Delete Gender
     public void deleteData(ApsGlobGender eo_dao)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.delete(eo_dao);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     
     // Read and Retrieve Data based on ID
     public List<Bean_Gender> getbyID(int genderID)
    {
        Bean_Gender Obj_bn =new Bean_Gender();
        List<Bean_Gender> obj_gndr=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobGender");
            Obj_bn=(Bean_Gender)query.uniqueResult();
            obj_gndr=query.list();
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return obj_gndr;
    }
    
    // Read and Fetch All data
     public List<ApsGlobGender> retrieveData()
    {
       
        List obj_lst=new ArrayList();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobGender");
            obj_lst=query.list();
            
            
        }
       catch (HibernateException hex) {
            trans.rollback();
            hex.printStackTrace();
        } 
        
        finally {
            session.flush();
            session.close();
        }
        return obj_lst;
    }
     
     //Update Data function
      public void updateData(ApsGlobGender admgndr)
    {
       
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(admgndr);
            trans.commit();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        
    }
    
}
