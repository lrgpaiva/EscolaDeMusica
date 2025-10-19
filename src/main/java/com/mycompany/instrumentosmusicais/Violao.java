/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instrumentosmusicais;

/**
 *
 * @author lara
 */


public class Violao extends InstrumentosMusicais{
    private int cordas;
    
    public Violao(String nome, String material, int cordas){
        super(nome, material);
        this.cordas = cordas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando acordes do " + nome);
    }
    
    @Override 
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando as cordas");
    }
    
    @Override
    public void mostrarInformações(){
        super.mostrarInformações();
        System.out.println("Quantidade de Cordadas: " + cordas);
    }
    //metodo para receber o numero de cordas
    public int getCordas(){
        return cordas;
    }
}
