/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc02;
import java.util.Scanner;


/**
 *
 * @author d.rodrigues
 */

//Faça um algoritmo que leia a idade de uma pessoa
 //expressa em anos, meses e dias e mostre-a expressa em dias.
//Leve em consideração o ano com 365 dias e o mês com 30

public class Exc02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade, meses, dias,calc;
        
        System.out.print("Digite abaixo em numeros a sua idade: ");
        idade = ler.nextInt();
        System.out.print("Agora digite em numeros, os meses de idade: ");
        meses = ler.nextInt();
        System.out.print("Por fim, digite em numeros os dias: ");
        dias = ler.nextInt();
        
        System.out.println("Calculando...");
        calc = (idade*365) + (meses *30) + dias;
        System.out.print("sua idade expressa em dias eh: " + calc);
        
        
    }
}
