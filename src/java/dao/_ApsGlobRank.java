/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Bean_Rank;
import config.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsGlobRank;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsGlobRank {
        
    public void addData(ApsGlobRank eo_dao)
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
    
    public void deleteData(ApsGlobRank obRank)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            //Bean_Rank bn_obj=(Bean_Rank)session.load(Bean_Rank.class, new Integer(id));
            session.delete(obRank);
            trans.commit();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_Rank> getbyID(int pno)
    {
        Bean_Rank bn_obj=new Bean_Rank();
        List<Bean_Rank> bn_Obj1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobRank");
            //query.setInteger("id", pno);
            bn_obj=(Bean_Rank)query.uniqueResult();
            bn_Obj1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return bn_Obj1;
    }
    

    
   
    
    
      public List<ApsGlobRank> retrieveData()
    {
       
        List lst=new ArrayList();
        ApsGlobRank lst1=new ApsGlobRank();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsGlobRank");
            lst=query.list();
            //lst.add(lst1.getRankid());
           // lst.add(lst1.getDescr());
            
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
   
    
    public void updateData(ApsGlobRank apsUpdate)
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