package java_GUI2;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.DimensionUIResource;
public class SliderDemo extends JFrame implements ChangeListener , ActionListener
{
    private JLabel label;
    private JSlider slider;
    private JPanel panel;
    private MenuBar menu;
    private Menu file,options,save;

    SliderDemo()
    {   
        panel= new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100 , 50); //slide from 0 to 100
        slider.setPreferredSize(new DimensionUIResource(400, 200)); // set slider into  frame with this w , h 
        slider.setPaintTicks(true); // to see the lines
        slider.setMinorTickSpacing(25); // puts lines for prices
        slider.setPaintLabels(true); // put prices in lines 
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        this.add(panel);

        menu= new MenuBar();

        file = new Menu("File");
        options = new Menu("Options");
        save= new Menu("Save");
        //save.addChangeListener(this);
        file.add(save);
        menu.add(file);
        menu.add(options);

        this.setMenuBar(menu); // put menu


        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(500,500);
        this.setVisible(true);

    }



    @Override
    public void stateChanged(ChangeEvent e) 
    {
        label.setText("C = " + slider.getValue());
        if(e.getSource()==save)
        {
            JOptionPane.showMessageDialog(null, "Do you want to save ?", "FileBank", JOptionPane.YES_NO_OPTION);
        }
    }

    /*@Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==save)
        {
            JOptionPane.showMessageDialog(null, "Do you want to save ?", "FileBank", JOptionPane.YES_NO_OPTION);
        }
    }*/
    
}
