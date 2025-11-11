package POO;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try {

            InputStream is = new FileInputStream("cadastro.csv");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            while (linha != null){

                System.out.println(linha);
                linha = br.readLine();
            }

            is.close();
            isr.close();
            br.close();

        } catch (FileNotFoundException e){
            System.out.println(("O ARQUIVO NÃO FOI ENCONTADO"));
            System.out.println(e.getMessage());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}