/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixdominguez_12141043;

/**
 *
 * @author Lenovo I7
 */
public class Supergranjero extends Aldeano{
    private int ataque;

    public Supergranjero() {
    }

    public Supergranjero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.ataque = 1000;
    }
    
    @Override
    public String Tipo(){
        return "Supergranjero";
    }

    @Override
    public int getAtaque(String tipo) {
        if(tipo.equals("Herrero")){
            ataque=((ataque/100)*10)+ataque;
        }
        if(tipo.equals("Explosivo")){
            ataque=((ataque/100)*15)+ataque;
        }
        return ataque;
    }
    
    @Override
    public int Fallo(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "ataque=" + ataque;
    }
}
