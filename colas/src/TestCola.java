
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ariadna
 */
public class TestCola {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int opc;
        
        System.out.println("Tamaño de cola: ");
        int t = s.nextInt();
        Cola c = new Cola(t);
        
        do{
            System.out.println("1.Encolar\n2.Desencolar"+"\n3.Mostrar frente\n4.Mostrar\n5.Salir");
            opc = s.nextInt();
            switch(opc){
                case 1: System.out.println("Numero: ");
                        c.encolar(s.nextInt());
                    break;
                case 2: c.desencolar();
                    break;
                case 3:c.verFrente();
                   
                    break;
                case 4: c.mostrar();
                    break;
                case 5: System.out.println("Fin del programa ");
                    break;
                default: System.out.println("Opcion incorrecta...!");
                    break;
                    
            }
        } while(opc!=5);

    
    }
    
    
    
}
