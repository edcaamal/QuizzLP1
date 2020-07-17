/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzapp;

import static quizzapp.QuizzApp.Preguntas;
import static quizzapp.QuizzApp.arrayPreguntas;
import static quizzapp.QuizzApp.Incisos;

/**
 *
 * @author edgar
 */
public class GenQuizz {

    
    public static void llenarPreguntas(){
        Preguntas  = new String[13][2];
        Incisos = new String[13][3];
        
        Preguntas[0][0]  = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        Preguntas[0][1]  = "0";
        
        Preguntas[1][0]  = "¿Cómo se insertan comentarios de una línea en  Java?";
        Preguntas[1][1]  = "1";
        Preguntas[2][0]  = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        Preguntas[2][1]  = "2";
        Preguntas[3][0]  = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        Preguntas[3][1]  = "0";
        Preguntas[4][0]  = "¿Qué operador se utiliza para comparar dos valores?";
        Preguntas[4][1]  = "1";
        Preguntas[5][0]  = "¿Para declarar un arreglo, la variable se define como tipo?";
        Preguntas[5][1]  = "2";
        Preguntas[6][0]  = "¿Qué instrucción se usa para crear una clase en Java?";
        Preguntas[6][1]  = "0";
        Preguntas[7][0]  = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass?  ";
        Preguntas[7][1]  = "1";
        Preguntas[8][0]  = "¿Cuál es el operador que se utiliza para multiplicar números?";
        Preguntas[8][1]  = "2";
        Preguntas[9][0]  = "¿Cómo se inicia la sentencia if en Java?";
        Preguntas[9][1]  = "0";
        Preguntas[10][0] = "¿Cómo se inicia escribiendo un ciclo while en  Java?";
        Preguntas[10][1]  = "1";
        Preguntas[11][0] = "¿Cuál es la instrucción que se utiliza para regresar un valor en un método?";
        Preguntas[11][1]  = "2";
        Preguntas[12][0] = "¿Cómo se insertan comentarios para integrar al diccionario de datos de   JavaDocs?";  
        Preguntas[12][1]  = "0";
        
        Incisos[0][0] = "System.out.println( Hello World );";
        Incisos[0][1] = "echo( Hello World );";
        Incisos[0][2] = "print ( Hello World );";
        Incisos[1][0] = "/* This is a comment";
        Incisos[1][1] = "// This is a comment";    
        Incisos[1][2] = "# This is a comment";
        Incisos[2][0] = "myString";
        Incisos[2][1] = "string";    
        Incisos[2][2] = "String";
        Incisos[3][0] = "int x = 5;";
        Incisos[3][1] = "num x = 5";    
        Incisos[3][2] = "x = 5;";
        // float x = 5;
        Incisos[4][0] = "><";
        Incisos[4][1] = "==";    
        Incisos[4][2] = "<>";
        // =
        Incisos[5][0] = "{}";
        Incisos[5][1] = "()";    
        Incisos[5][2] = "[]";
        Incisos[6][0] = "class";
        Incisos[6][1] = "MyClass";    
        Incisos[6][2] = "class()";
        Incisos[7][0] = "class MyClass = new myObj();";
        Incisos[7][1] = "MyClass myObj = new MyClass();";    
        Incisos[7][2] = "new myObj = MyClass();";
        Incisos[8][0] = "%";
        Incisos[8][1] = "X";    
        Incisos[8][2] = "*";
        Incisos[9][0] = "if (x > y)";
        Incisos[9][1] = "if x > y;";    
        Incisos[9][2] = "if x > y then;";
        Incisos[10][0] = "while x > y:";
        Incisos[10][1] = "while (x > y) ";    
        Incisos[10][2] = "while x > y {";
        Incisos[11][0] = "break";
        Incisos[11][1] = "get ";    
        Incisos[11][2] = "return";
        Incisos[12][0] = "/** This is a comment";
        Incisos[12][1] = "/* This is a comment ";    
        Incisos[12][2] = "*/ This is a comment";           
    }

    
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
