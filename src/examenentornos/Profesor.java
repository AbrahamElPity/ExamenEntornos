package examenentornos;
/**
 * Es una clase la cual define a un profesor, esta clase hereda de la clase persona.
 * @author Abraham Gómez
 * Version 2.0
 */

public class Profesor extends Persona{
    String srt;
    int edad;
    String numerodeTelefono;
    List<Prestamo> prestamos;
    /*El constructor
    *@param numerodeTelefono
    */
    public Profesor(String numerodeTelefono){
        super(numerodeTelefono);
    }
    /*
    *Metodo que muestra la informacion personal.
    *@return "Nombre: "+srt+"\nEdad: "+edad+"Telefono: "+this.numerodeTelefono;
    */
    public String mostrarInfoPersonal(){
        return "Nombre: "+srt+"\nEdad: "+edad+"Telefono: "+this.numerodeTelefono;
    }
    /*
    *Muestra toda la informacion sobre el profesor.
    */
    public void mostrarTodaInformacion(){
        System.out.println("Nombre: "+srt);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+this.numerodeTelefono);
        prestamo();
    }
    /*
    *Metodo que va mostrando los prestamos del profesor, este metodo es usado en el metodo superior.
    */
    public void prestamo(){
        for(Prestamo p:prestamos){
            System.out.println(p);
        }
    }
}
