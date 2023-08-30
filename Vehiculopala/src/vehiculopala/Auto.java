/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculopala;

/**
 *
 * @author forti
 */
public class Auto {
    private String potente= "aaaa";
    private int velocidad=20;
    private int marcha =1;
    private int velocidadMaxima=120;
    private int velocidadMaximaReversa=60;
    
    public int subirCambio(){
        if(marcha >=1 || marcha<6){
        marcha++;
        }
        return marcha;
    }
    public int bajarCambio (){
    if(marcha>1 || marcha<=6){
        marcha--;
    }
    return marcha;
    }
    public int reversa(){
    marcha=6;
    return marcha;
    }
    public int acelerar(){
        if(marcha==-1 && velocidad<velocidadMaximaReversa){
            velocidad++;
    
    }
        if (velocidad>=0 && velocidad<velocidadMaxima){
         velocidad++;
        }
         return velocidad;   
    }
    
    public int frenar(){
    if(velocidad>=1){
    velocidad--;
    }
    return velocidad;
    }
    public String conocerMarcha(){
    String mensaje="";
    switch(marcha){
        case -1: mensaje="va en reversa";break;
        case 1: mensaje="vas en primera";break;
        case 2: mensaje="Vas en segunda";break;
        case 3: mensaje="Vas en tercera";break;
        case 4: mensaje="Vas en cuarta";break;
        case 5: mensaje="Vas en quinta";break;
        case 6: mensaje="Vas en sexta";break;
    }
    return mensaje;
    }
    public void VelocidadNueva(){
        System.out.println("La velocidad del auto es: " + velocidad*marcha + " km/h");
    }
}
