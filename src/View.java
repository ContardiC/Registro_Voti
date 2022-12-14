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
    private JButton btnReadAll;
    private JPanel pnlData;
    private JPanel pnlbuttons;
    private JTextArea txaShow;
    public JTextField getTxtFirstName() {
        return txtFirstName;
    }
    public JTextField getTxtLastName() {
        return txtLastName;
    }
    public JTextField getTxtVote() {
        return txtVote;
    }
    public JTextField getTxtDate() {
        return txtDate;
    }


    public View(String titolo){
        finestra=new JFrame(titolo);
        finestra.getContentPane().setLayout(new BorderLayout());
        btnSave=new JButton("Salva");
        btnReset=new JButton("Reset");
        btnReadAll=new JButton("Leggi il file");
        txaShow=new JTextArea();
        //TODO: label per campi
        txtFirstName=new JTextField("");
        txtLastName=new JTextField("");
        txtVote=new JTextField("");
        txtSubject=new JTextField("");
        txtDate=new JTextField("");
        //JTextFields limit chars
        txtFirstName.setDocument(new LimitJTextField(30));
        txtLastName.setDocument(new LimitJTextField(30));
        txtSubject.setDocument(new LimitJTextField(20));
        txtDate.setDocument(new LimitJTextField(10));


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
        pnlbuttons.add(btnReadAll);
        finestra.add(txaShow,BorderLayout.CENTER);
        finestra.add(pnlbuttons,BorderLayout.SOUTH);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLocationRelativeTo(null);
        finestra.setSize(1280,720);
        finestra.setVisible(true);
    }
    public JButton getBtnSave(){
        return btnSave;
    }
    public JButton getBtnReset(){
        return btnReset;
    }
    public JButton getBtnReadAll(){
        return btnReadAll;
    }
    public JTextArea getTxaShow(){
        return txaShow;
    }

    public JTextField getTxtSubject() {
        return txtSubject;
    }

    public String getFirstName(){
        return txtFirstName.getText();
    }
    public String getLastName(){
        return txtLastName.getText();
    }
    public double getVote(){
        return Double.parseDouble(txtVote.getText());
    }
    public String getSubject(){
        return txtSubject.getText();
    }
    public String getDate(){
        return txtDate.getText();
    }



}
