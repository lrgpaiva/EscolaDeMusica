/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.instrumentosmusicais;

/**
 *
 * @author lara
 */
public abstract class InstrumentosMusicais {
    
    protected String nome;
    protected String material;
 
    public InstrumentosMusicais(String nome, String material){
        this.nome = nome;
        this.material = material;
    }
     
     
     //metodo abstrato
     public abstract void tocar();
      
     
     //metodos concretos
     public void afinar(){   
         System.out.println("Afinando o " + nome);
     }
    
     
    public void mostrarInformações(){
        System.out.println("\nInstrumento: " + nome);
        System.out.println("Material: " + material);
    }
   
    
    public String getNome(){
        return nome;
    }
    
    public String getMaterial(){
        return material;
    }
    
}
