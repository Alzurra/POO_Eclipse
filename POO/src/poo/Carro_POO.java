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
import javax.swing.JOptionPane;

public class Carro_POO extends Pessoa_POO {

    public void carro_modelo() {
        modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro: ");
        validar(1);
        JOptionPane.showMessageDialog(null, "Modelo do carro: " + modelo);
    }

    public void carro_cor() {
        cor = JOptionPane.showInputDialog(null, "Digite a cor do carro: ");
        validar(2);
        JOptionPane.showMessageDialog(null, "Cor do veículo: " + cor);
    }

    public void carro_ano() {
        ano_carro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do carro: "));
        validar(3);
        JOptionPane.showMessageDialog(null, "O ano do veículo é: " + ano_carro);
        carro_ano(ano_carro);
    }

    public void carro_ano(int ano_carro) {
        ano_carro = (2020 - ano_carro);
        JOptionPane.showMessageDialog(null, "O carro possui " + ano_carro + " ano(s)");
    }

    public void mostrar_info_carro() {
        JOptionPane.showMessageDialog(null, "\n\nINFORMAÇÕES DO CARRO" + "\n\nMODELO CO CARRO: " + modelo
                + "\n\nCOR DO CARRO: " + cor + "\n\nO CARRO FOI FABRICADO EM: " + ano_carro);
    }

    public void validar(int etapa) {
        switch (etapa) {
            case 1:
                while ("".equals(modelo)) {
                    modelo = JOptionPane.showInputDialog(
                            "[O CAMPO MODELO NÂO PODE FICAR VAZIO!!]\n " + "\nDIGITE POR GENTILEZA O MODELO DO VEÍCULO: ");
                }
                break;
            case 2:
                while ("".equals(cor)) {
                    cor = JOptionPane.showInputDialog(
                            "[O CAMPO COR NÃO PODE FICAR VAZIO!!]\n\n" + "DIGITE POR GENTILEZA A COR DO VEÍCULO: ");
                }
                break;
            case 3:
                while ("".equals(ano_carro) || ano_carro <= 1800) {
                    ano_carro = Integer.parseInt(JOptionPane.showInputDialog(
                            "[O ANO DO CARRO DEVE SER SUPERIOR A 1800]\n\n" + "DIGITE POR GENTILEZA O ANO DO VEÍCULO: "));
                }
                break;
            default:
                break;
        }

    }

}
