/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a09;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][] a,b;
    int tamaño;
    tamaño=solicitarInt("¿Cuál es el tamaño del arreglo?");
        
    //Crear matrices
    a= crearMatriz("A", tamaño);
    b= crearMatriz("B", tamaño);
                
   //Sumar matrices
   SumaMatrices (a,b);
   }
    
    static int solicitarInt(String msj){
        Scanner Sc = new Scanner (System.in);
        int variableEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + msj);
        try{
        flag=false;
        variableEntera = Sc.nextInt();
        
    }catch (Exception ex){
            flag=true;
            System.out.println("El número insertado no es entero" + ex);
            Sc.nextLine();
    } 
        } while (flag); 
    return variableEntera;
    }
    
    static int[][]crearMatriz(String msj, int tamaño){
    Scanner Sc = new Scanner (System.in);
    System.out.println("Favor de ingresar los valores de la matriz " + msj);
    int [][]Matriz = new int [tamaño][tamaño];
        for (int i=0; i<Matriz.length; i++){
            for (int j= 0; j<Matriz[i].length; j++){
                Matriz[i][j]= solicitarInt("el valor ubicado en la posición ("+i+","+j+"); ");
            }
        }
    return Matriz;
    }
    
    public static void SumaMatrices(int[][]a, int [][]b){
        int [][]r = new int[a.length][a.length];
        for (int i=0; i<r.length; i++){
            for (int j= 0; j<r[i].length; j++){
                r[i][j]= a[i][j]+b[i][j];
    
    //Mostrar el resultado 
    System.out.println("La suma de matrices en la posición ("+i+","+j+") es: " + r[i][j]);
 }          
    }  
}
}

