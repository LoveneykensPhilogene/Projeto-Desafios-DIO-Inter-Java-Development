package br.projetoDesafios.analiseDeNumeros;

import java.io.IOException;
import java.util.Scanner;

public class OutroExemploDeAnaliseDeNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();
        int numero3 = leitor.nextInt();
        int numero4 = leitor.nextInt();
        int numero5 = leitor.nextInt();

        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosPositivos = 0;
        int  numerosNegativos = 0;

//continue a solução

        if(numero1%2==0){
            numerosPares++;
        }else if (numero1%2!=0){
            numerosImpares ++;
        }if (numero1>0){
            numerosPositivos++;
        }else if (numero1<0){
            numerosNegativos++;
        }

        if(numero2%2==0){
            numerosPares++;
        }else if (numero2%2!=0){
            numerosImpares ++;
        }if (numero2>0){
            numerosPositivos++;
        }else if (numero2<0){
            numerosNegativos++;
        }

        if(numero3%2==0){
            numerosPares++;
        }else if (numero3%2!=0){
            numerosImpares ++;
        }if (numero3>0){
            numerosPositivos++;
        }else if (numero3<0){
            numerosNegativos++;
        }

        if(numero4%2==0){
            numerosPares++;
        }else if (numero4%2!=0){
            numerosImpares ++;
        }if (numero4>0){
            numerosPositivos++;
        }else if (numero4<0){
            numerosNegativos++;
        }

        if(numero5%2==0){
            numerosPares++;
        }else if (numero5%2!=0){
            numerosImpares++;
        }if (numero5>0){
            numerosPositivos++;
        }else if (numero5>0){
            numerosNegativos++;
        }

//insira suas variaveis corretamente
        System.out.println( numerosPares + " valor(es) par(es)");
        System.out.println( numerosImpares + " valor(es) impar(es)");
        System.out.println( numerosPositivos + " valor(es) positivo(s)");
        System.out.println( numerosNegativos + " valor(es) negativo(s)");
    }
}
