/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dao._ApsGlobSec;
import eo.ApsGlobSec;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Sec implements java.io.Serializable {
    
        public ApsGlobSec eo_dao = new ApsGlobSec();

        public ApsGlobSec getEo_dao() {
            return eo_dao;
        }

        public void setEo_dao(ApsGlobSec eo_dao) {
            this.eo_dao = eo_dao;
        }

        

        public Bean_Sec() {
            
        }
           
        public void save()
        {
             _ApsGlobSec sdao=new _ApsGlobSec();
             sdao.addData(eo_dao);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Section has been registered successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobSec objDel)
        {    
            _ApsGlobSec sdao = new _ApsGlobSec();
              sdao.deleteData(objDel);
              
               FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Section has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Sec> getbyid(int id)
        { 
            _ApsGlobSec sdao=new _ApsGlobSec();
            List<Bean_Sec> stud = sdao.getbyID(id);
            return stud;
        }
        
        public List<ApsGlobSec> getallrecords()
        {
            _ApsGlobSec sdao = new _ApsGlobSec();
            List<ApsGlobSec> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobSec sdao=new _ApsGlobSec();
            sdao.updateData(eo_dao);
            
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Section has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
}