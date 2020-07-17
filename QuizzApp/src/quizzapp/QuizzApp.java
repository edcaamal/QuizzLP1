/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzapp;

/**
 * Programa que genera una rangp de preguntas Aletorias, para un examen 
 * Debe de ser capaz de contabilizar las respuestas correctas
 * 
 * @author edgar
 */
public class QuizzApp {
    
    //int arrayPreguntas[];

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
    
    public static int tipoQuizz(){
        int totalPreguntas = 10;       
        // Generar valor aleatorio para saber la cantidad de preguntas a mostrar
        int tipoQuizz = randomize(3);
        
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rangoPreguntas = tipoQuizz();
        double valorPregunta  = valorQuestion(rangoPreguntas);
        
        //arrayPreguntas = new int[10];
        System.out.println("Total de Preguntas     : "+rangoPreguntas);   
        System.out.println("Valor de cada Pregunta : "+valorPregunta);   
        
        for (int i=1; i <= rangoPreguntas; i++){
           System.out.println("Pregunta No. : " + randomize(rangoPreguntas));            
        }        
    }  
}
