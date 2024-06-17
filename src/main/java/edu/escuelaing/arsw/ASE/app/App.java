package edu.escuelaing.arsw.ASE.app;

import java.io.FileReader;
import java.io.IOException;

import edu.escuelaing.arsw.ASE.app.Calculator.FileProcessor;

public class App
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader(args[0]);
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile(fr);
        System.out.println("The mean is: " + fileProcessor.getMean());
        System.out.println("The standard deviation is: " + fileProcessor.getStdDeviation());
    }
}