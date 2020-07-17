/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzapp;

import static quizzapp.QuizzApp.arrayPreguntas;

/**
 *
 * @author edgar
 */
public class GenQuizz {
    
    public static int tipoQuizz(){
        int totalPreguntas = 10;       
        // Generar valor aleatorio para saber la cantidad de preguntas a mostrar
        int tipoQuizz = GenRandom.randomize(3);
        
        // Clasificación del Rango de preguntas segun los requerimientos del proyecto
        // Esta puede realizarse con sentencias IF o con la sentencia Switch
        switch(tipoQuizz){
            case 0 :
               totalPreguntas = 10;  // 10 pregunta, con valor de 1 cada pregunta
               break;
            case 1 :
               totalPreguntas = 5;   // 5 pregunta, con valor de 2 cada pregunta
               break;
            case 2 :
               totalPreguntas = 4;  // 4 pregunta, con valor de 2.5 cada pregunta
               break;
            default :
               totalPreguntas = 10; // 10 pregunta, con valor de 1 cada pregunta
               break;
        }                    
        return totalPreguntas;
    }

    /**
     * Retorna el valor que tendrá cada pregunta realizada
     * @param tipoQuizz Total de las preguntas a efectuar
     * @return 
     */
    public static double valorQuestion(int tipoQuizz){
        double valorPregunta =  10/ (double)tipoQuizz ;
        return valorPregunta;
    }

    public static boolean existePregunta(int numPregunta, int limiteArreglo){
        boolean existePregunta = false;
        int pregunta;
        for (int j= 0; j<= limiteArreglo; j++){
            pregunta = arrayPreguntas[j];
            if (numPregunta == pregunta){
               existePregunta = true; 
               break;
            }
        }            
        return existePregunta;
    }
}
