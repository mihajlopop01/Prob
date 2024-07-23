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
public class InstalacijaOS extends AbstractUsluga{
    private String operativniSistem;

    public InstalacijaOS(String naziv, String opisAktivnosti, BigDecimal cenaBezPDVa, BigDecimal iznosPDVa, String serviser, String operativniSistem) {
        super(naziv, opisAktivnosti, cenaBezPDVa, iznosPDVa, serviser);
        this.operativniSistem = operativniSistem;
    }

    @Override
    public String getNaziv() {
        return super.getNaziv() + "[v: "+operativniSistem+"]"; 
    }
    
}
