package ua.study.marks.model;


import java.util.List;

public class Helper {
    public static double getSumOFList(List<Double> inputList){
        double sum = 0;
        for (double element: inputList){
            sum = sum + element;
        }
        return sum;
    }
}
