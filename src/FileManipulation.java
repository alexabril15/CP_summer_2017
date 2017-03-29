import java.io.File;
import java.io.InterruptedIOException;

/**
 * Created by AlexAbril on 29/3/17.
 */
public class FileManipulation {

    public static void main(String[] args) {

        String home = System.getProperty("user home");
        System.out.println(home);
        System.out.println(
                System.getProperty("hava.io.tpdir"));

        System.out.println(System.getenv("PATH"));

        System.out.println(System.getProperty("user.dir"));

        String tmpDir = System.getProperty("java.io.tmpdir");
        System.out.println(tmpDir);
        //File tmpDirFile = new File(tmpDir);
        File tmpDirFile = new File("/Users/AlexAbril/IdeaProjects");
        File[] fileList = tmpDirFile.listFiles();
        for (File f : fileList) {
            System.out.println(f + " " + f.isDirectory()
                    + " " + f.length());
            ;
            System.out.println();
        }


    }
}
