/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import dao._ApsGlobInstitutes;
import eo.ApsGlobInstitutes;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Institutes implements java.io.Serializable {
    
        public ApsGlobInstitutes eo_pnl = new ApsGlobInstitutes();

    public ApsGlobInstitutes getEo_pnl() {
        return eo_pnl;
    }

    public void setEo_pnl(ApsGlobInstitutes eo_pnl) {
        this.eo_pnl = eo_pnl;
    }

   
       
 
        public Bean_Institutes() {
            
        }
           
        public void save()
        {
             _ApsGlobInstitutes sdao=new _ApsGlobInstitutes();
             System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_pnl);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Institutes has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobInstitutes eo_pnl)
        {    
            _ApsGlobInstitutes sdao=new _ApsGlobInstitutes();
             sdao.deleteData(eo_pnl);
        }
        
       
 
        public List<Bean_Institutes> getbyid()
        { 
            _ApsGlobInstitutes sdao=new _ApsGlobInstitutes();
            List<Bean_Institutes> stud = sdao.getbyID(1);
            //panelid=stud.get(0).panelid;
            //descr=stud.get(0).descr;
            return stud;
        }
 
   
        
        public List<ApsGlobInstitutes> getallrecords()
        {
            _ApsGlobInstitutes sdao = new _ApsGlobInstitutes();
            List<ApsGlobInstitutes> objLst = sdao.retrieveData();
            return objLst;
        }
 
        public void update()
        {
            _ApsGlobInstitutes sdao=new _ApsGlobInstitutes();
            
            System.out.println("Check me Amman"+eo_pnl);
            sdao.updateData(eo_pnl);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Institutes has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }

         
}