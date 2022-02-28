/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author Samuellllll
 */
public class Usuario {
    
    //atributos
    String nombreUsuario;
    String apellidoUsuario;
    String carnetUsuario;
    
    //Constructor
    Usuario(String nombreUsuario, String apellidoUsuario, String carnetUsuario){
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.carnetUsuario = carnetUsuario;
        
    }
    
    
    public String getnombreUsuario(){
        return nombreUsuario;
    }
    
    public String getapellidoUsuario(){
        return apellidoUsuario;
    }
    
    public String getcarnetUsuario(){
        return carnetUsuario;
    }
    
}
