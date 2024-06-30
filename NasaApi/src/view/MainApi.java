package view;

import javax.swing.*;
/**
 *
 * Title: Mars Rover Photo Viewer - NasaApi
 * Autor: Freddy Tapia
 * Fecha de creación: 29/06/2024
 *
 */

public class MainApi {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MarsPhotoViewer viewer = new MarsPhotoViewer();
            viewer.setVisible(true);
        });
    }
}