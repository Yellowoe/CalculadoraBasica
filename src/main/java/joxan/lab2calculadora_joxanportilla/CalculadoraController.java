/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package joxan.lab2calculadora_joxanportilla;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joxan
 */
public class CalculadoraController {

    @FXML
    private Pane Tpanel;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn6;
    @FXML
    private Button btn5;
    @FXML
    private Button btn4;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnC;
    @FXML
    private Button btnMultiplica;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnIgual;

    private double x, y;
    @FXML
    private ImageView btnClose;
    @FXML
    private ImageView btnMinimizar;

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;
    private boolean digitar = true;
    @FXML
    private Label lblResultado;
    @FXML
    private Label lblOperacion;
    @FXML
    private Button btnMasMenos;

    public void init(Stage stage) {
        Tpanel.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        Tpanel.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });
        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnMinimizar.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }

    @FXML
    private void clk0(MouseEvent event) {

        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros += "0";
            } else {
                cadenaNumeros += "0";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }
    
    

    @FXML
    private void clk1(MouseEvent event) {
        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "1";
            } else {
                cadenaNumeros += "1";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML
    private void clk2(MouseEvent event) {
        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "2";
            } else {
                cadenaNumeros += "2";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;

        }
    }

    @FXML
    private void clk3(MouseEvent event) {
        if (digitar == true) {

            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "3";
            } else {
                cadenaNumeros += "3";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML
    private void clk6(MouseEvent event) {
        if (digitar == true) {

            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "6";
            } else {
                cadenaNumeros += "6";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML
    private void clk5(MouseEvent event) {
        if (digitar == true) {

            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "5";
            } else {
                cadenaNumeros += "5";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML

    private void clk4(MouseEvent event) {

        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "4";
            } else {
                cadenaNumeros += "4";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML
    private void clk7(MouseEvent event) {

        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "7";
            } else {
            
                cadenaNumeros += "7";

            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML
    private void clk8(MouseEvent event) {
        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "8";
            } else {
                cadenaNumeros += "8";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;

        }
    }

    @FXML
    private void clk9(MouseEvent event) {
        if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "9";
            } else {
                cadenaNumeros += "9";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        }
    }

    @FXML
    private void ClearAc(MouseEvent event) {
        lblOperacion.setText((""));
        lblResultado.setText("0");
        cadenaNumeros = "";
        operacion = "nula";
        activado = true;
        punto = true;
        digitar = true;

    }

    @FXML
    private void MultiplicarAc(MouseEvent event) {

        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            lblOperacion.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            activado = false;
            punto = true;
            digitar = true; 

        }
    }

    @FXML
    private void DividirAc(MouseEvent event) {
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            lblOperacion.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            activado = false;
            punto = true;
            digitar = true;

        }

    }

    @FXML
    private void RestaAc(MouseEvent event) {
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            lblOperacion.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            activado = false;
            punto = true;
            digitar = true;

        }

    }

    @FXML
    private void SumaAc(MouseEvent event) {
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            lblOperacion.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            activado = false;
            punto = true;
            digitar = true;

        }

    }

    @FXML
    private void PuntoAc(MouseEvent event) {

        if (punto == true) {
            if (cadenaNumeros.equals("")) {
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";

            }
            lblResultado.setText(cadenaNumeros);
            punto = false;

        }
        punto = false;
    }

    @FXML
    private void IgualAc(MouseEvent event) {
        double segundoNumero;
        if (operacion.equals("nula")) {
            lblResultado.setText(cadenaNumeros);
        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            lblResultado.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            lblResultado.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            lblResultado.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                lblResultado.setText("Error");
                cadenaNumeros = "0";

            } else {
                resultado = primerNumero / segundoNumero;
                lblResultado.setText(String.format("%.2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }

        lblOperacion.setText("");
        activado = true;
        punto = false;
        digitar = false;

    }

    @FXML
    private void MasMenosAc(MouseEvent event) {

        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = "-" + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        lblResultado.setText(cadenaNumeros);
    }

    @FXML
    private void clkbtn0(KeyEvent event) {
        
         if (digitar == true) {
            if (lblResultado.getText().equals("0")) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros += "0";
            }
            lblResultado.setText(cadenaNumeros);
            activado = true;
        } 
        
        
    }
}
