/*
 * Aplicação para testes apenas.
 */
package testes;

/**
 *
 * @author Tiago Luiz
 */
public class Testes extends ObjetoJava{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1 = 10, var2 = 20, var3 = 30, result;
        // As var podem ser declaradas e inicializadas como no C/C++.
        
        result = var1+var2;
        if(result >= var3) { 
        /* 
        *  If/Else em Java não precisam de "{}" se forem acompanhados 
        *  de uma linha apenas. 
        */
            System.out.println(result+" é maior ou igual a "+var3);
            result = 0;
            System.out.println("O novo valor de result é "+result);
        } else {
            System.out.println("Os valores são diferentes.");
        }
        
        // Exemplo do uso de métodos de outra classe criados por mim:
        ObjetoJava objeto1 = new ObjetoJava();
        // Sempre lembrar de criar o objeto antes!
        objeto1.printState();
        objeto1.alterarValor(true);
        objeto1.printState();
    }
    
}
