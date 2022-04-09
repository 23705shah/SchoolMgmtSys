/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import dao._ApsAdmsPanel;
import dao._ApsGlobGender;
import eo.ApsAdmsPanel;
import eo.ApsGlobGender;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


/**
 *
 * @author 119401amman
 */
public class Bean_Gender implements java.io.Serializable{
    
    public ApsGlobGender eo_gndr = new ApsGlobGender();

    public ApsGlobGender getEo_gndr() {
        return eo_gndr;
    }

    public void setEo_gndr(ApsGlobGender eo_gndr) {
        this.eo_gndr = eo_gndr;
    }

    public Bean_Gender() {
    }
    
    //call save function 
        public void save()
        {
             _ApsGlobGender sdao=new _ApsGlobGender();
             System.out.println("check values for insertion" + sdao);
             sdao.addData(eo_gndr);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Gender has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
        
        // delete function
         public void delete(ApsGlobGender eo_dao)
        {    
            _ApsGlobGender sdao=new _ApsGlobGender();
             sdao.deleteData(eo_dao);
        }
         
         //Fetch Record for field
         
         public List<ApsGlobGender> getallrecords()
        {
            _ApsGlobGender sdao = new _ApsGlobGender();
            List<ApsGlobGender> ObjLst = sdao.retrieveData();
            return ObjLst;
        }
         
         // Edit and Update Record func
          public void update()
        {
                _ApsGlobGender sdao=new _ApsGlobGender();
                sdao.updateData(eo_gndr);
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Gender has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
         
    
}
