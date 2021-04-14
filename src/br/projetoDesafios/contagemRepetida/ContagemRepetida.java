package br.projetoDesafios.contagemRepetida;

import java.util.*;

public class ContagemRepetida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int control = sc.nextInt();
        while (control>0) {
            for (int a = 1; a <= control; a++)

                numeros.add(sc.nextInt());

            SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
            numeros.forEach(id -> contaQuant.compute(id, (k, v) -> (v == null) ? 1: v+1));

            contaQuant.entrySet().forEach(entry -> {
                System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
            });
            break;
        }
    }
}
