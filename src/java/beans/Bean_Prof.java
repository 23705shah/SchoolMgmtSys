/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dao._ApsGlobProf;
import eo.ApsGlobProf;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Prof implements java.io.Serializable {
    
        public ApsGlobProf eo_dao = new ApsGlobProf();

    public ApsGlobProf getEo_dao() {
        return eo_dao;
    }

    public void setEo_dao(ApsGlobProf eo_dao) {
        this.eo_dao = eo_dao;
    }

        

        public Bean_Prof() {
            
        }
           
        public void save()
        {
             _ApsGlobProf sdao=new _ApsGlobProf();
             //System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_dao);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Profession has been added successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobProf eo_prof)
        {    
            _ApsGlobProf sdao = new _ApsGlobProf();
              sdao.deleteData(eo_prof);
              
              FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Profession has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Prof> getbyid(int id)
        { 
            _ApsGlobProf sdao=new _ApsGlobProf();
            List<Bean_Prof> stud = sdao.getbyID(id);
            return stud;
        }
 
   
        
        public List<ApsGlobProf> getallrecords()
        {
            _ApsGlobProf sdao = new _ApsGlobProf();
            List<ApsGlobProf> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobProf sdao=new _ApsGlobProf();
            sdao.updateData(eo_dao);
            
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Profession has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }

        
}