package org.example;

import java.time.format.DateTimeFormatter;
import java.util.List;

public interface LeitorRetorno {
    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public List<Boleto> lerArquivo(String caminhoRetorno);
}
