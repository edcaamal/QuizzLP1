/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzapp;

/**
 * Clase Generadora de numeros aleatorios, devuelve un entero 
 * @author edgar
 */
public class GenRandom {
    
    /**
     * Método que genera valores alearorios limitandolos a un rango especificado por el usuario
     * @param rango Limite para generar valor aleatorio
     * @return 
     */    
    public static int randomize(int rango){
        int valor = 0;
        // Genera un valor aletorio entre el rango entre 0.0 y 1.0
        // Se multiplica por un rango determinado por el usuario 

        double rnd = (Math.random()*rango);
        valor = (int)rnd;
        return valor;
    }

}
