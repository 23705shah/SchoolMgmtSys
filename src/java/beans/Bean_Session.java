/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao._ApsAdmsPanel;
import dao._ApsAdmsSession;
import eo.ApsAdmsPanel;
import eo.ApsAdmsSession;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Session implements java.io.Serializable {
    
        public ApsAdmsSession eo_sess = new ApsAdmsSession();

        public ApsAdmsSession getEo_sess() {
            return eo_sess;
        }

        public void setEo_sess(ApsAdmsSession eo_sess) {
            this.eo_sess = eo_sess;
        }

       
 
        public Bean_Session() {
            
        }
           
        public void save()
        {
             _ApsAdmsSession sess_dao=new _ApsAdmsSession();
             System.out.println("check values for insertion" + sess_dao);
             sess_dao.addSession(eo_sess);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Session has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsAdmsSession objSess)
        {    
            _ApsAdmsSession sdao=new _ApsAdmsSession();
             sdao.deleteSession(objSess);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Session has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Session> getbyid()
        { 
            _ApsAdmsSession sdao=new _ApsAdmsSession();
            List<Bean_Session> stud = sdao.getbyID(1);
            //panelid=stud.get(0).panelid;
            //descr=stud.get(0).descr;
            return stud;
        }
 
   
        
        public List<ApsAdmsSession> getallrecords()
        {
            _ApsAdmsSession sdao = new _ApsAdmsSession();
            List<ApsAdmsSession> sessLst = sdao.retrieveSession();
            return sessLst;
        }
 
        
        
        public void update()
        {
            _ApsAdmsSession sdao=new _ApsAdmsSession();
            sdao.updateSession(eo_sess);
            
              FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Session has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
     
        
        
        
}