/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Cola {
    
    int tamaño;
    int vector[];
    int miFinal;
    int tope;
    
    public Cola(int tamaño){
        this.tamaño = tamaño;
        vector = new int [tamaño];
        miFinal = -1;
    }
    
    public boolean esVacia(){
        if(miFinal == -1)
            return true;
        else 
            return false;
    }
    
    public boolean esLlena(){
        if(miFinal ==tamaño-1)
            
            return true;
        else 
            return false;
    }
    public void encolar(int e){
        if(esLlena())
            System.out.println("Cola llena, no se puede encolar");
        else{
            miFinal = miFinal+1;
            vector[miFinal] = e;
        }
    }
    public int desencolar(){
        if(esVacia())
        System.out.println("Cola vacia, no se puede desencolar");
        else
        {
            for(int i=0;i<miFinal;i++){
               
                vector[i]=vector[i+1];
            }
            miFinal = miFinal-1;
            
        }
        return vector[0];
        
        
    }
    public void verFrente(){
        if(esVacia())
        {
            System.out.println("Cola vacia");
        }
        else
        System.out.println("***Valor de Frente = " +vector[0]+"***");
    }
    public void mostrar(){
        if(esVacia())
            System.out.println("Cola Vacia");
        else{
            System.out.println("-------COLA------");
            for(int i=0; i<=miFinal; i++){
                System.out.print(vector[i]+"  ");
            }
            System.out.println("\n------------------");
        }
    }
    
}
