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

        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i) + llave;
            System.out.println("Encriptado -> " + val);

        }

        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i) + llave;

            char[] convertedCharArray = Character.toChars(val - llave);

            System.out.println("Desencriptado -> " + Arrays.toString(convertedCharArray));
        }

    }

    public static void main(String[] args) {

        System.out.println("Ingrese la palabra que desea encriptar: ");

        String str = sc.nextLine();

        System.out.println("Ingrese la llave para empezar a encriptar: ");

        int num = sc.nextInt();
        Tarea(str, num);

    }
}
