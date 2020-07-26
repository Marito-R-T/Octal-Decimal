/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.octaldecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 *
 * @author mari2bar
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        boolean seguir = true;
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            SintaxisOctal scan;
            String s;
        while (seguir) {
            try {
                System.out.println("Escriba un numero Octal");
                s = read.readLine();
                scan = new SintaxisOctal(new LexicoOctal(new StringReader(s)));
                System.out.println("El valor en decimal es: " + scan.parse().value);
                System.out.println("-------ESCRIBIR 1 SI DESEA SEGUIR, CUALQUIER OTRO BOTON PARA SALIR--------");
                s = read.readLine();
                if(!s.equals("1"))
                    seguir = false;
                System.out.println("---------------------------------------------");
                System.out.println("---------------------------------------------");
            } catch (Exception ex) {
                System.out.println("Error en el analisis, no es ningun número octal el ingresado, ingresar otro");
                System.out.println("---------------------------------------------------------------------------");
            }
        }
    }

}
