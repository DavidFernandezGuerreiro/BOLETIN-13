
package boletin.pkg13;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;

public class TemperaturaErradaExcepcion {
    Scanner sc=new Scanner (System.in);
    
    public void limitarGradosC() throws NosaExcepcion{
        float gcentigrados=sc.nextFloat();
        
        if(gcentigrados<80)
            throw new NosaExcepcion("***** NON PODE SER MENOR DE 80Cº *****");
        
    }
}
