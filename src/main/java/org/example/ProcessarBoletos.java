package org.example;

public class ProcessarBoletos {

    private LeitorRetorno leituraRetorno;

    public ProcessarBoletos(LeitorRetorno leituraRetorno) {

        this.leituraRetorno = leituraRetorno;
    }

    public LeitorRetorno getLeituraRetorno() {
        return leituraRetorno;
    }

    public void setLeituraRetorno(LeitorRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo){
    var listaBoletos = leituraRetorno.lerArquivo(nomeArquivo);
        for (Boleto boleto : listaBoletos) {
            System.out.println(boleto);
        }
    }
}
