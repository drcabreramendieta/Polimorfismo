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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente diego = new Docente();
        Administrativo paola = new Administrativo();
        Servicio juan = new Servicio();
        
        diego.trabajar();
        paola.trabajar();
        juan.trabajar();
        
        Empleado andres = new Docente();
        Empleado karla = new Administrativo();
        Empleado pedro = new Servicio();
        
        andres.trabajar();
        karla.trabajar();
        pedro.trabajar();
        
        hacerTrabajo(diego);
        hacerTrabajo(paola);
        hacerTrabajo(juan);
    }
    
    public static void hacerTrabajo(Empleado empleado){
        System.out.println("La labor del empleado viene a continuaciòn:");
        empleado.trabajar();
    }
}
