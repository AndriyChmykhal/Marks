package ua.study.marks.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pupil {
    private Map<Integer,List<Integer>> markStorage = new HashMap<Integer, List<Integer>>();
    private String name;
    private String surname;

    Pupil(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getName(){
        return name;
    }

    String getSurname(){
        return surname;
    }

    void setMark(int quarter, int mark) {
        if (!markStorage.containsKey(quarter)){
            List<Integer> marks = new ArrayList<Integer>();
            marks.add(mark);
            markStorage.put(quarter, marks);
        } else
        markStorage.get(quarter).add(mark);
    }

    public double getAvgMark(int quarter){
        double avg;
        int sum = 0;
        List<Integer> quarterMarks = markStorage.get(quarter);
        for(Integer mark:quarterMarks){
            sum = sum + mark;
        }
        int markQuantity = quarterMarks.size();
        avg = sum/markQuantity;
        return avg;

    }

    public Map<Integer,List<Integer>> getMarkStorage(){
        return markStorage;
    }
}

