/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase2.progra2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author KamiVela
 */
public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void Tarea(String str, int llave) {
        //encriptador
        int val;

        for (int i = 0; i < str.length() ; i++) {
            val = (int) str.charAt(i) + llave;
            System.out.println("Encriptado -> " + val);

       
        }
        
        for (int i = 0; i < str.length() ; i++) {
            val = (int) str.charAt(i) + llave;

            char[] convertedCharArray = Character.toChars(val - llave);

            System.out.println("Desencriptado -> " + Arrays.toString(convertedCharArray));
        }

    }

    public static void main(String[] args) {

        Tarea("ASCII", 0);

    }
}