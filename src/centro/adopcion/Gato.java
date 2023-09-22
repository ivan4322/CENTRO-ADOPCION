/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro.adopcion;

/**
 *
 * @author Ivan
 */

public class Gato {
    
  private int edad,peso,id;
          ;
   private String nombre;

    public Gato() {
        
    }

    public Gato(String nombre, int edad, int peso, int id) {
        this.edad = edad;
        this.peso = peso;
        this.id = id;
        
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }
    
    

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void mostrarDatos (String nombre,int edad, int peso, int id){
        System.out.println("\nel nombre es :  " + nombre + " \n la edad es: " + edad + " \n el peso es: "+ peso+ " \n el id es: " + id);
    }
    
   
    
    
    
}

