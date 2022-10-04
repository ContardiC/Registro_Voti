import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Controller {
    private View vista;
    private StudentModel model;
    private FileOp fileOp;
    public Controller(View vista, StudentModel model){
        this.vista=vista;
        this.model=model;
        fileOp=new FileOp();
    }
    public void assegnaGestori(){
        ActionListener gestoreSalvaDati;
        ActionListener gestoreCancellaDati;
        ActionListener gestoreLeggiFile;
        gestoreSalvaDati=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    fileOp=new FileOp();
                }catch (Exception ed){
                    ed.printStackTrace();
                }
                //TODO: controllare se i campi sono vuoti
                System.out.println("NOME: "+vista.getFirstName());
                System.out.println("COGNOME: "+vista.getLastName());
                System.out.println("VOTO :"+vista.getVote());
                System.out.println("MATERIA: "+vista.getSubject());
                System.out.println("DATA: "+vista.getDate());
                StudentModel student=new StudentModel();
                student.setFirstName(vista.getFirstName());
                student.setLastName(vista.getLastName());
                student.setVote(vista.getVote());
                student.setSubject(vista.getSubject());
                student.setDate(vista.getDate());
                fileOp.write(student);
            }
        };
        gestoreCancellaDati=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.getTxtFirstName().setText(" ");
                vista.getTxtLastName().setText(" ");
                vista.getTxtVote().setText(" ");
                vista.getTxtSubject().setText(" ");
                vista.getTxtDate().setText(" ");
            }
        };
        gestoreLeggiFile=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileOp.readAll(vista.getTxaShow());
            }
        };


        vista.getBtnSave().addActionListener(gestoreSalvaDati);
        vista.getBtnReset().addActionListener(gestoreCancellaDati);
        vista.getBtnReadAll().addActionListener(gestoreLeggiFile);
    }



}
