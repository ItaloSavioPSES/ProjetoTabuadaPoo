package test;
import dominio.nomeConhecimentoDoUsuario;
import dominio.imprimidorDasTabuadasDeSomaENome;
import dominio.imprimidorDasTabuadasDeSubtracao;
import dominio.imprimidorDasTabuadasDeDivisao;
import dominio.imprimidorDeTabuadasDeMultiplicacao;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        nomeConhecimentoDoUsuario nomeESobreNome = new nomeConhecimentoDoUsuario();
        imprimidorDasTabuadasDeSubtracao imprimirSubtracao = new imprimidorDasTabuadasDeSubtracao();
        imprimidorDasTabuadasDeDivisao imprimirDivisao = new imprimidorDasTabuadasDeDivisao();
        imprimidorDeTabuadasDeMultiplicacao imprimirMultiplicacao = new imprimidorDeTabuadasDeMultiplicacao();
        imprimidorDasTabuadasDeSomaENome imprimirSoma = new imprimidorDasTabuadasDeSomaENome();

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, aqui você pode escolher a sua tabuada que você deseja");

        System.out.println("Pode escrever seu nome? \n Gostaria de saber que que está usando");
        // inserir nome e sobre nome
        System.out.println("Insira seu nome");
        nomeESobreNome.nome = input.next();
        System.out.println("Insira seu sobre nome");
        nomeESobreNome.sobreNome = input.next();
        System.out.println("====================");
        boolean exibir = true;
        while (true) {
            System.out.println("Central das tabuadas");
            StringBuilder add = new StringBuilder();
            add.append("[1] - Soma\n");
            add.append("[2] - Subtração\n");
            add.append("[3] - Divisão\n");
            add.append("[4] - Multiplicação");
            System.out.println(add.toString());
            int esolhaTabuada = input.nextInt();
            System.out.println("====================");
            switch (esolhaTabuada) {
                // case 1 é a tabuada de soma ela vai do 1 ate o 10
                case 1:
                    System.out.print("Ola Sr ");
                    imprimirSoma.imprimirNomesETabuadaDaSoma(nomeESobreNome);
                    System.out.println("Seja Bem-Vindo a tabuada de soma");
                    System.out.println("Digite uma tabuada do 1 ao 10");
                    int escolhaSelecaoSoma = input.nextInt();
                    switch (escolhaSelecaoSoma) {
                        case 1:
                            System.out.println("Tabuada do 1");
                            imprimirSoma.imprimirSomaDo1();
                            break;
                        case 2:
                            System.out.println("Tabuada do 2");
                            imprimirSoma.imprimirSomaDo2();
                            break;
                        case 3:
                            System.out.println("Tabuada do 3");
                            imprimirSoma.imprimirSomaDo3();
                            break;
                        case 4:
                            System.out.println("Tabuada do 4");
                            imprimirSoma.imprimirSomaDo4();
                            break;
                        case 5:
                            System.out.println("Tabuada do 5");
                            imprimirSoma.imprimirSomaDo5();
                            break;
                        case 6:
                            System.out.println("Tabuada do 6");
                            imprimirSoma.imprimirSomaDo6();
                            break;
                        case 7:
                            System.out.println("Tabuada do 7");
                            imprimirSoma.imprimirSomaDo7();
                            break;
                        case 8:
                            System.out.println("Tabuada do 8");
                            imprimirSoma.imprimirSomaDo8();
                            break;
                        case 9:
                            System.out.println("Tabuada do 9");
                            imprimirSoma.imprimirSomaDo9();
                            break;
                        case 10:
                            System.out.println("Tabuada do 10");
                            imprimirSoma.imprimirSomaDo10();
                            break;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
                    // case 2 é a tabuada de Subtração
                case 2:
                    System.out.print("Ola Sr ");
                    imprimirSoma.imprimirNomesETabuadaDaSoma(nomeESobreNome);
                    System.out.println("Seja Bem-Vindo a tabuada de subtração");
                    System.out.println("Digite um numero do 1 ao 10");
                    int escolhaSelecaoSubtracao = input.nextInt();
                    switch (escolhaSelecaoSubtracao){
                        case 1:
                            System.out.println("Tabuada do 1");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao1();
                            break;
                        case 2:
                            System.out.println("Tabuada do 2");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao2();
                            break;
                        case 3:
                            System.out.println("Tabuada do 3");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao3();
                            break;
                        case 4:
                            System.out.println("tabuada do 4");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao4();
                            break;
                        case 5:
                            System.out.println("Tabuada do 5");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao5();
                            break;
                        case 6:
                            System.out.println("Tabuada do 6");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao6();
                            break;
                        case 7:
                            System.out.println("Tabuada do 7");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao7();
                            break;
                        case 8:
                            System.out.println("Tabuada do 8");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao9();
                            break;
                        case 9:
                            System.out.println("Tabuada do 9");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao9();
                            break;
                        case 10:
                            System.out.println("Tabuada do 10");
                            imprimirSubtracao.imprimirTabuadaDeSubtracao10();
                            break;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Ola Sr ");
                    imprimirSoma.imprimirNomesETabuadaDaSoma(nomeESobreNome);
                    System.out.println("Seja Bem-Vindo a tabuada de deivisão");
                    System.out.println("Digite um numero de 1 ao 10");
                    int escolhaSelecaoDivisao = input.nextInt();
                    switch (escolhaSelecaoDivisao) {
                        case 1:
                            System.out.println("Tabuada do 1");
                            imprimirDivisao.imprimirTabuadaDeDivisao1();
                            break;
                        case 2:
                            System.out.println("Tabuada do 2");
                            imprimirDivisao.imprimirTabuadaDeDivisao2();
                            break;
                        case 3:
                            System.out.println("Tabuada do 3");
                            imprimirDivisao.imprimirTabuadaDeDivisao3();
                            break;
                        case 4:
                            System.out.println("Tabuada do 4");
                            imprimirDivisao.imprimirTabuadaDeDivisao4();
                            break;
                        case 5:
                            System.out.println("Tabuada do 5");
                            imprimirDivisao.imprimirTabuadaDeDivisao5();
                            break;
                        case 6:
                            System.out.println("Tabuada do 6");
                            imprimirDivisao.imprimirTabuadaDeDivisao6();
                            break;
                        case 7:
                            System.out.println("Tabuada do 7");
                            imprimirDivisao.imprimirTabuadaDeDivisao7();
                            break;
                        case 8:
                            System.out.println("Tabuada do 8");
                            imprimirDivisao.imprimirTabuadaDeDivisao8();
                            break;
                        case 9:
                            System.out.println("Tabuada do 9");
                            imprimirDivisao.imprimirTabuadaDeDivisao9();
                            break;
                        case 10:
                            System.out.println("Tabuada do 10");
                            imprimirDivisao.imprimirTabuadaDeDivisao10();
                            break;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Ola Sr " );
                    imprimirSoma.imprimirNomesETabuadaDaSoma(nomeESobreNome);
                    System.out.println("Seja Bem-Vindo a tabuada de multiplicação");
                    System.out.println("Digite um numero de 1 ao 10");
                    int escolhaSelecaoMultiplicacao = input.nextInt();
                    switch (escolhaSelecaoMultiplicacao) {
                        case 1:
                            System.out.println("Tabuada do 1");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao1();
                            break;
                        case 2:
                            System.out.println("Tabuada do 2");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao2();
                            break;
                        case 3:
                            System.out.println("Tabuada do 3");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao3();
                            break;
                        case 4:
                            System.out.println("Tabuada do 4");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao4();
                            break;
                        case 5:
                            System.out.println("Tabuada do 5");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao5();
                            break;
                        case 6:
                            System.out.println("Tabuada do 6");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao6();
                            break;
                        case 7:
                            System.out.println("Tabuada do 7");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao7();
                            break;
                        case 8:
                            System.out.println("Tabuada do 8");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao8();
                            break;
                        case 9:
                            System.out.println("Tabuada do 9");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao9();
                            break;
                        case 10:
                            System.out.println("Tabuada do 10");
                            imprimirMultiplicacao.imprimirTabuadaDeMultiplicacao10();
                            break;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:
                    System.out.println();
                    break;
                case 8:
                    System.out.println();
                    break;
                case 9:
                    System.out.println();
                    break;
                case 10:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
            break;
        }
    }
}