package examenentornos;

import java.util.List;

public class Profesor extends Persona{
    String srt;
    int edad;
    String numerodeTelefono;
    List<Prestamo> prestamos;
    public Profesor(String numerodeTelefono){
        super(numerodeTelefono);
    }
    
    public void printInformacionPersonal(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numerodeTelefono);
    }
    public void printTodalaInformacion(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numerodeTelefono);
        for(Prestamo p:prestamos){
            System.out.println(p);
        }
    }
}
