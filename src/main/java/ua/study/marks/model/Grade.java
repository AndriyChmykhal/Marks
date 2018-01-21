package ua.study.marks.model;


import java.util.*;

public class Grade {
    String title;
    PupilStorage pupilStorage = new PupilStorage();
    void adPupil(String surname, String name) {
        pupilStorage.addPupil(surname, name);
    }

    double getGradeMarks(int quarter){
        List<Double> avgPupils = new ArrayList<Double>();
        for (Pupil pupil: pupilStorage.getAll()){
            double avgPupil = pupil.getAvgMark(quarter);
            avgPupils.add(avgPupil);
        }

        double avgGrade = Helper.getSumOFList(avgPupils) / avgPupils.size();
        return avgGrade;
    }

    double getAvgForAllQuarters(){
        double sumOfAvgAllPupils = 0;
        for (Pupil pupil: pupilStorage.getAll()){
            double sumAvgForAllQuarters =0;
            Map<Integer,List<Integer>> markStorage = pupil.getMarkStorage();
            for (int key: markStorage.keySet()){
                sumAvgForAllQuarters = sumAvgForAllQuarters + pupil.getAvgMark(key);
            }
            double avgPupilAllQuarters = sumAvgForAllQuarters / markStorage.keySet().size();
            sumOfAvgAllPupils = sumOfAvgAllPupils + avgPupilAllQuarters;
        }
        double avg = sumOfAvgAllPupils / pupilStorage.getAll().size();
        return avg;
    }
}


// реализовать метод для получения средней оценки за четверть для всего класса
// получить средние оценки за все четверти для всего класса

// написать в Runner код который протестирует все методы класа Grade