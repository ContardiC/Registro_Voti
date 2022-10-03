import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileOp {
    private RandomAccessFile randomAccessFile;
    public FileOp(){
    }
    public boolean createFile(){
        boolean isFound=false;
        File file=new File("archivio.dat");
        try {
            randomAccessFile = new RandomAccessFile(file, "a");
            isFound=true;
        }catch(FileNotFoundException exc){
            exc.printStackTrace();
        }
        return isFound;
    }
}
