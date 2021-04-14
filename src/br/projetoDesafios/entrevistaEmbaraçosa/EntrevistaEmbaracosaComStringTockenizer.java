package br.projetoDesafios.entrevistaEmbaraçosa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class EntrevistaEmbaracosaComStringTockenizer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> lista = new ArrayList<>();
        boolean palavrasRepetidas = false;

        while (st.hasMoreTokens()) {
            String p = st.nextToken();

            lista.add(p);
        }

        for (int i = 0; i < lista.size(); i++) {

            for (int j = 0; j < lista.get(i).length(); j++) {
                if (lista.get(i).substring(0, j).endsWith(lista.get(i).substring(j))){
                    //palavrasRepetidas = true;

                System.out.println(lista.get(i).substring(0, j));

                }
            }


        }
//        if(palavrasRepetidas=false){
//            System.out.println(lista);
       // }

    }
}