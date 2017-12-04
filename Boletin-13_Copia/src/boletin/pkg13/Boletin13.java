
package boletin.pkg13;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConversorTemperaturas obx1=new ConversorTemperaturas();
        try {
            obx1.centigradosAFharenheit();
        } catch (NosaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
//        
//        ConversorTemperaturas obx2=new ConversorTemperaturas();
//        try {
//            obx2.centígradosAReamur();
//        } catch (NosaExcepcion e2) {
//            System.out.println(e2.getMessage());
//        }
        
        ConversorTemperaturas obx2=new ConversorTemperaturas();
        obx2.centígradosAReamur();
            
    }
    
}
