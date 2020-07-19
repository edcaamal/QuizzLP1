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
    // Variables globales
    public static int[] arrayPreguntas;    
    public static String[][] Preguntas;  
    public static String[][] Incisos;     
    
    /**
     * Imprime encabezado
     */
    public static void encabezado(){
        System.out.println("Bienvenidos al Exa-Java LP1 ");   
        System.out.println("Una aplicación para generar cuestionarios electrónicos básicos  ");   
        System.out.println("UAC-FI-ISC-LP1  ");   
        System.out.println("------------------------------------------------------------------");           
    }
    /**
     * Método principal del QuizzApp
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k = 1;
        
        encabezado();
        GenQuizz.GenerarPreguntas();       
        for (int pregunta:arrayPreguntas){
            System.out.print("Pregunta No. : " +k+ ".- ("+ pregunta+ ") ");  
            System.out.println(Preguntas[pregunta][0]+ " - "+ Preguntas[pregunta][1]);
            System.out.println("    1) "+Incisos[pregunta][0]);
            System.out.println("    2) "+Incisos[pregunta][1]);
            System.out.println("    3) "+Incisos[pregunta][2]);
            k++;
        }
    }  
}
