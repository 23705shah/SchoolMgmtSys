/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao._ApsGlobClass;
import eo.ApsGlobClass;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author 119401amman
 */
public class Bean_Class implements java.io.Serializable {
    
    public ApsGlobClass eo_cls = new ApsGlobClass();

    public ApsGlobClass getEo_cls() {
        return eo_cls;
    }

    public void setEo_cls(ApsGlobClass eo_cls) {
        this.eo_cls = eo_cls;
    }

    
       
       
            
        public Bean_Class() {
            
        }
           
        public void save()
        {
             _ApsGlobClass cls_dao=new _ApsGlobClass();
             System.out.println("check values for insertion" + cls_dao);
             cls_dao.addClass(eo_cls);
             
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Class has been created successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public void delete(ApsGlobClass objCls)
        {    
            _ApsGlobClass sdao=new _ApsGlobClass();
            sdao.deleteClass(objCls);
            
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Class has been deleted successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
 
        public List<Bean_Class> getbyid()
        { 
            _ApsGlobClass sdao=new _ApsGlobClass();
            List<Bean_Class> stud = sdao.getbyID(1);
            //panelid=stud.get(0).panelid;
            //descr=stud.get(0).descr;
            return stud;
        }
 
   
        
        public List<ApsGlobClass> getallrecords()
        {
            _ApsGlobClass sdao = new _ApsGlobClass();
            List<ApsGlobClass> clsLst = sdao.retrieveClass();
            return clsLst;
        }
 
        public void update()
        {
            _ApsGlobClass sdao=new _ApsGlobClass();
            sdao.updateClass(eo_cls);
            
             FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Class has been updated successfully.", null);
             FacesContext.getCurrentInstance().addMessage(null, message);
        }
    
}
