package POO;

import java.io.*;

public class Main {
    public static void main(String[] args){
        String[] texto = new String[3];
        try {

            InputStream is = new FileInputStream("cadastro.csv");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            linha = br.readLine(); // ESSE MÉTODO COMEÇA O PROGRAMA A PARTIR DA SEGUNDA LINHA.

            String nome;
            int idade;
            String estadocivil;
            String profissao;
            Double salario;
            Pessoa p;


            while (linha != null){

                System.out.println(linha);
                texto = linha.split(",");

                nome = texto[1].trim();
                idade = Integer.parseInt(texto[1].trim());
                estadocivil = texto[2].trim();
                profissao = texto[3].trim();
                salario = Double.valueOf(texto[4].trim());

                p = new Pessoa(nome, idade, estadocivil, profissao, salario);
                p.apresentar();


                System.out.println(texto[0]+texto[1]+texto[2]+texto[3]+texto[4]);
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