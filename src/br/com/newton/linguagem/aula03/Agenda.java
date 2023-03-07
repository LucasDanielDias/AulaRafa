package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {
        Telefone tel = new Telefone();
        Contato contato1 = new Contato();
        contato1.nome = "Rafaela";
        contato1.numero = "250266";

        tel.contato1 = contato1;

        System.out.println(tel.contato1.nome);
    }
}
