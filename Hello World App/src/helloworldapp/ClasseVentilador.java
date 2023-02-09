package helloworldapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tiago Luiz
 * @date 24/10/14
 */
    public class ClasseVentilador implements InterfaceVentilador{
        // Uma classe pode implementar uma interface através da keyword
        // implementes.
        int speed = 0;
    
    /**
     *
     * @param newValue
     */
    @Override
    // Métodos criados manualmente. Existem métodos já inclusos nas
    // bibliotecas Java e outros como estes que podem ser criados e 
    // customizados.
    public void changeSpeed(int newValue){
        speed = newValue;
    }
    void printState(){
        System.out.println("A velocidade atual do ventilador é: "+speed);
    }
}
