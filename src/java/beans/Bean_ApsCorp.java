/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao._ApsGlobCorpRegt;
import eo.ApsGlobCorpsregt;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_ApsCorp implements java.io.Serializable {
    
        public ApsGlobCorpsregt eo_pnl = new ApsGlobCorpsregt();

    public ApsGlobCorpsregt getEo_pnl() {
        return eo_pnl;
    }

    public void setEo_pnl(ApsGlobCorpsregt eo_pnl) {
        this.eo_pnl = eo_pnl;
    }
        
       
 
        public Bean_ApsCorp() {
            
        }
           
        public void save()
        {
             _ApsGlobCorpRegt sdao=new _ApsGlobCorpRegt();
             System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_pnl);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Corp Regt has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
         public void delete(ApsGlobCorpsregt eo_pnl)
        {    
            _ApsGlobCorpRegt sdao=new _ApsGlobCorpRegt();
             sdao.deleteData(eo_pnl);
        }
 
        public List<Bean_ApsCorp> getbyid()
        { 
            _ApsGlobCorpRegt sdao=new _ApsGlobCorpRegt();
            List<Bean_ApsCorp> stud = sdao.getbyID(1);
            
            return stud;
        }
 
   
        
        public List<ApsGlobCorpsregt> getallrecords()
        {
            _ApsGlobCorpRegt sdao = new _ApsGlobCorpRegt();
            List<ApsGlobCorpsregt> pnlLst = sdao.retrieveData();
            return pnlLst;
        }
 
        
          
        
        public void update()
        {
            _ApsGlobCorpRegt sdao=new _ApsGlobCorpRegt();
            //System.out.println("Check me Amman"+eo_pnl);
            sdao.updateData(eo_pnl);
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Corps Regt has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
}