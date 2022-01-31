package com.company.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {

    // Exceptions que devem ser evitados e tratados para o programa funcionar.
    public static void main(String[] args)  {
        // foi lançado aqui o tratamento da exceção - FileNotFoundException
        String nomeDoArquivo = "JoanClarke.txt";
        try {
            imprimirArquivoNoConsole (nomeDoArquivo );
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo" +  e.getCause());
        }
        catch (IOException e) {
            // IOException  Classe mais genérico que FileNotFoundException
            // Logo, precisa ser declarada depois que as classes de erro mais genericas
           // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado" +  e.getCause());
        } finally {
            System.out.println("Chegou ao Finally");
        }
        System.out.println("Apesar do Excpetion ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole (String nomeDoArquivo ) throws IOException {
        // método lançou uma exceção através >> throws IOException  que é mãe da FileNotFoundException, indica que quem chamar esse metodo, deverá tratar essa exceção.
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
