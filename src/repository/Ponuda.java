/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domain.CPU;
import domain.CiscenjeVirusa;
import domain.InstalacijaOS;
import domain.Komponenta;
import domain.Adapter;
import domain.Memorija;
import domain.Monitor;
import domain.Usluga;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cartman
 */
public class Ponuda {
    
    private List<Komponenta> komponente;
    private List<Usluga> usluge;

    public Ponuda() {
        komponente=new ArrayList<>();
        Komponenta k1=new Monitor("AOC", new BigDecimal(40000), "CT", 29, "1920x1080");
        Komponenta k2=new CPU("Intel", new BigDecimal(60000), "Saga", 4.2, 16);
        Komponenta k3=new Memorija("Kingston", new BigDecimal(8000), "CT", 8, 3.6);
        Komponenta k4=new Monitor("Lenovo", new BigDecimal(35000), "Saga", 15.6, "1920x1080");
        komponente.add(k1);
        komponente.add(k2);
        komponente.add(k3);
        komponente.add(k4);

        usluge=new ArrayList<>();
        Usluga u1=new InstalacijaOS("Instalacija OS Windows", "1. backup podataka, 2. instalacija, 3. podesavanja...", new BigDecimal(6000), new BigDecimal(1200), "Pera Peric", "Windows 12 Server");
        Usluga u2=new CiscenjeVirusa("Duboko ciscenje virusa", "1. instalacija, 2. pretraga, 3. brisanje...", new BigDecimal(5000),new BigDecimal(1000), "Zika Zivkovic", "Kasperski Lab. 5.3");
        Usluga u3=new CiscenjeVirusa("Zastita WEB", "1. instalacija, 2. pretraga, 3. podesavanje...", new BigDecimal(5000),new BigDecimal(1000), "Laza Lazarevic", "Avast");
        usluge.add(u1);
        usluge.add(u2);
        usluge.add(u3);
        
        for (Usluga usluga : usluge) {
            komponente.add(new Adapter(usluga));
        }
    }
    
    public List<Komponenta> vratiSadrzajPonude(){
        return komponente;
    }
    
}
