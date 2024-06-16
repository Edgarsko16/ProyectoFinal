package com.example.proyectofinal;

import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {

    public void start(Stage stage) throws IOException {

    }

    public static void main(String[] args) {
        // Creamos una ventana llamada "Piano"
        JFrame frame = new JFrame("Piano");
        // Acción para que el programa deje de ejecutarse cuando se cierra la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establecemos tamaños por defecto, intentamos que se vea la totalidad del piano
        frame.setSize(1000, 400);

        PianoPanel pianoPanel = new PianoPanel();
        frame.add(pianoPanel);  // Agregamos el piano a la ventana

        frame.setVisible(true);
    }
}