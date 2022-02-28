/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

/**
 *
 * @author Samuellllll
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario[] usuarios = new Usuario[10];
        usuarios[0] = new Usuario("Samuel", "Munoz", "202100119");
        
        Login login = new Login(usuarios);
        login.setVisible(true);
        
    }
    
}
