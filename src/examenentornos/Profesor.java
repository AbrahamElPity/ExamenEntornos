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
    
    public String mostrarInfoPersonal(){
        return "Nombre: "+srt+"\nEdad: "+edad+"Telefono: "+this.numerodeTelefono;
    }
    public void mostrarTodaInformacion(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numerodeTelefono);
        prestamo();
    }
    public void prestamo(){
        for(Prestamo p:prestamos){
            System.out.println(p);
        }
    }
}
