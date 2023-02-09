/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */

package helloworldapp;

/**
 * @author Tiago Luiz
 * @date 24/10/14
 */

public class HelloWorldApp extends ClasseVentilador{
    // Uma classe pode herdar características de outras através da
    // keyword "extends".
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            System.out.println("Hello World!\n"); // Display the string.
        
            ClasseVentilador ventilador1 = new ClasseVentilador();
            ClasseVentilador ventilador2 = new ClasseVentilador();
        
            ventilador1.changeSpeed(3);
            ventilador1.printState();
            ventilador2.changeSpeed(2);
            ventilador2.printState();
            
            // An Array Example:
            int[] anArray;
            anArray = new int[10];
        
    }
    
}
