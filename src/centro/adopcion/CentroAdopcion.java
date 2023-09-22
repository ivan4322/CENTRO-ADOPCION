/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centro.adopcion;

/**
 *
 * @author Ivan
 */
public class CentroAdopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("blanco", 6, 15, 6);
        Perro perro2 = new Perro ("sacha", 7, 20, 7);
        
        perro1.setNombre("tequila");
        perro2.setNombre(("apolo"));
        
        System.out.println("perros");
        perro1.mostrarDatos(  perro1.getNombre(), perro1.getEdad(),  perro1.getPeso(),+ perro1.getId());
        perro2.mostrarDatos(  perro2.getNombre(), perro2.getEdad(),  perro2.getPeso(),+ perro2.getId());
        Gato gato1 = new Gato("muñeco", 6, 10, 8);
        Gato gato2 = new Gato ("silver", 13, 5, 9);
        
        System.out.println("gatos");
        gato1.mostrarDatos(  gato1.getNombre(), gato1.getEdad(),  gato1.getPeso(),+ gato1.getId());
        gato2.mostrarDatos(  gato2.getNombre(), gato2.getEdad(),  gato2.getPeso(),+ gato2.getId());
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}




