/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dao._ApsGlobRank;
import eo.ApsGlobRank;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Rank implements java.io.Serializable {
    
        public ApsGlobRank eo_dao = new ApsGlobRank();

        public ApsGlobRank getEo_dao() {
            return eo_dao;
        }

        public void setEo_dao(ApsGlobRank eo_dao) {
            this.eo_dao = eo_dao;
        }

       

        public Bean_Rank() {
            
        }
           
        public void save()
        {
             _ApsGlobRank sdao=new _ApsGlobRank();
             //System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_dao);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Rank has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobRank objRank)
        {    
            _ApsGlobRank sdao = new _ApsGlobRank();
              sdao.deleteData(objRank);
              
              
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Rank has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Rank> getbyid(int id)
        { 
            _ApsGlobRank sdao=new _ApsGlobRank();
            List<Bean_Rank> stud = sdao.getbyID(id);
            return stud;
        }
 
   
        
        public List<ApsGlobRank> getallrecords()
        {
            _ApsGlobRank sdao = new _ApsGlobRank();
            List<ApsGlobRank> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobRank sdao=new _ApsGlobRank();
            sdao.updateData(eo_dao);
            
            
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Rank has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }

        
}