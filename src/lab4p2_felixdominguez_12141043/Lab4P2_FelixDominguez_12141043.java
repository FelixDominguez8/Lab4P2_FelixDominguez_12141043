/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felixdominguez_12141043;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Lenovo I7
 */
public class Lab4P2_FelixDominguez_12141043 {
    static Scanner lea=new Scanner (System.in);
    static ArrayList<Familia> familias=new ArrayList();
    static Random r=new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        familias.add(new Familia("Capuleto"));
        familias.add(new Familia("Montesco"));
        familias.add(new Familia("Vallecillos"));
        //((Familia)familias.get(0)).getAldeanos().add(new Normal("Julieta", "Capuleto", 18, 100));
        ((Familia)familias.get(1)).getAldeanos().add(new Supergranjero("Romeo", "Montesco", 18, 1000));
        ((Familia)familias.get(1)).getAldeanos().add(new Herrero("Carlos", "Montesco", 32, 800));
        ((Familia)familias.get(1)).getAldeanos().add(new Agronomo("Juan", "Montesco", 28, 600));
        ((Familia)familias.get(0)).getAldeanos().add(new Agronomo("Julia", "Capuleto", 22, 600));
        ((Familia)familias.get(0)).getAldeanos().add(new Herrero("Monica", "Capuleto", 28, 800));
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
                    int con=0;
                    for(int i=0;i<familias.size();i++){
                        if(((Familia)familias.get(i)).getLinaje().equals(linaje)){
                             con=1;
                        }
                    }
                    if(con==1){
                        System.out.println("La familia ya existe");
                    }else if(con==0){
                        familias.add(new Familia(linaje));
                    }
                    break;
                }
                case 2:{
                    System.out.println("1) Normal");
                    System.out.println("2) Pacifista");
                    System.out.println("3) Herrero");
                    System.out.println("4) Agronomo");
                    System.out.println("5) Explosivo");
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
                    int con=0;
                    for(int i=0;i<familias.size();i++){
                        if(((Familia)familias.get(i)).getLinaje().equals(apellido)){
                            con=1;
                            switch(tipo){
                                case 1:{
                                    ((Familia)familias.get(i)).getAldeanos().add(new Normal(nombre, apellido, edad, vida));
                                    break;
                                }
                                case 2:{
                                    ((Familia)familias.get(i)).getAldeanos().add(new Pacifista(nombre, apellido, edad, vida));
                                    break;
                                }
                                case 3:{
                                    vida=((vida/100)*50)+vida;
                                    ((Familia)familias.get(i)).getAldeanos().add(new Herrero(nombre, apellido, edad, vida));
                                    break;
                                }
                                case 4:{
                                    ((Familia)familias.get(i)).getAldeanos().add(new Agronomo(nombre, apellido, edad, vida));
                                    break;
                                }
                                case 5:{
                                    ((Familia)familias.get(i)).getAldeanos().add(new Explosivo(nombre, apellido, edad, vida));
                                    break;
                                }
                            }
                        }
                    }
                    if(con==0){
                        System.out.println("No existe la familia del aldeano");
                    }
                    break;
                }
                case 3:{
                    String salida="";
                    for(Object temp:familias){
                        salida+=""+familias.indexOf(temp)+" - "+temp+"\n";
                    }
                    System.out.println(salida);
                    break;
                }
                case 4:{
                    //((Familia)familias.get(0)).getAldeanos().remove(0);
                    int num=1;
                    while(num==1){
                        System.out.println("Ingrese la familia contra la cual los Montesco van a pelear: ");
                        lea.nextLine();
                        String familia=lea.nextLine();
                        int con=0;
                        int fam=0;
                        for(int i=0;i<familias.size();i++){
                            if(((Familia)familias.get(i)).getLinaje().equals(familia)){
                                 con=1;
                                 fam=i;
                            }
                        }
                        if(con==0){
                            System.out.println("La familia no existe");
                            break;
                        }
                        if(familias.size()>2 && familia.equals("Capuleto")){
                            System.out.println("Se debe de vencer a las demas familias antes de pelear contra la familia Capuleto");
                            break;
                        }
                        if(familia.equals("Montesco")){
                            System.out.println("La familia Montesco no puede pelear contra si misma");
                            break;
                        }
                        if(((Familia)familias.get(fam)).getAldeanos().isEmpty()){
                            System.out.println("La familia no contiene a ningun aldeano");
                            familias.remove(fam);
                            break;
                        }
                        int contro=1;
                        while (contro==1){
                            int ran=0+r.nextInt(((Familia)familias.get(fam)).getAldeanos().size());
                            int ran2=0+r.nextInt(((Familia)familias.get(1)).getAldeanos().size());
                            int vop=((Familia)familias.get(fam)).getAldeanos().get(ran).getVida();
                            int vat=((Familia)familias.get(1)).getAldeanos().get(ran2).Fallo();
                            int fop=((Familia)familias.get(fam)).getAldeanos().get(ran).Fallo();
                            int fat=((Familia)familias.get(1)).getAldeanos().get(ran2).getVida();
                            String tipo=((Familia)familias.get(fam)).getAldeanos().get(ran).Tipo();
                            String tipo2=((Familia)familias.get(1)).getAldeanos().get(ran2).Tipo();
                            int aop=((Familia)familias.get(fam)).getAldeanos().get(ran).getAtaque(tipo2);
                            int aat=((Familia)familias.get(1)).getAldeanos().get(ran2).getAtaque(tipo);
                            int muerte=0;
                            while (muerte==0){
                                
                                vop=vop-aat;
                                System.out.println(((Familia)familias.get(1)).getAldeanos().get(ran2).getNombre()+" hizo "+aat+" de daño");
                                System.out.println(((Familia)familias.get(fam)).getAldeanos().get(ran).getNombre()+" tiene "+vop+" de vida");
                                if(vop<1){
                                    muerte=1;
                                    System.out.println(((Familia)familias.get(fam)).getAldeanos().get(ran).getNombre()+" ha muerto");
                                    ((Familia)familias.get(fam)).getAldeanos().remove(ran);
                                    break;
                                }
                                System.out.println();
                                vat=vat-aop;
                                System.out.println(((Familia)familias.get(fam)).getAldeanos().get(ran).getNombre()+" hizo "+aop+" de daño");
                                System.out.println(((Familia)familias.get(1)).getAldeanos().get(ran2).getNombre()+" tiene "+vat+" de vida");
                                if(vat<1){
                                    muerte=1;
                                    System.out.println(((Familia)familias.get(1)).getAldeanos().get(ran2).getNombre()+" ha muerto");
                                    if(ran2==0){
                                        num=0;
                                    }
                                    ((Familia)familias.get(1)).getAldeanos().remove(ran2);
                                    break;
                                }
                                System.out.println();
                            }
                            System.out.println();
                            if(num==0){
                                break;
                            }
                            if(((Familia)familias.get(fam)).getAldeanos().isEmpty()){
                                familias.remove(fam);
                                contro=0;
                            }
                        }
                        
                        if(familias.size()==1){
                            System.out.println("!Los Montesco han ganado, ahora Romeo y Julieta podran estar juntos!");
                            break;
                        }
                        int rom=0;
                        for(int i=0;i<((Familia)familias.get(1)).getAldeanos().size();i++){
                            if(((Familia)familias.get(1)).getAldeanos().get(i).getNombre().equals("Romeo")){
                                 rom=1;
                            }
                        }
                        if(rom==0){
                            System.out.println("Romeo ha muerto, la familia Montesco ha perdido");
                        }
                    }
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
