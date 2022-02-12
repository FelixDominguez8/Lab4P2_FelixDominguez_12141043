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
public class Explosivo extends Aldeano{
    private int ataque;

    public Explosivo() {
    }

    public Explosivo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        this.ataque = 250;
    }
    
    @Override
    public String Tipo(){
        return "Explosivo";
    }

    @Override
    public int getAtaque(String tipo) {
        if(tipo.equals("Herrero")){
            ataque=((ataque/100)*5)+ataque;
        }
        if(tipo.equals("Agronomo")){
            ataque=((ataque/100)*10)+ataque;
        }
        return ataque;
    }
    
    @Override
    public int Fallo(){
        return 15;
    }
 
    @Override
    public String toString() {
        return super.toString() + "ataque=" + ataque;
    }
}
