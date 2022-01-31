package com.company;

import java.io.*;

public class CheckedException {

    // Exceptions que devem ser evitados e tratados para o programa funcionar.
    public static void main(String[] args) {
        String nomeDoArquivo = "JoanClarke.txt";
        imprimirArquivoNoConsole (nomeDoArquivo );
        System.out.println("Apesar do Excpetion ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole (String nomeDoArquivo ) throws FileNotFoundException {
        // throws FileNotFoundException, indica que quem chamar esse metodo, deverá tratar essa exceção
        File file = new File(nomeDoArquivo);

        BufferedReader br  = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
