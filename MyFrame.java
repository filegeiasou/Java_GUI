package java_GUI;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.ImageIcon;
import javax.swing.*;
public class MyFrame extends Frame implements ActionListener
{
    private Button button , button1;
    private Label label;
    private Panel panel;
    private int count =0;
    private TextField tfCount;

    MyFrame()
    {

        ImageIcon image = new ImageIcon("amor.png"); // create image
        this.setIconImage(image.getImage()); //change icon
        this.setBackground(new Color(128,128,128));//change background color or Color.pink

        label = new Label("Welcome to our bank!");
        label.setBounds(150, 50,120,10);
        this.add(label);

        button = new Button("I am a bank button");
        button.setBounds(150, 70, 120, 50); // set size of button
        button.setBackground(Color.pink);
        button.addActionListener(this); // when i press the button he puts poo e -> System.out.println("poo")

        panel = new Panel();
        panel.setBackground(Color.red);
        panel.setPreferredSize(new Dimension(100,100));
        //this.add(panel,BorderLayout.EAST); // puts panel

        tfCount = new TextField(count + "€" , 2);//create textfield
        tfCount.setEditable(false);// set if i want to edit textfield
        this.add(tfCount);


        button1 = new Button("GO another page");
        button1.setBounds(100,70,130,70);
        button1.setBackground(Color.lightGray);
        button1.addActionListener(this);

        //Frame frame = new Frame(); // create frame
        this.setTitle("FileBank"); //title frame
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(500,500);//set x and y dimensions of frame
        //this.setResizable(false);//dont frame resised
        this.add(button);
        this.add(button1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button)//if i use this button
        {
            ++count;
            tfCount.setText(count+"€");
        }
        else if (e.getSource()==button1)
        {
            this.dispose();//to remove the last frame
            //NewFrame newWindow=new NewFrame();
            new NewFrame();
        }
    }
}
