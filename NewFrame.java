package java_GUI;
import java.awt.*;
public class NewFrame extends Frame
{
    private Label label2;
    NewFrame()
    {
        label2=new Label("Okey");
        this.add(label2);
        this.setTitle("FileBank"); //title frame
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(500,500);//set x and y dimensions of frame
        this.setVisible(true);
    }
    
}
