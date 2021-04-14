package br.projetoDesafios.analiseDeNumeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();
        int numero3 = leitor.nextInt();
        int numero4 = leitor.nextInt();
        int numero5 = leitor.nextInt();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);
        numeros.add(numero4);
        numeros.add(numero5);
        int i=0;
        int qtdPares = 0;
        int qtdImPares = 0;
        int qtdPositivos = 0;
        int qtdNegativos = 0;
        List<Integer> pares = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        List<Integer> positivos = new ArrayList<>();

         //continue a solução
        for (i = 0; i < numeros.size(); i++) {

            if(numeros.get(i)>0){
                positivos.add(numeros.get(i));
                qtdPositivos=positivos.size();
            }

            if(numeros.get(i)<0){
                negativos.add(numeros.get(i));
                qtdNegativos=negativos.size();
            }

            if (numeros.get(i) % 2 == 0 ) {
              pares .add(numeros.get(i));
                qtdPares =pares.size();

            }

            if(numeros.get(i)%2!=0){
                impares.add(numeros.get(i));
                qtdImPares=impares.size();
            }
        }

//insira suas variaveis corretamente
            System.out.println(qtdPares + " valor(es) par(es)");
            System.out.println( qtdImPares+ " valor(es) impar(es)");
            System.out.println( qtdPositivos+ " valor(es) positivo(s)");
            System.out.println( qtdNegativos+" valor(es) negativo(s)");

    }
}
