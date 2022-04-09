/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_Religion;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobReligion;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsGlobReligion {
        
    public void addData(ApsGlobReligion eo_dao)
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
    
    public void deleteData(ApsGlobReligion relObj)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.delete(relObj);
            trans.commit();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_Religion> getbyID(int pno)
    {
        Bean_Religion bn_obj=new Bean_Religion();
        List<Bean_Religion> bn_Obj1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobReligion");
            //query.setInteger("id", pno);
            bn_obj=(Bean_Religion)query.uniqueResult();
            bn_Obj1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return bn_Obj1;
    }
    

    
   
    
    
      public List<ApsGlobReligion> retrieveData()
    {
       
        List lst=new ArrayList();
        ApsGlobReligion lst1=new ApsGlobReligion();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobReligion");
            lst=query.list();
            //lst.add(lst1.getRelid());
            //lst.add(lst1.getDescr());
            
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
   
    
    public void updateData(ApsGlobReligion apsUpdate)
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