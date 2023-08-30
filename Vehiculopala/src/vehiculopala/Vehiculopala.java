/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculopala;

/**
 *
 * @author forti
 */
public class Vehiculopala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto auto1=new Auto();
        System.out.println(auto1.conocerMarcha());
        auto1.subirCambio(); 
        System.out.println(auto1.conocerMarcha());
        auto1.VelocidadNueva();
        auto1.bajarCambio();
        System.out.println(auto1.conocerMarcha());
                
        auto1.VelocidadNueva();
        
    }
}