/*
 * Exercícios de variáveis usando Java
 */
package variaveis;

/**
 *
 * @author Tiago Luiz
 */
public class Variaveis extends PrintNumber{

    // Variáveis estáticas e não estáticas devem sempre ser 
    // instanciadas fora dos métodos, para que estejam disponíveis
    // para a classe toda.
    public static int capacity; 
    int var1 = 20; // Var não estática.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Variáveis de parâmetro ficam 
        //dentro dos parâmetros dos métodos.  
        int var1 = 10; 
        // Somente váriaveis locais são instanciadas
        // dentro de métodos.
        byte var2 = 64;
        char var3 = 'T';
        
        int[] anArray = new int[5]; // Exemplo de array com alteração manual
        anArray[0] = 5;
        anArray[1] = 4;
        anArray[2] = 3;
        anArray[3] = 2;
        anArray[4] = 1;
        System.out.println("O valor do index 2 do array é: "+anArray[2]);
        
        // Exemplos de métodos herdados de outra classe. Lembre-se sempre de
        // instanciar o método antes de usá-lo.
        PrintNumber number1 = new PrintNumber(); // Instanciando o método.
        number1.printNumber(10); // Chamando o método em si.
    }
}
