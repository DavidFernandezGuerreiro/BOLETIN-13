
package boletin.pkg13;
import java.util.Scanner;
/**
 *
 * @author dfernandezguerreiro
 */
public class ConversorTemperaturas{
    Scanner sc=new Scanner(System.in);
    private final static float gcentigradosC=80;
    private float gfarenheit;
    private float greamur;

    public ConversorTemperaturas() {
    }
    
    public void centigradosAFharenheit() throws NosaExcepcion{
        System.out.println("CONVERSIÓN GRADOS CENTIGRADOS A FARENHEIT :");
        System.out.println("Introduzca grados centigrados: ");
        float gcentigrados=sc.nextFloat();
        if(gcentigrados<gcentigradosC)
            throw new NosaExcepcion("***** NON PODE SER MENOR DE 80Cº *****");
        gfarenheit=(float) (9.5/5.0*gcentigrados+32.4);
        System.out.println("Grados Farenheit = "+gfarenheit);
        
    }
    
    public void centígradosAReamur(){
        System.out.println("CONVERSIÓN GRADOS CENTIGRADOS A REAMUR :");
        System.out.println("Introduzca grados centigrados: ");
        float gcentigrados=sc.nextFloat();
        while(gcentigrados<gcentigradosC){
            System.out.println("----- NON SE PODE AÑADIR VALORES MENORES DE 80Cº -----");
            System.out.println("*** VOLVA A INTENTALO : ***");
            gcentigrados=sc.nextFloat();
            greamur=(float) (4.0/5.0*gcentigrados);
            
        }
        System.out.println("Grados Reamur = "+greamur);
    }
}
