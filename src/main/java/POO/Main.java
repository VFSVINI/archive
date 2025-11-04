package POO;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try {

            InputStream is = new FileInputStream("cadastro.csv");
            InputStreamReader isr;
            BufferedReader br;

        } catch (FileNotFoundException e){
            System.out.println(("O ARQUIVO NÃO FOI ENCONTADO"));
            System.out.println(e.getMessage());


        }

    }
}