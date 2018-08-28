/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Estudiante
 */
public class PokemonFuego extends Pokemon {
    
    private String colorLlama;
    
    public PokemonFuego(String nombre, int puntosAtaque, int lvl, int edad) {
        super(nombre, puntosAtaque, lvl, edad);
        
    }

    public PokemonFuego(String nombre, int puntosAtaque, int lvl, int edad, String colorLlama ) {
        super(nombre, puntosAtaque, lvl, edad);
        this.colorLlama = colorLlama;
    }
    
    
    
    public void escupirFuego(){
        System.out.println("Escupiendo");
    }
    
}
