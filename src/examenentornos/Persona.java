package examenentornos;
/*Este codigo define la clase Persona y la clase Profesor
como una extension de la primera.
*@author Abraham
*Version 2.0
*/

public class Persona {
    String numerodeTelefono;
    /*El constructor
    @param numerodeTelefono,por parametro le enviamos el numero del telefono
    */
    public Persona(String numerodeTelefono){
        
    }
    /*
    *@return numerodeTelefono
    devuelve el numero de telefono  
    */
    public String obtenerTelefono() {
        return numerodeTelefono;
    }
    /*
    @param numerodetelefono, sirve para poner el numero de telefono desde otras clases.
    */
    public void ponerTelefono(String numerodeTelefono) {
        this.numerodeTelefono = numerodeTelefono;
    }
            
            
    
}
