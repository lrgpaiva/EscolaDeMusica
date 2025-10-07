/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

public class Bateria  extends InstrumentoMusical{
    private int numeroPecas;
    
    public Bateria (String nome, String material, int numeroPecas){
        super (nome, material);
        this.numeroPecas = numeroPecas;
    }
    
    @Override
    public voi tocar(){
        System.out.println("Marcando o ritmo no " + nome + " com " + this.getNumeroPecas()+ "pecas");
        System.out.println("Boom! Tss Boom! Tss");
    }
}
