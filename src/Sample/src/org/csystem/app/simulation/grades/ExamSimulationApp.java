package org.csystem.app.simulation.grades;

import org.csystem.util.console.CommandLineArgsUtil;

public class ExamSimulationApp {
    public static void run(String [] args)
    {
        CommandLineArgsUtil.checkLengthEquals(1, args.length, "wrong number of arguments");
        ExamSimulation examSimulation = new ExamSimulation(args[0]);

        examSimulation.run();
    }

    public static void main(String[] args)
    {
        run(args);
    }
}
