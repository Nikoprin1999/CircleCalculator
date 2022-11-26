package CircleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleCalculatorEngine implements ActionListener {
    CircleCalculator parent;

    public CircleCalculatorEngine(CircleCalculator parent) {
        this.parent = parent;
    }

    double radiusOfACircle = 0;
    double perimeter = 0;
    double area = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == parent.calculateButton) {
            try {
                radiusOfACircle = Double.parseDouble(parent.radiusOfACircle.getText());
                if (radiusOfACircle <= 0) {
                    throw new RadiusException();
                } else {
                    perimeter = (2 * radiusOfACircle * Math.PI);
                    area = (Math.PI * radiusOfACircle * radiusOfACircle);
                    parent.perimeterTextField.setText(String.valueOf(perimeter));
                    parent.areaTextField.setText(String.valueOf(area));
                    parent.radiusOfACircle.setText("");
                }
            } catch (NumberFormatException | RadiusException exception) {
                JOptionPane.showMessageDialog(null, "You entered the wrong value",
                        "Error", JOptionPane.ERROR_MESSAGE);
                parent.radiusOfACircle.setText("");
            }
        } else if (src == parent.clearButton) {
            parent.radiusOfACircle.setText("");
            parent.perimeterTextField.setText("");
            parent.areaTextField.setText("");
        }
    }
}