package eo;
// Generated Jan 6, 2021 9:03:38 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ApsGlobSec generated by hbm2java
 */
public class ApsGlobSec  implements java.io.Serializable {


     private Integer secid;
     private String descr;
     private Set apsAdmAdmsForSibling2Sec = new HashSet(0);
     private Set apsAdmAdmsForSibling1Sec = new HashSet(0);

    public ApsGlobSec() {
    }

    public ApsGlobSec(String descr, Set apsAdmAdmsForSibling2Sec, Set apsAdmAdmsForSibling1Sec) {
       this.descr = descr;
       this.apsAdmAdmsForSibling2Sec = apsAdmAdmsForSibling2Sec;
       this.apsAdmAdmsForSibling1Sec = apsAdmAdmsForSibling1Sec;
    }
   
    public Integer getSecid() {
        return this.secid;
    }
    
    public void setSecid(Integer secid) {
        this.secid = secid;
    }
    public String getDescr() {
        return this.descr;
    }
    
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public Set getApsAdmAdmsForSibling2Sec() {
        return this.apsAdmAdmsForSibling2Sec;
    }
    
    public void setApsAdmAdmsForSibling2Sec(Set apsAdmAdmsForSibling2Sec) {
        this.apsAdmAdmsForSibling2Sec = apsAdmAdmsForSibling2Sec;
    }
    public Set getApsAdmAdmsForSibling1Sec() {
        return this.apsAdmAdmsForSibling1Sec;
    }
    
    public void setApsAdmAdmsForSibling1Sec(Set apsAdmAdmsForSibling1Sec) {
        this.apsAdmAdmsForSibling1Sec = apsAdmAdmsForSibling1Sec;
    }




}

