/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import config.HibernateUtil;
import beans.Bean_ApsPanel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import config.HibernateUtil;
import eo.ApsAdmsPanel;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


/**
 * @author 119401amman
**/
public class _ApsAdmsPanel {
    
        
    public void addPanel(ApsAdmsPanel eo_pnl_dao)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(eo_pnl_dao);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void deletePanel(ApsAdmsPanel eo_pnl_dao)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            //Bean_ApsPanel pnl=(Bean_ApsPanel)session.load(Bean_ApsPanel.class, new Integer(id));
            session.delete(eo_pnl_dao);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public List<Bean_ApsPanel> getbyID(int pno)
    {
        Bean_ApsPanel pnl=new Bean_ApsPanel();
        List<Bean_ApsPanel> student1=new ArrayList();
       
         Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsAdmsPanel");
            //query.setInteger("id", pno);
            pnl=(Bean_ApsPanel)query.uniqueResult();
            student1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return student1;
    }
    

    
    public List<Bean_ApsPanel> retrievePanel()
    {
       
        List pnl=new ArrayList();
        Bean_ApsPanel pnl1=new Bean_ApsPanel();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsAdmsPanel");
            pnl=query.list();
          //  pnl.add(pnl1.getPanelid());
          //  pnl.add(pnl1.getDescr());
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
        return pnl;
    }
    
    
      public List<ApsAdmsPanel> retrievePanel2()
    {
       
        List pnl=new ArrayList();
        ApsAdmsPanel pnl1=new ApsAdmsPanel();
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from ApsAdmsPanel");
            pnl=query.list();
            //pnl.add(pnl1.getPanelid());
            //pnl.add(pnl1.getDescr());
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
        return pnl;
    }
    
    
   
    
    public void updatePanel(ApsAdmsPanel admpnl)
    {
       
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            System.out.println("DAO Veruft "+ admpnl);
            trans=session.beginTransaction();
            session.update(admpnl);
            System.out.println("DAO 3 "+ admpnl);
            trans.commit();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        
    }
    
}