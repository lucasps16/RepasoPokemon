/*Arreglo dinamico: el tamaño del arreglo aumenta cada vez que se agrega un 
 objeto al arreglo.
*/
package javaapplication11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public void Conjunto(){
        PokemonFuego slugma = new PokemonFuego("Slugma", 0);
        PokemonFuego charmander = new PokemonFuego("Charmander", 0);
        Set<PokemonFuego> conjuntoPokemon = new HashSet<>();
        conjuntoPokemon.add(slugma);
        conjuntoPokemon.add(charmander);
        conjuntoPokemon.add(new PokemonFuego("Charizard", 15));
        conjuntoPokemon.add(new PokemonFuego("Vulpix", 15));
        
        for(PokemonFuego pokemon: conjuntoPokemon){
            
        }
        
        for(Iterator<PokemonFuego> iterador = conjuntoPokemon.iterator(); iterador.hasNext();){
            PokemonFuego pokemon = iterador.next();
            System.out.println(pokemon.getNombre());
        }
        
        
        
        
    }
    
    public void List(){
        
         PokemonFuego slugma = new PokemonFuego("fasdgfa", 0);
        PokemonFuego charmander = new PokemonFuego("Ughasiug", 0);
        charmander.setNombre("Charmander");
        slugma.setNombre("Slugma");
        //Arreglo dinamico
        ArrayList<PokemonFuego> pokemones = new ArrayList<>();
        
        pokemones.add(slugma);
        pokemones.add(charmander);
        pokemones.add(slugma);
        
        System.out.println(pokemones.get(0).getNombre());
    }
    
    public void Diccionario(){
        
        
         HashMap<String,PokemonFuego> pokedex = new HashMap<String,PokemonFuego>();
        pokedex.put("Pokemon 1", new PokemonFuego("Cahrizard", 0));
        pokedex.put("Pokemon 2", new PokemonFuego("Charmander", 0));
        pokedex.put("Pokemon 3", new PokemonFuego("Slugma", 0));
        pokedex.put("Pokemon 4", new PokemonFuego("Vulpix", 0));
        
       
        
        System.out.println( pokedex.get("Pokemon 3").getNombre());
        
        
    }

    
    public static void main(String[] args) {
        
        
        Main obj = new Main();
        
        System.out.println("CONJUNTO");
        obj.Conjunto();
        System.out.println("------------------------");
        System.out.println("DICCIONARIO");
        obj.Diccionario();
        System.out.println("------------------------");
        System.out.println("LISTA");
        obj.List();


    }
    
}
