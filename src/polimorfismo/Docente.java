/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author hola
 */
public class Docente extends Empleado{
    private ArrayList<String> materias;
    
    public void trabajar(){
        System.out.println("trabajando dando clases");
    }
}
