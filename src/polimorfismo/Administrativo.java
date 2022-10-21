/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author hola
 */
public class Administrativo extends Empleado{
    private String posicion;
    
    public void trabajar(){
        System.out.println("Atendiendo al cliente");
    }
}
