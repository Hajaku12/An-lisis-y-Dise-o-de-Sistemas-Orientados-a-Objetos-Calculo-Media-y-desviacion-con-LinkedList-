package edu.escuelaing.arsw.ASE.app.Calculator;

import edu.escuelaing.arsw.ASE.app.LinkedList.CustomLinkedList;

public class StatisticsCalculator {

    public Double calculateMean(CustomLinkedList list) {
        if (list.getSize() <= 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < list.getSize(); i++) {
            sum += list.getElement(i).getValue();
        }
        return (double) Math.round((sum/list.getSize()) * 100) / 100;
    }

    public Double calculateStdDeviation(CustomLinkedList list) {
        if (list.getSize() < 2) {
            return 0.0;
        }

        double value = 0.0;
        double mean = calculateMean(list);

        for (int i = 0; i < list.getSize(); i++) {
            value += Math.pow((list.getElement(i).getValue() - mean), 2);
        }
        double stdDeviation = Math.sqrt(value / (list.getSize() - 1));
        return (double) Math.round(stdDeviation * 100) / 100;
    }
}