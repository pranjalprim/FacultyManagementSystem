package facultymanagementsystem;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JDesktopPane;
public class JImageDesktopPane extends JDesktopPane {
 private Image image;
    public JImageDesktopPane() {
        this.setAutoscrolls(true);
    }
    @ Override
    protected void paintComponent(Graphics g) {
        try {
            image = new javax.swing.ImageIcon(getClass().getResource("/images/download.jpg")).getImage();
            if(g != null)
            {
               g.drawImage(image,0,0,this.getSize().width,this.getSize().height,null);
            }
        } catch (NullPointerException NPE) {
            System.out.println("Can not find images! ");
        }
    }
}

