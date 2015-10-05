/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlongwords;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //System.out.println("Ingrese el numero de palabras:");
        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();
        int letras;
        
        //System.out.println("Ingrese las palabras separadas por 'Enter': ");
        for (int i = 0; i < cantidad; i++) {
             String palabras = in.next();
            if (palabras.length() > 10) {
                letras = palabras.length() - 2;
                int largo = palabras.length();
                palabras = palabras.substring(0, 1) + letras + palabras.substring(largo - 1, largo);
                
            }
             System.out.println(palabras);
            palabras = null;
        }
       

    }

}
