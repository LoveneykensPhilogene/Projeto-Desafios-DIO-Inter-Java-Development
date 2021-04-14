package br.projetoDesafios.divisorio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisorio {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        br.close();

        int resultado = -1;

        if (a != b && c != d) {
            int fim = c;
            int inicio = a;

            while (inicio <= fim) {
                if (inicio % a == 0 && inicio % b != 0 && c % inicio == 0 && d % inicio != 0) {
                    resultado = inicio;
                    break;
                }
                if (inicio % a == 0 && inicio % b != 0 && c % inicio == 0 && d % inicio == 0) {
                    inicio += a;
                    resultado = inicio;
                    break;
                }
                break;
            }
            System.out.println(resultado);
        }
    }
}
