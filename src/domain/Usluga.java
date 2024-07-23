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
public interface Usluga {
    String getNaziv();
    String getOpisAktivnosti();
    BigDecimal getCenaBezPDVa();
    BigDecimal getIznosPDVa();
    String getServiser();
}
