import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame finestra;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtVote;
    private JTextField txtDate;
    private JButton btnSave;
    private JPanel pnlData;
    public View(String titolo){
        finestra=new JFrame(titolo);
        finestra.getContentPane().setLayout(new BorderLayout());
        btnSave=new JButton("Salva");


        //TODO: label per campi
        txtFirstName=new JTextField();
        txtLastName=new JTextField();
        txtVote=new JTextField();
        txtDate=new JTextField();
        // Pannello per informazioni
        pnlData=new JPanel();
        pnlData.setLayout(new GridLayout());
        pnlData.add(txtFirstName);
        pnlData.add(txtLastName);
        pnlData.add(txtVote);
        pnlData.add(txtDate);
        finestra.add(pnlData,BorderLayout.NORTH);
        finestra.add(btnSave,BorderLayout.SOUTH);
        //btnSave.addActionListener();
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLocationRelativeTo(null);
        finestra.setSize(1280,720);
        finestra.setVisible(true);
    }
    public JButton getBtnSave(){
        return btnSave;
    }
    /*
    public static void main(String[] args) {
        new View("TEST");
    }
    */
    public String getFirstName(){
        return txtFirstName.getText();
    }
    public String getLastName(){
        return txtLastName.getText();
    }
    public String getVote(){
        return txtVote.getText();
    }
    public String getDate(){
        return txtDate.getText();
    }



}
