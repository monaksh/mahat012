import java.io.File;

public class day25c {
    public static void main(String[] args) {
        File file = new File("D:/java programe/file2.txt");
            
            System.out.println("Is Exist: "+file.exists());
            System.out.println("File exists: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("File size in bytes: " + file.length());
            System.out.println("Last modified: " + file.lastModified());
    }
}

