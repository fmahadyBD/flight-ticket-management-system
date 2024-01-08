/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airbangla;

/**
 *
 * @author Mahady Hasan Fahim
 */
public class Selection {
    
        String place;
        public String time;
        public String cls;
        public String nt;
        public String id;
        public String taka;
       
        


    public Selection(String place, String time, String cls,String nt,String id,String taka) {
        this.place = place;
        this.time = time;
        this.cls = cls;
        this.nt = nt;
        this.id = id;
        this.taka = taka;
        
    }
      public boolean macthid(String rid){
      return  this.id.contentEquals(rid);
    }
    
}
