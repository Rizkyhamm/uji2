/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.User;
import java.util.UUID;

/**
 *
 * @author LENOVO
 */
public class Course {
   private UUID coid;
   private String namaCourse;
   private int kuota;
   private User owner;

    public UUID getCoid() {
        return coid;
    }

    public void setCoid(UUID coid) {
        this.coid = coid;
    }

    public String getNamaCourse() {
        return namaCourse;
    }

    public void setNamaCourse(String namaCourse) {
        this.namaCourse = namaCourse;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public Course(String namaCourse, int kuota, User owner) {
        this.namaCourse = namaCourse;
        UUID coid = UUID.randomUUID();
        this.setCoid(coid);
        this.kuota = kuota;
        this.owner = owner;
    }
    
    public Course(UUID coid, String namaCourse, int kuota, User owner) {
        this.coid = coid;
        this.namaCourse = namaCourse;
        this.kuota = kuota;
        this.owner = owner;
    }
    
    
   
}
