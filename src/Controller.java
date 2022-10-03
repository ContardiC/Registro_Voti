import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View vista;
    private StudentModel model;

    public Controller(View vista, StudentModel model){
        this.vista=vista;
        this.model=model;
    }
    public void assegnaGestori(){
        ActionListener gestoreSalvaDati;
        ActionListener gestoreCancellaDati;
        gestoreSalvaDati=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("NOME: "+vista.getFirstName());
                System.out.println("COGNOME: "+vista.getLastName());
                System.out.println("VOTO "+vista.getVote());
                System.out.println("DATA: "+vista.getDate());


            }
        };
        vista.getBtnSave().addActionListener(gestoreSalvaDati);
    }



}
