package eo;
// Generated Jan 6, 2021 9:03:38 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ApsAdmsSession generated by hbm2java
 */
public class ApsAdmsSession  implements java.io.Serializable {


     private Integer sessionid;
     private String title;
     private Set apsAdmAdms = new HashSet(0);

    public ApsAdmsSession() {
    }

    public ApsAdmsSession(String title, Set apsAdmAdms) {
       this.title = title;
       this.apsAdmAdms = apsAdmAdms;
    }
   
    public Integer getSessionid() {
        return this.sessionid;
    }
    
    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Set getApsAdmAdms() {
        return this.apsAdmAdms;
    }
    
    public void setApsAdmAdms(Set apsAdmAdms) {
        this.apsAdmAdms = apsAdmAdms;
    }




}


