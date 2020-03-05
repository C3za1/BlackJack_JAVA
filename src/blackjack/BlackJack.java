/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LBSWR_20
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
       
        System.out.println("BIENVENIDOS AL JUEGO DE BLACKJACK!...\n");
        
        
         //capturar informacion que introduce con teclado 
        Scanner ca=new Scanner(System.in);
        
        //random es para generar numeros aleatorios
        Random rm=new Random();
        Random rm2=new Random();
        
        //declaracion de los metodos intansiados x tipo entero
        int cartas;
        int opc;
        int salir;
        int valor;
        int valor2;
        int suma=0;
        
        //es para crear un objeto de la clase pila
        Pila p1=new Pila();
        Pila p2=new Pila();
        
        
        do
        {
            
            System.out.println("jugador 1");
          cartas=rm.nextInt(13+1);
          
            System.out.println("sacar carta");
            p1.Insertar(cartas);
           
            valor =p1.sumar();
            
           if(valor<=21)
            {
               //es para mostrar la carta anterior mas las cartas
               System.out.println("carta anterior  "+cartas);
               
               //es para mostrar el puntaje de las cartas
               System.out.println("puntaje anterior  "+(valor-cartas));
               
               //es para mostrar el puntaje
               System.out.println("puntaje "+valor);
            }
           
           else
            {
               //es para mostrar la carta anterior mas las cartas
               System.out.println("carta anterior  "+cartas);
               //es para mostrar el puntaje anterior
               System.out.println("puntaje anterior  "+(valor-cartas));
               //es para mostrar que ha perdido mas el valor
               System.out.println("  ha perdido   "+valor);
            }
               // \n es un salto de linea
               //es para mostrar el jugador 2
               System.out.println("\njugador 2");
           
               cartas=rm.nextInt(13);
             System.out.println("sacar carta");
             p2.Insertar(cartas);
              //p1.Imprimir();
            valor2 =p2.sumar();
            
           if(valor2<=21)
           {
               
               System.out.println("carta anterior  "+cartas);
               System.out.println("puntaje anterior  "+(valor2-cartas));
               System.out.println("tu puntaje "+valor2);
           }
           else
            {
               System.out.println("carta anterior  "+cartas);
               System.out.println("puntaje anterior  "+(valor2-cartas));
               
               System.out.println(" lo ciento ha perdido "+valor2);
            }
           
           
               if(valor==21)
               {
                   System.out.println("felicidades ha ganado");
               }
               if(valor2==21)
               {
                   System.out.println("felicidades ha ganado");
               }
               
              System.out.println("Quieres continuar???\nsi 1, no 0");
            salir=ca.nextInt();
            
        }while(salir!=0 && valor <21 && valor2< 21);
        
        
        
        
             System.out.println("cartas del primer jugador");
             p1.Imprimir();
             if(valor<=21)
               {
                   System.out.println("felicidades ha ganado");
               }
            else
            {
                System.out.println("lo ciento ha perdido");
            }
        System.out.println("cartas del segundo  jugador");
            p2.Imprimir();
            
               if(valor2<=21)
               {
                   //es para mostrar que ha ganado
                   System.out.println("felicidades ha ganado");
               }
               else
               {
                 //es para mostrar que ha perdido
                System.out.println("lo ciento ha perdido");
               }
               
    }
}
