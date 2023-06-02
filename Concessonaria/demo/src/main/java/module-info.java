module br.edu.senacsp.concessonaria {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.senacsp.concessonaria to javafx.fxml;
    exports br.edu.senacsp.concessonaria;
}
