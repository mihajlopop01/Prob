/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;

/**
 *
 * @author student2
 */
public class Adapter implements Komponenta{

    private Usluga usluga;

    public Adapter(Usluga usluga) {
        this.usluga = usluga;
    }
    
    
    @Override
    public String getNaziv() {
        return usluga.getNaziv();
    }

    @Override
    public String getSpecifikacija() {
        return usluga.getOpisAktivnosti();
    }

    @Override
    public BigDecimal getProdajnaCena() {
        return usluga.getCenaBezPDVa().add(usluga.getIznosPDVa());
    }

    @Override
    public String getDobavljac() {
        return usluga.getServiser();
    }
    
}
