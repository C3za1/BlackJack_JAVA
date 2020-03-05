/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author LBSWR_20
 */
public class Pila 
{
    
   public class nodo 
    {
       
       //declaracion de variables
       //esta instanciado x dos variables uno x tipo entero  y el otro de tipo nodo
      int info;
      nodo sig;
   
     }
   
    private nodo raiz;
    
    public Pila()
    {
        raiz =null;
     }
    
    
    public void Insertar(int x)
    {
        nodo nuevo;
        nuevo=new nodo();
        nuevo.info=x;
        //if es la  instrucción de condicionamiento
        if(raiz==null)
        {
            nuevo.sig=null;
            raiz=nuevo;
        }
        else
        {
            nuevo.sig=raiz;
            raiz=nuevo;
        }
    }
    
    
        public int Extraer()
        {
            if(raiz!=null)
            {
                int informacion=raiz.info;
                raiz=raiz.sig;
                return informacion;
            }
            else
            {
             return Integer.MAX_VALUE;
            }
        }
        
        public void Imprimir()
        {
            nodo reco=raiz;
             //System.out.println("Listado de todos los elementos de la pila");
             while(reco!=null)
            {
                System.out.println("-   "+reco.info+"   -");
                reco=reco.sig;
             }
        }
        
        public int sumar()
        {
            nodo reco=raiz;
            int sumatoria=0;
            while(reco!=null)
            {
                sumatoria+=reco.info;
               //System.out.println("-   "+reco.info+"   -"+sumatoria);
                reco=reco.sig;
                
                
             }
            return sumatoria;
        }
        
}
