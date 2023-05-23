// File: MainFrame.java
// Author: Ragány Dávid Gergő
// Copyright: 2023, Ragány Dávid Gergő
// Group: Szoft I-2-E
// Date: 2023.05.23
// Github: https://github.com/raganydavid/lelepi
// Licenc: GNU GPL 

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    
    InputPanel aElPanel;
    InputPanel bElPanel;
    InputPanel cElPanel;
    InputPanel terfogatPanel;
    JPanel buttonPanel;
    JButton calcButton;

    public MainFrame() {                  
        this.initComponent();
        this.addComponent();
        this.handleEvent();
        this.setFrame();                     
    }

    private void initComponent() {
        this.aElPanel = new InputPanel("a él");
        this.bElPanel = new InputPanel("b él");
        this.cElPanel = new InputPanel("c él");
        this.buttonPanel = new JPanel();
        this.terfogatPanel = new InputPanel("Térfogata");
        this.calcButton = new JButton("Számit");
        this.buttonPanel.add(this.calcButton);
    } 

    private void addComponent() {
        this.add(this.aElPanel);
        this.add(this.bElPanel);
        this.add(this.cElPanel);
        this.add(this.buttonPanel);
        this.add(this.terfogatPanel);
        this.buttonPanel.add(this.calcButton);
    }

    private void handleEvent() {
        this.calcButton.addActionListener( e -> {
            startCalc();
        });
    }

    private void startCalc() {
        String aElStr = this.aElPanel.getValue();
        if(!this.checkInput(aElStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double aEl = Double.parseDouble(aElStr);
        String bElStr = this.bElPanel.getValue();
        if(!this.checkInput(bElStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double bEl = Double.parseDouble(bElStr);
        String cElStr = this.cElPanel.getValue();
        if(!this.checkInput(bElStr)) {
            JOptionPane.showMessageDialog(this, "Csak számjegy");
            return;
        }
        double cEl = Double.parseDouble(cElStr);
        Double terfogat = this.calcVolumetric(aEl, bEl, cEl);
        this.terfogatPanel.setValue(terfogat.toString());
    }

    public double calcVolumetric(double a, double b, double c) {
        return a * b * c;
    }

    public boolean checkInput(String input) {
        boolean ok = false;
        if(input.matches("[0-9.]+")) {
            ok = true;
        }
        return ok;
    }
    
    private void setFrame(){
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();               
        this.setVisible(true);
    }

}
