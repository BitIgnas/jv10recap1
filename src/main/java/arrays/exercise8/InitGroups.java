package arrays.exercise8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class InitGroups {

    public static List<Group> initGroups() {
        Group javaVilnius10 = new Group();
        javaVilnius10.setGroupName("JavaVilnius10");
        javaVilnius10.setGroupTrainer(new Trainer(
                "Vidmantas",
                "Expertonis",
                LocalDate.of(1997, 10, 2),
                true, 8.9));
        javaVilnius10.setGroupStudents(new HashSet<>(Arrays.asList(
                new Student("Mike", "Jamison", LocalDate.of(2001, 6, 23), 7.2, true),
                new Student("Darius", "Girenas", LocalDate.of(2003, 6, 6), 9.2, true),
                new Student("Jack", "Mills", LocalDate.of(1976, 12, 11), 6.6, false),
                new Student("Arnas", "Butkevicius", LocalDate.of(2000, 12, 3), 8.3, false)
        )));

        Group pythonKaunas5 = new Group();
        pythonKaunas5.setGroupName("PythonKaunas5");
        pythonKaunas5.setGroupTrainer(new Trainer(
                "Edvinas",
                "Java",
                LocalDate.of(1990, 10, 21),
                true, 8.9));
        pythonKaunas5.setGroupStudents(new HashSet<>(Arrays.asList(
                new Student("Jonas", "Valanciunas", LocalDate.of(1992, 2, 23), 6.3, false),
                new Student("Antanas", "Antanavicius", LocalDate.of(1992, 2, 23), 9.7, false),
                new Student("Domantas", "Sabonis", LocalDate.of(1995, 6, 9), 3.6, false),
                new Student("Mantas", "Kalnietis", LocalDate.of(1982, 10, 11), 5.6, true),
                new Student("Gitanas", "Nauseda", LocalDate.of(1976, 12, 11), 7.5, true)
        )));

        Group javascriptKlaipeda3 = new Group();
        javascriptKlaipeda3.setGroupName("javascriptKlaipeda3");
        javascriptKlaipeda3.setGroupTrainer(new Trainer(
                "Anna",
                "Scripter",
                LocalDate.of(1999, 8, 14),
                true, 8.9));
        javascriptKlaipeda3.setGroupStudents(new HashSet<>(Arrays.asList(
                new Student("Ona", "Programuotoja", LocalDate.of(1992, 10, 23), 10, false),
                new Student("sda", "sda", LocalDate.of(1992, 2, 23), 7, false),
                new Student("Mario", "NeAnglas", LocalDate.of(1995, 6, 9), 2.2, false),
                new Student("Luigi", "Itailai laimejo", LocalDate.of(1982, 10, 11), 6.5, false),
                new Student("!lorem", "!ipsum", LocalDate.of(1976, 12, 11), 8.3, false)
        )));

        return new ArrayList<>(Arrays.asList(
                javaVilnius10, pythonKaunas5, javascriptKlaipeda3
        ));
    }
}
