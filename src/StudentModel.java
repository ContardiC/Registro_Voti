public class StudentModel {
    private String firstName;
    private String lastName;
    private double vote;
    private String subject;
    private String date; // dd-mm-yyyy format

    public StudentModel(String firstName,String lastName, double vote, String date,String subject){
        this.firstName=firstName;
        this.lastName=lastName;
        this.vote=vote;
        this.subject=subject;
        this.date=date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public StudentModel(){

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
