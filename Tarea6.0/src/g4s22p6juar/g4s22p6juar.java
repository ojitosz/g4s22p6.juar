/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6juar;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class g4s22p6juar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        lista.forEach(contenido ->{
            System.out.println("El valor contenido es "+ contenido);
        });
        
        lista.add("G");
        lista.add("H");
        
        System.out.println("\n segunda forma de trabajar recorridos de listas \n");
        
        for(String contenido1 : lista){
            System.out.println("El  valor contenido es "+ contenido1);
        }
        
        lista.add("Edgar");
        lista.add("esta es una linea muy larga");
        lista.add("Juan");
        lista.add("segunda linea muy larga sin problemas de almacenamineto");
        
        System.out.println("\n tercera forma de trabajar recorrido de listas \n");
        
        lista.stream().forEach(contenido2 ->{
        System.out.println("el  valor contenido es "+ contenido2);
    });
    }
    
}
