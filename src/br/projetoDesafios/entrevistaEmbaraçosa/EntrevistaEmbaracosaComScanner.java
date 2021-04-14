package br.projetoDesafios.entrevistaEmbaraçosa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntrevistaEmbaracosaComScanner {

    public  static  void  main ( String [] args ) throws IOException {

        BufferedReader br =  new BufferedReader( new InputStreamReader( System.in ));

        String proximaPalavra;


        while ((proximaPalavra = br.readLine()) !=  null ) {


            boolean   palavrasRepetidas = false;

            for ( int j = 0 ; j < proximaPalavra.length() ; j ++ ) {

                if (proximaPalavra.substring (0 , j).endsWith(proximaPalavra.substring (j))) {
                    System.out.println(proximaPalavra.substring ( 0 , j));
                    palavrasRepetidas =  true ;
                }
            }

            if ( !   palavrasRepetidas)
                System.out.println(proximaPalavra);
        }
    }
}
