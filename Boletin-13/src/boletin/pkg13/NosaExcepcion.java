
package boletin.pkg13;

/**
 *
 * @author dfernandezguerreiro
 */
public class NosaExcepcion extends Exception{

    public NosaExcepcion() {
        super("Informacion da excepcion");
    }

    public NosaExcepcion(String mensaxe) {
        super(mensaxe);
    }
    
}
