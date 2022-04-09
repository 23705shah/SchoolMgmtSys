/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_Class;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobClass;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsGlobClass {
    
        
    public void addClass(ApsGlobClass eo_cl_dao)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(eo_cl_dao);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deleteClass(ApsGlobClass objCls)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            //Bean_Class cl=(Bean_Class)session.load(Bean_Class.class, new Integer(id));
            session.delete(objCls);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_Class> getbyID(int pno)
    {
        Bean_Class cl=new Bean_Class();
        List<Bean_Class> cls1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobClass");
            //query.setInteger("id", pno);
            cl=(Bean_Class)query.uniqueResult();
            cls1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return cls1;
    }
    

    
    
      public List<ApsGlobClass> retrieveClass()
    {
       
        List cls=new ArrayList();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobClass");
            cls=query.list();
            //cls.add(cls1.getClsid());
            //cls.add(cls1.getClsname());
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
        return cls;
    }
    
    
   
    
    public void updateClass(ApsGlobClass apsCls)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(apsCls);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        
    }
    
}