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
    public static int[] arrayPreguntas;    
    public static String[][] Preguntas;  
    public static String[][] Incisos;     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rangoPreguntas = GenQuizz.tipoQuizz();
        double valorPregunta  = GenQuizz.valorQuestion(rangoPreguntas);
        GenQuizz.llenarPreguntas();
        int preguntaGenerada;
        boolean preguntaExiste = false;
        
 
        arrayPreguntas = new int[rangoPreguntas];
        
        System.out.println("Total de Preguntas     : "+rangoPreguntas);   
        System.out.println("Valor de cada Pregunta : "+valorPregunta);   
        
        for (int i=1; i <= rangoPreguntas; i++){
           do {
              preguntaGenerada =  GenRandom.randomize(rangoPreguntas);
              preguntaExiste = GenQuizz.existePregunta(preguntaGenerada, i-2);
           }while (preguntaExiste);
           arrayPreguntas[i-1] = preguntaGenerada;         
        }        
        
        for (int pregunta:arrayPreguntas){
            System.out.print("Pregunta No. : " + pregunta+ " ");  
            System.out.println(Preguntas[pregunta][0]);
            System.out.println("   a) "+Incisos[pregunta][0]);
            System.out.println("   b) "+Incisos[pregunta][1]);
            System.out.println("   c) "+Incisos[pregunta][2]);
        }
    }  
}
