/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao._ApsAdmsPanel;
import eo.ApsAdmsPanel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 119401amman
 */
public class Bean_ApsPanel implements java.io.Serializable {
    
        public ApsAdmsPanel eo_pnl = new ApsAdmsPanel();
        
        
       public String invalidateSession() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpSession sess = (HttpSession) ctx.getExternalContext().getSession(true);
        sess.invalidate();
        return "/faces/login.xhtml?faces-redirect=true";
    }

        public ApsAdmsPanel getEo_pnl() {
            return eo_pnl;
        }

        public void setEo_pnl(ApsAdmsPanel eo_pnl) {
            this.eo_pnl = eo_pnl;
        }
 
        public Bean_ApsPanel() {
            
        }
           
        public void save()
        {
             _ApsAdmsPanel sdao=new _ApsAdmsPanel();
             System.out.println("check values for insertion" + sdao);
             sdao.addPanel(eo_pnl);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsAdmsPanel eo_pnl)
        {    
            _ApsAdmsPanel sdao=new _ApsAdmsPanel();
             sdao.deletePanel(eo_pnl);
        }
 
        public List<Bean_ApsPanel> getbyid()
        { 
            _ApsAdmsPanel sdao=new _ApsAdmsPanel();
            List<Bean_ApsPanel> stud = sdao.getbyID(1);
            //panelid=stud.get(0).panelid;
            //descr=stud.get(0).descr;
            return stud;
        }
 
   
        
        public List<ApsAdmsPanel> getallrecords()
        {
            _ApsAdmsPanel sdao = new _ApsAdmsPanel();
            List<ApsAdmsPanel> pnlLst = sdao.retrievePanel2();
            return pnlLst;
        }
        
 
 
        public void update()
        {
                _ApsAdmsPanel sdao=new _ApsAdmsPanel();
                sdao.updatePanel(eo_pnl);
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
             
             
             
        }

     
        
}