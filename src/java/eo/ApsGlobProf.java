package eo;
// Generated Jan 6, 2021 9:03:38 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ApsGlobProf generated by hbm2java
 */
public class ApsGlobProf  implements java.io.Serializable {


     private Integer professionid;
     private String descr;
     private Set apsAdmAdms = new HashSet(0);

    public ApsGlobProf() {
    }

    public ApsGlobProf(String descr, Set apsAdmAdms) {
       this.descr = descr;
       this.apsAdmAdms = apsAdmAdms;
    }
   
    public Integer getProfessionid() {
        return this.professionid;
    }
    
    public void setProfessionid(Integer professionid) {
        this.professionid = professionid;
    }
    public String getDescr() {
        return this.descr;
    }
    
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public Set getApsAdmAdms() {
        return this.apsAdmAdms;
    }
    
    public void setApsAdmAdms(Set apsAdmAdms) {
        this.apsAdmAdms = apsAdmAdms;
    }




}


