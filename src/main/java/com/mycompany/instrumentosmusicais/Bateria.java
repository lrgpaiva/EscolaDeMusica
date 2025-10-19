/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instrumentosmusicais;

/**
 *
 * @author lara
 */
public class Bateria extends InstrumentosMusicais{
    private int qntdd;
    
    public Bateria(String nome, String material, int qntdd){
        super(nome, material);
        this.qntdd = qntdd;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando Forte o " + nome);
    }
    
    @Override 
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando as cordas");
    }
    
    @Override
    public void mostrarInformações(){
        super.mostrarInformações();
        System.out.println("Quantidade de pecas: " + qntdd);
    }
    
    //metodo para receber a qntdd de caixas
    public int getQntdd(){
        return qntdd;
    }
    
}