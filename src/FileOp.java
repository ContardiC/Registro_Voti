import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileOp {
    private RandomAccessFile randomAccessFile;
    public FileOp(){
        File file=new File("archivio.dat");
        try {
            randomAccessFile = new RandomAccessFile(file, "a");
            System.out.println("File creato");
        }catch(FileNotFoundException exc){
            exc.printStackTrace();
        }
    }

}
