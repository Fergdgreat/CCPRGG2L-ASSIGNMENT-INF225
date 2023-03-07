import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame{
    TryAgain(){
      
      JButton tryAgainButton = new JButton();
      tryAgainButton.setText("Play Again");
      tryAgainButton.setFont(new Font("Arial", Font.BOLD, 30));
      EventHandler handler = new EventHandler();
      tryAgainButton.addActionListener(handler);

      JButton exitButton = new JButton();
      exitButton.setText("GG's sir");
      exitButton.setFont(new Font("Arial", Font.BOLD, 30));
      ExitHandler handlerr = new ExitHandler();
      exitButton.addActionListener(handlerr);

      this.add(tryAgainButton);
      this.add(exitButton);

      this.setLayout(new FlowLayout());
      this.setTitle("Snake Game ni nikolai");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(600,600);
      this.setLocationRelativeTo(null);
      this.setVisible(true); 
      this.setResizable(false);
      this.getContentPane().setBackground(Color.YELLOW);
    }
      private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            new GameFrame();
            dispose();
        }
    }
    private class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            dispose();

     
     }
  }
}
