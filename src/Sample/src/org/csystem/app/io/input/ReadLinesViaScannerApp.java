package org.csystem.app.io.input;

import java.io.IOException;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.csystem.util.console.CommandLineArgsUtil.checkLengthEquals;

public class ReadLinesViaScannerApp {
    private static void readLines(Scanner s)
    {
        try (s) {
            while (true) {
                String line = s.nextLine();

                System.out.println(line);
            }
        }
        catch (NoSuchElementException ex) {
            System.out.println("All lines read successfully");
        }
    }

    public static void run(String[] args)
    {
        checkLengthEquals(1, args.length, "wrong number of arguments");

        try {
            Scanner s = new Scanner(Path.of(args[0]));

            readLines(s);
        }
        catch (IOException ex) {
            System.err.printf("Exception occurred:%s%n", ex.getMessage());
        }
    }
    public static void main(String[] args)
    {
        run(args);
    }
}
