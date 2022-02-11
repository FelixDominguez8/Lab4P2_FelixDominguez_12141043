/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixdominguez_12141043;

import java.util.ArrayList;

/**
 *
 * @author Lenovo I7
 */
public class Familia {
    private String linaje;
    private ArrayList<Aldeano> aldeanos=new ArrayList();

    public Familia() {
    }

    public Familia(String linaje) {
        this.linaje = linaje;
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }

    public ArrayList<Aldeano> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeano> aldeanos) {
        this.aldeanos = aldeanos;
    }

    @Override
    public String toString() {
        return "linaje=" + linaje + ", aldeanos=" + aldeanos;
    }
    
    
}
