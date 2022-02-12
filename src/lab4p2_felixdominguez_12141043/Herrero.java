/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixdominguez_12141043;
import java.util.Random;
/**
 *
 * @author Lenovo I7
 */
public class Herrero extends Aldeano{
    private int ataque;
    Random r=new Random();

    public Herrero() {
    }

    public Herrero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        int ra=200+r.nextInt(300);
        this.ataque = ra;
    }
    
    @Override
    public String Tipo(){
        return "Herrero";
    }
    
    @Override
    public int getAtaque(String tipo) {
        if(tipo.equals("Agronomo")){
            ataque=((ataque/100)*10)+ataque;
        }
        if(tipo.equals("Pacifista")){
            ataque=((ataque/100)*5)+ataque;
        }
        return ataque;
    }
    
    @Override
    public int Fallo(){
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + "ataque=" + ataque;
    }
}
