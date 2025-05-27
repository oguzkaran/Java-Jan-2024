package org.csystem.app.io.concat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.csystem.util.console.CommandLineArgsUtil.checkLengthGreater;

public class ConcatFilesApp {
    public static void appendFile(FileOutputStream fos, String srcPath) throws IOException
    {
        try (FileInputStream fis = new FileInputStream(srcPath)) {
            fos.write(fis.readAllBytes());
        }
    }

    public static void concatFiles(FileOutputStream fos, String [] args) throws IOException
    {
        try (fos) {
            for (int i = 0; i < args.length - 1; ++i) {
                appendFile(fos, args[i]);
            }
        }
        catch (FileNotFoundException ex) {
            new File(args[args.length - 1]).delete();
        }
    }

    public static void run(String[] args)
    {
        checkLengthGreater(2, args.length, "wrong number of arguments");

        try  {
            FileOutputStream fos = new FileOutputStream(args[args.length - 1]);

            concatFiles(fos, args);
        }
        catch (IOException ex) {
            System.err.printf("IO Exception occurred:%s%n", ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
