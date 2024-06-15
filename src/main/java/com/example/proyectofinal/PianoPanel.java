package com.example.proyectofinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PianoPanel extends JPanel {
    private int numTeclas = 14; // Número de teclas blancas
    private int anchoTecla = 70;
    private int altoTecla = 320;
    //private int contador = 0;

    public PianoPanel() {
        // Eventos de hacer click
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX(); //Coordenada x donde se pulsó
                int keyIndex = x / anchoTecla;
                //contador++;
                System.out.println("Tecla presionada: " + keyIndex); //("teclas presionadas: " + contador);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar teclas blancas
        for (int i = 0; i < numTeclas; i++) {
            g.setColor(Color.WHITE);
            // Dibujar rectangulo blanco
            g.fillRect(i * anchoTecla, 0, anchoTecla, altoTecla);
            g.setColor(Color.BLACK);
            // Dibujar borde
            g.drawRect(i * anchoTecla, 0, anchoTecla, altoTecla);
        }

        // Dibujar teclas negras
        for (int i = 0; i < numTeclas - 1; i++) {
            if (i % 7 != 2 && i % 7 != 6) { // Omitir posiciones donde no hay teclas negras
                g.setColor(Color.BLACK);
                g.fillRect((i * anchoTecla) + (anchoTecla * 3 / 4), 0, anchoTecla / 2, altoTecla / 2);
            }
        }
    }
}

