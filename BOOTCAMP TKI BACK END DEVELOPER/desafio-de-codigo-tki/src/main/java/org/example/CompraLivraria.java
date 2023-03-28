package org.example;

import java.util.Scanner;

/*
Desafio

Crie um programa em Java para calcular o valor total de uma compra de livros em uma livraria.
O programa deve perguntar o nome, o preço e a quantidade de cada livro que o cliente deseja comprar.
O programa deve exibir o valor total da compra e o número de livros comprados.
Entrada

A entrada consiste em dados informados pelo usuário via teclado. O usuário deve informar o nome do livro (uma string sem espaços),
o preço do livro (um número real) e a quantidade de livros desejados (um número inteiro).
Saída

A saída consiste em mensagens exibidas na tela do usuário. O programa deve exibir o valor total da compra,
formatado com duas casas decimais, seguido do número de livros comprados. Por fim,
o programa deve exibir a mensagem "Obrigado por comprar na nossa livraria!"



 */
public class CompraLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        // Calcula o valor total da compra.
        double valorTotal = livro1.preco * livro1.quantidade + livro2.preco * livro2.quantidade;

        // Calcula o número de livros comprados.
        int numLivros = livro1.quantidade + livro2.quantidade;

        // Imprime as linhas necessárias conforme a saída deste desafio.
        System.out.println("Valor total da compra: " + String.format("%.2f", valorTotal));
        System.out.println("Numero de livros comprados: " + numLivros);
        System.out.println("Obrigado por comprar na nossa livraria!");
    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}


