                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instrumentosmusicais;

/**
 *
 * @author lara
 */
public class EscolaMusical {
    
    public static void main(String[] args){
        System.out.println("Iniciando Orquestra");
        
    InstrumentosMusicais[] banda = new InstrumentosMusicais[4];
    
    banda[0] = new Violao("Violao Classico", "Madeira", 6);
    banda[1] = new Piano("Piano tradicional", "Madeira", 88);
    banda[2] = new Bateria("Bateria Acustica", "Metal", 5);
    banda[3] = new Saxofone("Saxofone", "Madeira", "Alto");
    
    
    EscolaMusical escola = new EscolaMusical();
    
        System.out.println("\n--Afinando Todos os instrumentos--");
        for(InstrumentosMusicais instrumento : banda){
             instrumento.afinar();
        }
        
        
        System.out.println("\n--Tocando todos os instrumentos--");
        for(InstrumentosMusicais instrumento : banda){
             instrumento.tocar();
        }
        
        System.out.println("\n--Informações de todos os instrumentos--");
        for(InstrumentosMusicais instrumento : banda){
             instrumento.mostrarInformações();
        }
        
    }
    
}
