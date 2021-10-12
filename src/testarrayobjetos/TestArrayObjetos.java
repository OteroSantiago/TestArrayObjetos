/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrayobjetos;
import domain.*;
/**
 *
 * @author Santiago
 */
public class TestArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona personas [] = new Persona[2];
        
        personas [0] = new Persona("Juan");
        personas [1] = new Persona("Lucía");
        
        //System.out.println("personas[0] ="+personas[0]);
        //System.out.println("personas[1] ="+personas[1]);
        
        for(var i=0;i<personas.length;i++){
            System.out.println("personas ["+i+"] = "+personas[i]);
        }
        //OTRA FORMA DE INICIALIZAR,sintaxis resumida
        String coches[] = {"Mercedes","Seat","Opel","Dacia"};
        //Matrices de enteros
         //int matrizEnt[][] = {{1,3,5,7},{5,4,,1,16},{7,9,61,13}};
        
    }
    
}
