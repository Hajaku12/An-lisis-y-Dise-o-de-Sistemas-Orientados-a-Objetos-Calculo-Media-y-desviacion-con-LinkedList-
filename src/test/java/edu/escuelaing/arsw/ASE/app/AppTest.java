package edu.escuelaing.arsw.ASE.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.escuelaing.arsw.ASE.app.LinkedList.CustomLinkedList;
import edu.escuelaing.arsw.ASE.app.Calculator.StatisticsCalculator;
import edu.escuelaing.arsw.ASE.app.Calculator.FileProcessor;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest
    extends TestCase
{
    public AppTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    public void testMeanCalculation() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        CustomLinkedList list = new CustomLinkedList();
        list.add(3.4);
        list.add(5.7);
        list.add(9.0);
        Double res = calculator.calculateMean(list);
        assertEquals(6.03, res);
    }

    public void testStdDeviationCalculation() {
        StatisticsCalculator calculator = new StatisticsCalculator();
        CustomLinkedList list = new CustomLinkedList();
        list.add(3.4);
        list.add(5.7);
        list.add(9.0);
        Double res = calculator.calculateStdDeviation(list);
        assertEquals(2.81, res);
    }

    public void testMeanCalculationFromFile() throws IOException {
        FileReader fr = new FileReader("numeros.txt");
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile(fr);
        Double res = fileProcessor.getMean();
        assertEquals(550.6, res);
    }

    public void testStdDeviationCalculationFromFile() throws IOException {
        FileReader fr = new FileReader("numeros.txt");
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile(fr);
        Double res = fileProcessor.getStdDeviation();
        assertEquals(572.03, res);
    }
}