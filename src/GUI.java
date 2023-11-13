import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalcolatriceScientificaGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Calcolatrice Scientifica");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(grid, 300, 400);

        TextField display = new TextField();
        display.setPrefColumnCount(10);
        display.setEditable(false);
        grid.add(display, 0, 0, 4, 1);

        Button[] buttons = new Button[]{
                new Button("7"), new Button("8"), new Button("9"), new Button("/"),
                new Button("4"), new Button("5"), new Button("6"), new Button("*"),
                new Button("1"), new Button("2"), new Button("3"), new Button("-"),
                new Button("0"), new Button("."), new Button("="), new Button("+"),
                new Button("sin"), new Button("cos"), new Button("tan"), new Button("sqrt"),
                new Button("log"), new Button("exp"), new Button("x^y")
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setPrefSize(70, 70);
            grid.add(buttons[i], i % 4, i / 4 + 1);
        }

        for (Button button : buttons) {
            button.setOnAction(e -> {
                String buttonText = button.getText();
                if ("=".equals(buttonText)) {
                    String expression = display.getText();
                    // Calcola il risultato dell'espressione
                    double result = calcolaRisultato(expression);
                    display.setText(Double.toString(result));
                } else {
                    display.appendText(buttonText);
                }
            });
        }

        stage.setScene(scene);
        stage.show();
    }

    private double calcolaRisultato(String expression) {
        // Implementa il calcolo del risultato dell'espressione qui.
        // Per semplicità, consideriamo solo l'operazione di somma.
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            return num1 + num2;
        }
        return 0.0;
    }
}
