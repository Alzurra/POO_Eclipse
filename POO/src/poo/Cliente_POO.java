/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Thiago
 */
import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class Cliente_POO extends Pessoa_POO {

    public void cliente_nome() {
        nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        validar(1);
        JOptionPane.showMessageDialog(null, "Nome: " + nome);
    }

    public void cliente_idade() {
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu ano de nascimento: "));
        validar(2);
        anoNasc = (2020 - anoNasc);
        JOptionPane.showMessageDialog(null, "Idade: " + anoNasc + " anos");
    }

    public void cliente_cpf() {
        cpf = Long.parseLong(JOptionPane.showInputDialog(null, "Digite o seu cpf: "));
        validar(3);
        JOptionPane.showMessageDialog(null, "CPF: " + cpf);
    }

    public void cliente_salario() {
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salário: R$"));
        validar(4);
        JOptionPane.showMessageDialog(null, "Salário: R$" + salario);
        cliente_salario(salario);
    }

    public void cliente_salario(double salario) {
        JOptionPane.showMessageDialog(null, "\n\nINFORMAÇÕES SOBRE O CLIENTE" + "\nNome: " + nome + "\nIdade: "
                + anoNasc + " anos" + "\nSalário: R$" + salario);
        if (salario < 2000) {
            salario = (double) ((salario * 0.3) + salario);
            JOptionPane.showMessageDialog(null,
                    "\nNome: " + nome + "\nIdade: " + anoNasc + " anos" + "\nSalário com + 30%: R$" + salario);
        } else if (salario >= 2000) {
            salario = (double) (salario * 0.25) + salario;
            JOptionPane.showMessageDialog(null,
                    "\nNome: " + nome + "\nIdade: " + anoNasc + " anos" + "\nSalário com + 25%: R$" + salario);
        }
        JOptionPane.showMessageDialog(null, "\nSalário com reajuste" + "\nNome: " + nome + "\nIdade: " + anoNasc
                + " anos" + "\nSalário reajustado: R$" + salario);
    }

    public void cliente_compra() {
        compra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do veículo: R$"));
        JOptionPane.showMessageDialog(null, "Compras: R$" + compra);
    }

    public void calcular_desconto() {
        ano_desconto = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite o ano em que você se tornou cliente da loja: "));
        validar(5);
        ano_desconto = (2020 - ano_desconto);
        JOptionPane.showMessageDialog(null, "O cliente possui cadastro há " + ano_desconto + " ano(s)");
        calcular_desconto(ano_desconto);
    }

    public void calcular_desconto(int ano_desconto) {
        switch (ano_desconto) {
            case 1:
                compra = compra - (compra * 0.01);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 1%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 2:
                compra = compra - (compra * 0.02);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 2%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 3:
                compra = compra - (compra * 0.03);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 3%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 4:
                compra = compra - (compra * 0.04);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 4%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 5:
                compra = compra - (compra * 0.05);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 5%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 6:
                compra = compra - (compra * 0.06);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 6%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 7:
                compra = compra - (compra * 0.07);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 7%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 8:
                compra = compra - (compra * 0.08);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 8%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 9:
                compra = compra - (compra * 0.09);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 9%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            case 10:
                compra = compra - (compra * 0.1);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 10%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
            default:
                compra = compra - (compra * 0.3);
                JOptionPane.showMessageDialog(null, "\nDESCONTO CLIENTE FATEC CARROS" + "\nDESCONTO CLIENTE FATEC 30%"
                        + "\nO valor do carro com desconto é: R$" + compra);
                break;
        }
    }

    public void mostrar_info_cli() {
        JOptionPane.showMessageDialog(null,
                "\n\nINFORMAÇÕES DO CLIENTE/VALOR DO CARRO COM DESCONTO " + "\n\nNOME DO CLIENTE: " + nome
                + "\n\nIDADE DO CLIENTE:" + anoNasc + " anos" + "\n\nCPF DO CLIENTE: " + cpf
                + "\n\nVALOR DO CARRO COM O DESCONTO: R$" + compra);
        exit(0);
    }

    public void validar(int etapa) {
        switch (etapa) {
            case 1:
                while ("".equals(nome)) {
                    nome = JOptionPane.showInputDialog("[O CAMPO NOME NÂO PODE FICAR VAZIO!!]\n " + "\nDigite o seu nome: ");
                }
                break;
            case 2:
                while (anoNasc <= 1900) {
                    anoNasc = Integer.parseInt(JOptionPane.showInputDialog("[IDADE INCOMPATÍVEL]\n\n" + "DIGITE UMA IDADE"));
                }
                break;
            case 3:
                while ("".equals(cpf)) {
                    cpf = Integer.parseInt(JOptionPane.showInputDialog("[O CAMPO NÃO PODE FICAR VAZIO]\n\n" + "\n\nDigite o número do seu CPF por gentileza: "));
                }
                break;
            case 4:
                while ("".equals(salario) || salario < 1045) {
                    salario = Double.parseDouble(JOptionPane.showInputDialog("[O SALARIO DEVE SER IGUAL OU MAIOR AO SALARIO MÍNIMO]\n\n"
                            + "Salario Mínimo: R$ 1045,00 \n\nDigite o seu salário novamente: "));
                }
                break;
            case 5:
                while ("".equals(ano_desconto) || salario <= 0) {
                    ano_desconto = Integer.parseInt(JOptionPane.showInputDialog("[O ANO QUE O CLIENTE FEZ SUA PRIMEIRA COMPRA NA LOJA NÃO PODE SER ZERO]\n\n"
                            + "\n\nDigite o ano novamente: "));
                }
                break;
            default:
                break;
        }
    }

}
