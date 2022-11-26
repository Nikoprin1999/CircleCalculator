package CircleCalculator;

import javax.swing.*;
import java.awt.*;

public class CircleCalculator extends JFrame {
    CircleCalculatorEngine calcEngine = new CircleCalculatorEngine(this);
    Font myFont = new Font("Arial", Font.BOLD, 30);
    JLabel headline = new JLabel("Circle Calculator");
    JLabel area = new JLabel("Area");
    JLabel perimeter = new JLabel("Perimeter");
    JTextField areaTextField = new JTextField(15);
    JTextField perimeterTextField = new JTextField(15);
    JTextField radiusOfACircle = new JTextField(30);
    JPanel resultPanel = new JPanel(new GridLayout(1, 2));
    JPanel areaPanel = new JPanel(new GridLayout(2, 1));
    JPanel perimeterPanel = new JPanel(new GridLayout(2, 1));
    JPanel windowContent = new JPanel(new FlowLayout());
    JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
    JButton calculateButton = new JButton("Calculate");
    JButton clearButton = new JButton("Clear");
    ImageIcon icon = new ImageIcon("calculator.png");

    CircleCalculator() {
        headline.setFont(myFont);

        resultPanel.add(areaPanel); /// Area
        areaPanel.add(area);
        areaPanel.add(areaTextField);
        areaTextField.setHorizontalAlignment(JTextField.CENTER);
        areaTextField.setEditable(false);
        area.setHorizontalAlignment(JLabel.CENTER);
        area.setFont(myFont);

        resultPanel.add(perimeterPanel); /// Perimeter
        perimeterPanel.add(perimeter);
        perimeterPanel.add(perimeterTextField);
        perimeterTextField.setHorizontalAlignment(JTextField.CENTER);
        perimeterTextField.setEditable(false);
        perimeter.setHorizontalAlignment(JLabel.CENTER);
        perimeter.setFont(myFont);

        buttonsPanel.add(calculateButton);
        calculateButton.addActionListener(calcEngine);
        clearButton.addActionListener(calcEngine);
        buttonsPanel.add(clearButton);

        windowContent.add(headline);
        windowContent.add(radiusOfACircle);
        windowContent.add(resultPanel);
        windowContent.add(buttonsPanel);
        setIconImage(icon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(windowContent);
        setResizable(false);
        setSize(450, 450);
        setVisible(true);
    }
}