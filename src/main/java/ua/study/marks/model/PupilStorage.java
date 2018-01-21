package ua.study.marks.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 10/14/2017.
 */
public class PupilStorage {
    List<Pupil> pupils = new ArrayList<Pupil>();

    public void addPupil(String surname, String name){
        Pupil pupil = new Pupil(name, surname);
        pupils.add(pupil);
    }
    public Pupil getPupil(String surname, String name){
        for(Pupil pupil: pupils){
            if (pupil.getName().equals(name) && pupil.getSurname().equals(surname)){
                return pupil;
            }
            }
        return null;
        }

    public List<Pupil> getAll() {
        return pupils;
    }
}
