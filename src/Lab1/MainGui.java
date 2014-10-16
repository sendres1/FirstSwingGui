

package Lab1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGui extends JFrame implements ActionListener{
    // implementaction listener to handle events
    //could have used MainWindow  is concrete inheritance
    
    private JLabel lblPrompt, lblOutput;
    private JTextField txtInput;
    private JButton btnSubmit;         //put buttons together btn...
    private Container container;
    private JPanel panel;    //flowlayout  like a word proccessor
    
        
    public MainGui(){
        lblPrompt = new JLabel("Enter name:");
        lblOutput = new JLabel("xxxx           ");
        txtInput = new JTextField("                  ");
        btnSubmit = new JButton("Say Hello");
        btnSubmit.addActionListener(this);  //when click on this button operate action listerner
        container = this.getContentPane();
 
//       container.add(lblPrompt, BorderLayout.WEST);
//        container.add(txtInput, BorderLayout.CENTER);
        panel = new JPanel();
        panel.add(lblPrompt);
        panel.add(txtInput);
        container.add(panel,BorderLayout.NORTH);
        container.add(lblOutput, BorderLayout.CENTER);
        container.add(btnSubmit, BorderLayout.SOUTH);
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String name = txtInput.getText();
        String greeting = "Hello" + name;
        lblOutput.setText(greeting);
        
    }

    public JLabel getLblOutput() {
        return lblOutput;
    }

    public JTextField getTxtInput() {
        return txtInput;
    }

    
    
}
