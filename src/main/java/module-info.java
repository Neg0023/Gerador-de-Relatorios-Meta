module br.com.metalumens.relatoriosapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.metalumens.relatoriosapp to javafx.fxml;
    exports br.com.metalumens.relatoriosapp;
}