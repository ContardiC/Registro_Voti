import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame finestra;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtVote;
    private JTextField txtSubject;
    private JTextField txtDate;
    private JButton btnSave;
    private JButton btnReset;
    private JPanel pnlData;
    private JPanel pnlbuttons;
    public View(String titolo){
        finestra=new JFrame(titolo);
        finestra.getContentPane().setLayout(new BorderLayout());
        btnSave=new JButton("Salva");
        btnReset=new JButton("Reset");


        //TODO: label per campi
        txtFirstName=new JTextField("Nome");
        txtLastName=new JTextField("Cognome");
        txtVote=new JTextField("Voto");
        txtSubject=new JTextField("Materia");
        txtDate=new JTextField("GG-MM-AAAA");
        // Pannello per informazioni
        pnlData=new JPanel();
        pnlbuttons=new JPanel();
        pnlData.setLayout(new GridLayout());
        pnlData.add(txtFirstName);
        pnlData.add(txtLastName);
        pnlData.add(txtVote);
        pnlData.add(txtSubject);
        pnlData.add(txtDate);
        finestra.add(pnlData,BorderLayout.NORTH);
        pnlbuttons.setLayout(new GridLayout());
        pnlbuttons.add(btnSave);
        pnlbuttons.add(btnReset);
        finestra.add(pnlbuttons,BorderLayout.SOUTH);
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

    public JTextField getTxtSubject() {
        return txtSubject;
    }

    public void setTxtSubject(JTextField txtSubject) {
        this.txtSubject = txtSubject;
    }

    public String getVote(){
        return txtVote.getText();
    }
    public String getDate(){
        return txtDate.getText();
    }



}
