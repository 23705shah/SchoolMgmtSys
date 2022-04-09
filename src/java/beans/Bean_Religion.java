/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dao._ApsGlobReligion;
import eo.ApsGlobReligion;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Religion implements java.io.Serializable {
    
        public ApsGlobReligion eo_dao = new ApsGlobReligion();

        public ApsGlobReligion getEo_dao() {
            return eo_dao;
        }

        public void setEo_dao(ApsGlobReligion eo_dao) {
            this.eo_dao = eo_dao;
        }

        

        public Bean_Religion() {
            
        }
           
        public void save()
        {
             _ApsGlobReligion sdao=new _ApsGlobReligion();
             //System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_dao);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Religion has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobReligion objRel)
        {    
            _ApsGlobReligion sdao = new _ApsGlobReligion();
              sdao.deleteData(objRel);
              FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Religion has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Religion> getbyid(int id)
        { 
            _ApsGlobReligion sdao=new _ApsGlobReligion();
            List<Bean_Religion> stud = sdao.getbyID(id);
            return stud;
        }
 
   
        
        public List<ApsGlobReligion> getallrecords()
        {
            _ApsGlobReligion sdao = new _ApsGlobReligion();
            List<ApsGlobReligion> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobReligion sdao=new _ApsGlobReligion();
            sdao.updateData(eo_dao);
            
              FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Religion has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }

        
}