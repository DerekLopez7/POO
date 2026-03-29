/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegodb;
import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
/**
 *
 * @author hecto
 */


class CustomProgressBarUI extends BasicProgressBarUI {
    @Override
    protected void paintDeterminate(Graphics g, JComponent c) {
        super.paintDeterminate(g, c);

        // Obtener el valor actual y el máximo de la barra
        JProgressBar progressBar = (JProgressBar) c;
        int value = progressBar.getValue();
        int max = progressBar.getMaximum();
        
        // Dibujar el valor sobre la barra
        String text = value + "/" + max;
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getHeight();
        int textX = (progressBar.getWidth() - textWidth) / 2;
        int textY = (progressBar.getHeight() + textHeight) / 2;
        
        // Establecer el color del texto
        g.setColor(Color.GRAY);  // Color blanco para el texto
        g.drawString(text, textX, textY);
    }
}

