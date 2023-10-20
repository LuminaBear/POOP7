/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author POOP
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("Jaguar","Mexico","Amarillo con manchas cafes");
        
        Animal animal1 = new Animal();
        animal1.setNombre("Max");
        animal1.setLugarOrigen("CDMX");
        animal1.setColor("Cafe");
        
        System.out.println(animal);
        
        System.out.println(animal1.toString());
        
        
        AnimalAcuatico animal2 = new AnimalAcuatico();
        animal2.setNombre("Wilson");
        animal2.setLugarOrigen("Canada");
        animal2.setColor("Gris");
        animal2.setNumeroAletas(2);
        animal2.comer();
        System.out.println(animal2);
        
        Ballena ballena = new Ballena(30,2,"Wilson","Canada","Gris");
        System.out.println(ballena);
    }
    
}
