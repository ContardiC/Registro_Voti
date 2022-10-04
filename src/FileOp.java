import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOp {

    private RandomAccessFile randomAccessFile;
    private StudentModel student;
    public FileOp(){
        File file=new File("archivio.dat");
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void write(StudentModel student){
        this.student=student;
        try {

            randomAccessFile.skipBytes((int)(StudentModel.RECORD_LENGHT*numberOfRecords(StudentModel.RECORD_LENGHT)));
            writeString(student.getFirstName(),student.getFirstName().length(),StudentModel.MAX_SIZE_FIRST_NAME);
            writeString(student.getLastName(),student.getLastName().length(),StudentModel.MAX_SIZE_LAST_NAME);
            randomAccessFile.writeDouble(student.getVote());
            writeString(student.getSubject(),student.getSubject().length(),StudentModel.MAX_SIZE_SUBJECT);
            writeString(student.getDate(),student.getDate().length(),StudentModel.MAX_SIZE_DATE);

        }catch(FileNotFoundException exc){
            exc.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public long numberOfRecords(long recordSize){
        long lenght=1;
        long res=0;
        try {
            lenght = randomAccessFile.length();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        res=lenght/recordSize;
        return res;
    }
    public void writeString(String str,int len,int maxLenght){
        try {
            randomAccessFile.writeChars(str);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        for(int i=len;i<maxLenght;i++){
            try{
                randomAccessFile.writeChar('\0');
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }


    }
    public void readAll(){

        try{
            randomAccessFile.seek(0);
            for(int i=0;i<numberOfRecords(StudentModel.RECORD_LENGHT);i++){

                for(int j=0;j<StudentModel.MAX_SIZE_FIRST_NAME;j++){
                    char tmp;
                    tmp=randomAccessFile.readChar();
                    if(tmp!='\0'){
                        System.out.print(tmp);
                    }

                }
                for(int j=0;j<StudentModel.MAX_SIZE_LAST_NAME;j++){
                    char tmp;
                    tmp=randomAccessFile.readChar();
                    if(tmp!='\0'){
                        System.out.print(tmp);
                    }

                }
                try {
                    randomAccessFile.readDouble();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                for(int j=0;j<StudentModel.MAX_SIZE_SUBJECT;j++){
                    char tmp;
                    tmp=randomAccessFile.readChar();
                    if(tmp!='\0'){
                        System.out.print(tmp);
                    }

                }
                for(int j=0;j<StudentModel.MAX_SIZE_DATE;j++){
                    char tmp;
                    tmp=randomAccessFile.readChar();
                    if(tmp!='\0'){
                        System.out.print(tmp);
                    }

                }
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }



}
