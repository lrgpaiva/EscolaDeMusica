/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instrumentosmusicais;

/**
 *
 * @author lara
 */
public class Piano extends InstrumentosMusicais{
    private int teclas;
    
    public Piano(String nome, String material, int teclas){
        super(nome, material);
        this.teclas = teclas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando teclas do " + nome);
    }
    
    @Override 
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando as cordas");
    }
    
    @Override
    public void mostrarInformações(){
        super.mostrarInformações();
        System.out.println("Quantidade de teclas: " + teclas);
    }
   
    public int getTeclas(){
        return teclas;
    }
}
