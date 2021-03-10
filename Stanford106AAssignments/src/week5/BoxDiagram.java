package week5;

import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class BoxDiagram extends GraphicsProgram {
	public void init(){

        this.canvasCenter = new GPoint(this.getWidth() / 2, this.getHeight() / 2);

        textLabel = new JLabel("Name");
        add(textLabel, SOUTH);

        txt = new JTextField(20);
        txt.addActionListener(this);
        add(txt, SOUTH);

        addBtn = new JButton("ADD");
        add(addBtn, SOUTH);

        rmBtn = new JButton("Remove");
        add(rmBtn, SOUTH);

        clrBth = new JButton("Clear");
        add(clrBth, SOUTH);

        this.boxes = new HashMap<>();

        addActionListeners();
        addMouseListeners();

    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("ADD") || e.getSource() == this.txt){
            this.add(this.buildBox(this.txt.getText()),
                    this.canvasCenter.getX() - (this.BOX_WIDTH / 2),
                    this.canvasCenter.getY() - (this.BOX_HEIGHT / 2));
        } else if (e.getActionCommand().equals("Remove")){
            this.removeBox(this.txt.getText());
        } else if (e.getActionCommand().equals("Clear")){
            this.clearBoxes();
        }
    }

    private void clearBoxes() {
        for(GCompound x: this.boxes.values()){
            remove(x);
        }
        this.boxes.clear();
    }

    private void removeBox(String txt) {
        GCompound temp = this.boxes.remove(txt);
        remove(temp);
    }

    public void mousePressed(MouseEvent e){
        this.lastX = e.getX();
        this.lastY = e.getY();
        this.currentSelection = getElementAt(lastX, lastY);
    }

    public void mouseDragged(MouseEvent e){
        if (this.currentSelection != null) {
            this.currentSelection.move(e.getX() - lastX, e.getY() - lastY);
            lastX = e.getX();
            lastY = e.getY();
        }
    }

    private GCompound buildBox(String txt){
        GCompound box = new GCompound();
        GRect boxRect = new GRect(this.BOX_WIDTH, this.BOX_HEIGHT);
        GLabel bxLabel = new GLabel(txt);

        double centerX = (boxRect.getWidth() / 2) - (bxLabel.getWidth() / 2);
        double centerY = (boxRect.getHeight() / 2) - ((bxLabel.getHeight() - (bxLabel.getAscent() * 2)) / 2);

        box.add(boxRect);
        box.add(bxLabel, centerX, centerY);

        this.boxes.put(txt, box);

        return box;
    }

    JLabel textLabel;
    JTextField txt;
    JButton addBtn;
    JButton rmBtn;
    JButton clrBth;
    GPoint canvasCenter;
    HashMap<String, GCompound> boxes;
    GObject currentSelection;
    double lastX;
    double lastY;

    private final double BOX_WIDTH = 120;
    private final double BOX_HEIGHT = 50;
}
