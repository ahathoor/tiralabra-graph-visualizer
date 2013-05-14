/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package verkkolelu.tools;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import verkkolelu.model.Graph;
import verkkolelu.view.DrawPanel;

/**
 *
 * @author ahathoor
 */
public class CreateTool implements MouseListener, Tool {

    private DrawPanel panel;
    private Graph graph;

    public CreateTool(DrawPanel i) {
        this.panel = i;
        graph = i.getGraph();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        graph.addNode(e.getPoint());
        panel.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void select() {
        System.out.println("Create tool selected");
    }

    @Override
    public void deselect() {
    }
}