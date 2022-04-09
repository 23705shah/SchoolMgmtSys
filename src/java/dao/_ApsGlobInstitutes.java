/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_ApsCorp;
import beans.Bean_Institutes;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobInstitutes;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsGlobInstitutes {
        
    public void addData(ApsGlobInstitutes eo_dao)
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
    

    
    public void deleteData(ApsGlobInstitutes eo_dao)
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
    
    public List<Bean_Institutes> getbyID(int pno)
    {
        Bean_Institutes bn_obj=new Bean_Institutes();
        List<Bean_Institutes> bn_Obj1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobInstitutes");
            //query.setInteger("id", pno);
            bn_obj=(Bean_Institutes)query.uniqueResult();
            bn_Obj1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return bn_Obj1;
    }
    

    
   
    
    
      public List<ApsGlobInstitutes> retrieveData()
    {
       
        List lst=new ArrayList();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobInstitutes");
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
   
    
    public void updateData(ApsGlobInstitutes apsUpdate)
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