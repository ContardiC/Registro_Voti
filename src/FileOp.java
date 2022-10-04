import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOp {

    private RandomAccessFile randomAccessFile;
    private StudentModel student;
    public FileOp(){

    }
    public void write(StudentModel student){

        try {
            File file=new File("archivio.dat");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.skipBytes((int)(StudentModel.RECORD_LENGHT*numberOfRecords(StudentModel.RECORD_LENGHT)));
            //writeString();
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



}
