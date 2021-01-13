package appligapokemon;

import java.util.ArrayList;

public class Entrenador {
    private static ArrayList<Entrenador> trainerArray = new ArrayList<>();
    private String nombre;
    private String ciudad;
    private ArrayList<Pokemon>pokes=new ArrayList<>();

    public Entrenador(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Entrenador() {
    }

    public ArrayList<Pokemon> getPokes() {
        return pokes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //Métodos específicos
    
    //Crear entrenador
    public static String crearEntrenador(String nom, String ciud){
        try{
            trainerArray.add(new Entrenador(nom,ciud));
            return "Entrenador agregado con éxito";
            
        }catch(Exception e){
            return "Error:"+e.toString();
        
        }
    }
    
    //Buscar Entrenador
    public static Entrenador buscarEntrenador(String nom){
        for(Entrenador e : trainerArray){
            if(e.getNombre().equalsIgnoreCase(nom)){
                return e;
            }
            
        }
        return null;
    }
    public static String asignarPoke(String nom, Pokemon p){
        try { 
            Entrenador e = buscarEntrenador(nom);
            if(e !=null){
              
                     e.pokes.add(p);
                   return "Agregado exitosamente";  
                }else{
                return "Registre entrenador";
            }
            
               
      
            }catch (Exception e) {
                return e.toString();
        }  
    }
    public static String createTrainer(String nom, String cit){
        try{
            trainerArray.add(new Entrenador(nom, cit));
            return "Entrenador agregado";
            
        }catch(Exception e){
            return "Error: "+e.toString();
        }
    }
   /* 
    public String agregarPokes(String num, String nom, String tipo){
        if(pokes.size()<6){
            
            
        }

        return "Equipo completo";
    }
*/
    
}


