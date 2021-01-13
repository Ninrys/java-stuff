/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appligapokemon;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Ninry
 */
public class DueloPokemon {
    
    private static ArrayList<DueloPokemon> battles = new ArrayList<>();
    private String titulo;
    private int dia;
    private int mes;
    private int year;
    private String ciudad;
    private String fecha;
    private Entrenador[] participantes = new Entrenador[2];

    public DueloPokemon(String titulo, int dia, int mes, int year, String ciudad) {
        this.titulo = titulo;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.ciudad = ciudad;
        this.fecha = null;
    }
    

    public DueloPokemon() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Entrenador[] getCompetidor() {
        return participantes;
    }

    public void setCompetidor(Entrenador[] competidor) {
        this.participantes = competidor;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //Métodos específicos

    public static ArrayList<DueloPokemon> getLista() {
        return battles;
    }
    //Crear Duelo
    public static String createDuel(String nam, String cit){
        try{
            battles.add(new DueloPokemon(nam, 0,0,0, cit));
            
            return "Ingrese fecha";
                
        }catch(Exception e){
            return "Error: "+e.toString();
            
        }
    }
    
    // Retorna fecha en formato "el DD del MM del YYYY"
    public static void getFecha(DueloPokemon a){
        System.out.println("El duelo será el día " + a.getFecha());
           }
  
    // Establece una fecha y revisa que sea válida
    public static String setFecha(String d, String m, String a){ 
        DueloPokemon dp = battles.get(battles.size()-1);
        
        try {
            LocalDate.of(val(a), val(m), val(d)); //crea la fecha en formato aaaa-MM-dd y comprueba que existe uwu
            dp.setDia(val(d));
            dp.setMes(val(m));
            dp.setYear(val(a));
            
            
           dp.setFecha(DueloPokemon.toString(dp));
            
            return "Fecha valida";
            
        }catch (Exception e) {
            return"Fecha incorrecta, ingrese nuevamente";
            
        }
    }
    
    public static int val(String n){
        try{
            int x = Integer.parseInt(n);
            return x;
            
        }catch(Exception e){
            return -1;
        }
    }
    
    public static String toString (DueloPokemon dp){
        String mesAnu[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                           "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            
        
        String mensaje= dp.getDia() + " de " + mesAnu[dp.getMes()-1] +" de " + dp.getYear();
        return mensaje;
    }
}     
        
        