package java_GUI1;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class Frame_one extends JFrame implements ActionListener
{
    private Label label1 , label2;
    private TextArea textArea;
    private TextField a;
    private Button button;
    private JRadioButton pizza,pita;
    private ButtonGroup group;
    private JComboBox comboBox;
    Frame_one(String name)
    {

        this.setBackground(Color.BLACK);

        label1=new Label("Your name : " + name);
        label1.setBounds(150, 50,120,10);
        this.add(label1);

        textArea=new TextArea();
        textArea.setBackground(Color.LIGHT_GRAY);
        this.add(textArea);

        label2=new Label("Put to catalog");
        this.add(label2);

        button=new Button("Yes");
        button.addActionListener(this);
        this.add(button);

        a=new TextField();
        a.setPreferredSize(new Dimension(120,30));
        a.setText("username");
        this.add(a);


        pizza= new JRadioButton("pizza");//buttons with something
        pita=new JRadioButton("pita");

        group=new ButtonGroup();//group this buttons
        group.add(pizza);
        group.add(pita);

        this.add(pizza);
        this.add(pita);

        String [] foods = {"pastitsio","fakes","rodi"};
        comboBox =  new JComboBox<>(foods);//create a catalog with items
        this.add(comboBox);


        this.setTitle("FileBank"); //title frame
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(500,500);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button)
        {
            System.out.println("Welcome : " + a.getText());
            comboBox.insertItemAt(a.getText(), 0); //put item in catalog in first posision
            button.setEnabled(false);
            a.setEditable(false);
        }
    }
    
}
