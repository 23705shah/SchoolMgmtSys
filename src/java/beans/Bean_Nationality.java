/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dao._ApsGlobNationality;
import eo.ApsGlobNationality;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Nationality implements java.io.Serializable {
    
        public ApsGlobNationality eo_dao = new ApsGlobNationality();

        public ApsGlobNationality getEo_pnl() {
            return eo_dao;
        }

        public void setEo_pnl(ApsGlobNationality eo_pnl) {
            this.eo_dao = eo_pnl;
        }

        public Bean_Nationality() {
            
        }
           
        public void save()
        {
             _ApsGlobNationality sdao=new _ApsGlobNationality();
             //System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_dao);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Nationality has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobNationality eo_na)
        {    
            _ApsGlobNationality sdao = new _ApsGlobNationality();
              sdao.deleteData(eo_na);
              
               FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Nationality has been Deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Nationality> getbyid(int id)
        { 
            _ApsGlobNationality sdao=new _ApsGlobNationality();
            List<Bean_Nationality> stud = sdao.getbyID(id);
            return stud;
        }
 
   
        
        public List<ApsGlobNationality> getallrecords()
        {
            _ApsGlobNationality sdao = new _ApsGlobNationality();
            List<ApsGlobNationality> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobNationality sdao=new _ApsGlobNationality();
            sdao.updateData(eo_dao);
            
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Nationality has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }

        
}