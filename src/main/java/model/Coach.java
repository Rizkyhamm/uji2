/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Dewi
 */

public class Coach {
    private UUID cid;
    private String us;
    private String pw;
    private String nama;
    private String gender;
    private String usia;
    private String pengalaman;

    public Coach(String us,String pw,String nama,String gender,String usia,String pengalaman) {
        this.setUs(us);
        this.setPw(pw);
        this.setNama(nama);
        this.setGender(gender);
        this.setUsia(usia);
        this.setPengalaman(pengalaman);
        UUID uuid = UUID.randomUUID();
        this.setCid(uuid);
    }
    
    
    public Coach(UUID cid,String us,String pw,String nama,String gender,String usia,String pengalaman) {
        this.setCid(cid);
        this.setUs(us);
        this.setPw(pw);
        this.setNama(nama);
        this.setGender(gender);
        this.setUsia(usia);
        this.setPengalaman(pengalaman);
        //UUID uuid = UUID.randomUUID(); 
    }

    public UUID getCid() {
        return cid;
    }

    public void setCid(UUID cid) {
        this.cid = cid;
    }

    

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(String pengalaman) {
        this.pengalaman = pengalaman;
    }
    
}
