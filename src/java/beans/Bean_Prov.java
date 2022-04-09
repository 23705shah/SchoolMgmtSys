/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao._ApsGlobProv;
import eo.ApsGlobProv;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Prov implements java.io.Serializable {
    
        public ApsGlobProv eo_dao = new ApsGlobProv();

        public ApsGlobProv getEo_pnl() {
            return eo_dao;
        }

        public void setEo_pnl(ApsGlobProv eo_pnl) {
            this.eo_dao = eo_pnl;
        }

        public Bean_Prov() {
            
        }
           
        public void save()
        {
             _ApsGlobProv sdao=new _ApsGlobProv();
             sdao.addData(eo_dao);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Province has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobProv eo_prv)
        {    
            _ApsGlobProv sdao = new _ApsGlobProv();
              sdao.deleteData(eo_prv);
              
               FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Province has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Prov> getbyid(int id)
        { 
            _ApsGlobProv sdao=new _ApsGlobProv();
            List<Bean_Prov> stud = sdao.getbyID(id);
            return stud;
        }
        
        public List<ApsGlobProv> getallrecords()
        {
            _ApsGlobProv sdao = new _ApsGlobProv();
            List<ApsGlobProv> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobProv sdao=new _ApsGlobProv();
            sdao.updateData(eo_dao);
            
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Province has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
            
        }
        
}