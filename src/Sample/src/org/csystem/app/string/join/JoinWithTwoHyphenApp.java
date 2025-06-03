package org.csystem.app.string.join;

import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;

import java.util.ArrayList;

public class JoinWithTwoHyphenApp {
    public static void run()
    {
        ArrayList<String> texts = new ArrayList<>();
        String s;

        while (!(s = Console.readString("Input a text:")).equals("exit"))
            texts.add(s);

        String str = StringUtil.join(texts, "--");

        Console.writeLine("(%s)", str);
    }
    public static void main(String[] args)
    {
        run();
    }
}
