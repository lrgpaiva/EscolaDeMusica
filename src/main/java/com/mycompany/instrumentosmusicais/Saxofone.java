/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instrumentosmusicais;

/**
 *
 * @author lara
 */
public class Saxofone extends InstrumentosMusicais{
    private String tipo;
    
    public Saxofone(String nome, String material, String tipo){
        super(nome, material);
        this.tipo = tipo;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando alto o " + nome);
    }
    
    @Override 
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a palheta");
    }
    
    @Override
    public void mostrarInformações(){
        super.mostrarInformações();
        System.out.println("Tipo do Saxofone: " + tipo);
    }
    
    //metodo para receber o tipo do saxofone - alto, baixo...
    public String getTipo(){
        return tipo;
    }
    
}
