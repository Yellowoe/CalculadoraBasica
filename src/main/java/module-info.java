module joxan.lab2calculadora_joxanportilla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens joxan.lab2calculadora_joxanportilla to javafx.fxml;
    exports joxan.lab2calculadora_joxanportilla;
}
