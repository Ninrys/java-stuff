package appligapokemon;

import java.util.ArrayList;

public class Pokemon {
    private static ArrayList<Pokemon> pokes = new ArrayList<>();
    private int numero;
    private String nombre;
    private String tipo;
    
    
//constructor
    public Pokemon(int numero, String nombre, String tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
   //constructor vacio
    public Pokemon() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Métodos específicos
    
    //Crea un pokemon
    public static String createPokemon(String n, String nom, String tip){
        try{
            pokes.add(new Pokemon(Integer.parseInt(n),nom,tip));
            return "Pokemon agregado";
                    
        }catch(Exception e){
            return "Error: "+e.toString();
            
        }
    }    

    public static Pokemon crearOtro(String n, String nom, String tipo){
    Pokemon a = new Pokemon();
       a.setNumero(Integer.parseInt(n));
       a.setNombre(nom);
       a.setTipo(tipo);
        return a;
    }
     public static Pokemon crearOtro1(String n, String nom, String tipo){
    Pokemon a = new Pokemon(Integer.parseInt(n),nom, tipo);
     
        return a;
    }
}

          