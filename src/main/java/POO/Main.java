package POO;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String[] texto = new String[3];
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); // COLEÇÕES SET, LIST, MAP

        try {

            InputStream is = new FileInputStream("cadastro.csv");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os;
            OutputStreamWriter osw;
            BufferedWriter bw;


            String linha = br.readLine();
            linha = br.readLine();

            String nome;
            int idade;
            String estadocivil;
            String profissao;
            Double salario;
            Pessoa p;


            while (linha != null){

                texto = linha.split(",");

                nome = texto[1].trim();
                idade = Integer.parseInt(texto[1].trim());
                estadocivil = texto[2].trim();
                profissao = texto[3].trim();
                salario = Double.valueOf(texto[4].trim());

                p = new Pessoa(nome, idade, estadocivil, profissao, salario);
                pessoas.add(p);


                System.out.println(texto[0]+texto[1]+texto[2]+texto[3]+texto[4]);
                linha = br.readLine();
            }

            is.close();
            isr.close();
            br.close();

            int quantidade = pessoas.size();

            for(int i=0; i<quantidade; i++){

                pessoas.get(i).apresentar();
                System.out.println("-----------------");
            }

        } catch (FileNotFoundException e){
            System.out.println(("O ARQUIVO NÃO FOI ENCONTADO"));
            System.out.println(e.getMessage());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}