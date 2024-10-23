package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        var leituraRetornoBB = new LeitorRetornoBB();
        var processadorBB = new ProcessarBoletos(leituraRetornoBB);
        //processador.setLeitorRetorno(leituraRetorno);
        processadorBB.processar("banco-brasil-1.csv");

        System.out.println("------------------------------------------------Fim processo 1 ------------------------------------------------");

        var leituraRetornoBradesco = new LeitorRetornoBradesco();
        var processadorBradesco = new ProcessarBoletos(leituraRetornoBradesco);
        processadorBradesco.processar("bradesco-1.csv");
    }
}