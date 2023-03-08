package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {
        Telefone tel = new Telefone();
        Contato contato1 = new Contato();
        contato1.nome = "Rafaela";
        contato1.numero = 250266;


        tel.contato1 = contato1;
        tel.cor = "Vermelho";
        tel.marca = "Iphone";
        tel.Tocar("tango");

        System.out.println(tel.contato1.nome);
        System.out.println(tel.contato1.numero);
        System.out.println(tel.cor);
        System.out.println(tel.marca);

        Telefone tel2 = new Telefone();
        Contato contato2 = new Contato();
        contato2.nome = "João";
        contato2.numero = 9574128;
        tel2.contato2 = contato2;
        tel2.marca = "iphone";
        tel2.cor = "Pink";
        tel2.Tocar("funk");

        System.out.println(tel2.contato2.nome);
        System.out.println(tel2.contato2.numero);
        System.out.println(tel2.cor);
        System.out.println(tel2.marca);

        Telefone tel3 = new Telefone();
        Contato contato3 = new Contato();
        contato3.nome = "João";
        contato3.numero = 9574128;
        tel3.contato3 = contato2;
        tel3.marca = "S20";
        tel3.cor = "Roxo";
        tel3.Tocar("eletronica");

        System.out.println(tel3.contato3.nome);
        System.out.println(tel3.contato3.numero);
        System.out.println(tel3.cor);
        System.out.println(tel3.marca);


    }
}


