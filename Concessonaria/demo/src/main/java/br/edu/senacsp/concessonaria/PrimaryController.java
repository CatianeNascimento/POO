package br.edu.senacsp.concessonaria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtMarca;
    @FXML TextField txtAno;
    @FXML TextField txtPreco;
    @FXML TextArea lista;

    List<Carro> carros = new ArrayList<>();

    public void cadastrar() {
        var carro = new Carro(txtMarca.getText(), Integer.valueOf(txtAno.getText()), new BigDecimal(txtPreco.getText()));

        carros.add(carro);

        mostrarCarros();
    }

    private void mostrarCarros() {
        lista.clear();
        carros.forEach(c -> lista.appendText(c.toString() + "\n"));


    }

    public void ordernarPorAno() {
        carros.sort((c1, c2) -> Integer.compare(c1.getAno(), c2.getAno()));
        mostrarCarros();
    }

}
    

       

    

    