import ua.study.marks.model.Pupil;
import ua.study.marks.model.PupilStorage;
import ua.study.marks.model.Teacher;

/**
 * Created by ASUS on 11/5/2017.
 */
public class Runner {
    public static void main(String[] args){

        PupilStorage pupilStorage = new PupilStorage();
        pupilStorage.addPupil("Snow", "John");
        Teacher teacher = new Teacher();

        Pupil localPupil = pupilStorage.getPupil("Snow", "John");
        if (localPupil == null){
            throw new RuntimeException("Such pupil is absent");
        }
        teacher.setPupilMark(localPupil,1,5);
        teacher.setPupilMark(localPupil,1,3);
        System.out.println(localPupil.getAvgMark(1));
    }
}
