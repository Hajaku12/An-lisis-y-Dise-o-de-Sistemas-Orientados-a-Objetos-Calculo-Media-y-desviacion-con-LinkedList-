package edu.escuelaing.arsw.ASE.app.Calculator;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

import edu.escuelaing.arsw.ASE.app.LinkedList.CustomLinkedList;

public class FileProcessor {
    
    Double mean;
    Double stdDeviation;

    public void processFile(FileReader file) throws IOException {
        CustomLinkedList list = new CustomLinkedList();
        String numberLine;
        BufferedReader bf = new BufferedReader(file);
        while ((numberLine = bf.readLine()) != null) {
            Double element = Double.parseDouble(numberLine);
            list.add(element);
        }
        

        StatisticsCalculator calculator = new StatisticsCalculator();
        mean = calculator.calculateMean(list);
        stdDeviation = calculator.calculateStdDeviation(list);

    }
    
    public Double getMean() {
        return mean;
    }
    
    public Double getStdDeviation() {
        return stdDeviation;
    }
    
}