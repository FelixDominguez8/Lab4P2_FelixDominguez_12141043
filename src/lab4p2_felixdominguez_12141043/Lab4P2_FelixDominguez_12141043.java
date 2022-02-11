/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixdominguez_12141043;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lenovo I7
 */
public class Lab4P2_FelixDominguez_12141043 {
    static Scanner lea=new Scanner (System.in);
    static ArrayList<Familia> familias=new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char resp='s';
        while(resp=='s' || resp=='S'){
            System.out.println("");
            System.out.println("1) Crear familia");
            System.out.println("2) Crear aldeano");
            System.out.println("3) Listar familia");
            System.out.println("4) Pelea");
            System.out.println("5) Salir");
            System.out.println("Ingrese la opcion que desea: ");
            int opcion=lea.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese el linaje (Apellido): ");
                    lea.nextLine();
                    String linaje=lea.nextLine();
                    familias.add(new Familia(linaje));
                    break;
                }
                case 2:{
                    System.out.println("1) Normal");
                    System.out.println("2) Pacifista");
                    System.out.println("3) Herrero");
                    System.out.println("4) Agronomo");
                    System.out.println("5) Explosivo");
                    System.out.println("6) Supergranjero");
                    System.out.println("Que tipo de aldeano desea: ");
                    int tipo=lea.nextInt();
                    System.out.println("Ingrese el nombre: ");
                    lea.nextLine();
                    String nombre=lea.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido=lea.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad=lea.nextInt();
                    System.out.println("Ingrese la vida: ");
                    int vida=lea.nextInt();
                    for(int i=0;i<familias.size();i++){
                        
                    }
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    resp='n';
                    break;
                }
            }
        }
    }
}
