package arrays.exercise8;

import java.util.*;
import java.util.stream.Collectors;

import static arrays.exercise8.InitGroups.initGroups;
import static java.util.stream.Collectors.toCollection;

public class GroupManager {

    private static final List<Group> groups = initGroups();

    public void printGroups() {
        groups.forEach(System.out::println);
    }

    public Set<Student> sortStudentsAlphabeticallyByLastName() {
        return groups.stream()
                .map(Group::getGroupStudents)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(Student::getLastName))
                .collect(toCollection(LinkedHashSet::new));
    }

    public List<Group> findBiggestGroup() {
        Set<Student> biggestGroup = groups.stream()
                .map(Group::getGroupStudents)
                .max(Comparator.comparing(Set::size))
                .orElseThrow(NoSuchElementException::new);

        return groups.stream()
                .filter(group -> group.getGroupStudents().containsAll(biggestGroup))
                .collect(Collectors.toList());
    }

    public List<Group> findSmallestGroup() {
        Set<Student> biggestGroup = groups.stream()
                .map(Group::getGroupStudents)
                .min(Comparator.comparing(Set::size))
                .orElseThrow(NoSuchElementException::new);

        return groups.stream()
                .filter(group -> group.getGroupStudents().containsAll(biggestGroup))
                .collect(Collectors.toList());
    }

    public List<Student> findBestStudentInGroups() {
        List<Student> bestStudents = new ArrayList<>();

        Map<Set<Student>, List<Group>> groupedStudents = groups.stream()
                .collect(Collectors.groupingBy(Group::getGroupStudents));

        groupedStudents.values().forEach(student -> {
            student.stream()
                    .map(Group::getGroupStudents)
                    .flatMap(Collection::stream)
                    .max(Comparator.comparing(Student::getStudentGrade))
                    .ifPresent(bestStudents::add);
        });

        return bestStudents;
    }

    public Student findBestStudentFromGroup(List<Group> group) {
        return group.stream()
                .map(Group::getGroupStudents)
                .flatMap(Collection::stream)
                .max(Comparator.comparing(Student::getStudentGrade))
                .get();
    }

    public Set<Student> findStudentsYoungerThan25() {
        return groups.stream()
                .map(Group::getGroupStudents)
                .flatMap(Collection::stream)
                .filter(student -> student.getAge() < 25)
                .collect(Collectors.toSet());
    }

    public Set<Student> findStudentsWithPreviousJavaExperience() {
        return groups.stream()
                .map(Group::getGroupStudents)
                .flatMap(Collection::stream)
                .filter(Student::getHasPreviousJavaKnowledge)
                .collect(Collectors.toSet());
    }

    public Map<Boolean, Long> findNumberWithExperienceAndWithout() {
        return groups.stream()
                .map(Group::getGroupStudents)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(
                        Student::getHasPreviousJavaKnowledge,
                        Collectors.collectingAndThen(
                                Collectors.groupingBy(Student::getHasPreviousJavaKnowledge, Collectors.counting()),
                                map -> map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue()
                        )
                ));
    }

    public List<Group> findGroupWithMostInexperiencedStudents() {
        List<Student> inexperiencedStudents = new ArrayList<>();

        Map<Set<Student>, List<Group>> groupedStudents = groups.stream()
                .collect(Collectors.groupingBy(Group::getGroupStudents));

        groupedStudents.values().forEach(student -> {
            student.stream()
                    .map(Group::getGroupStudents)
                    .flatMap(Collection::stream)
                    .filter(s -> !s.getHasPreviousJavaKnowledge())
                    .max(Comparator.comparing(Student::getHasPreviousJavaKnowledge))
                    .ifPresent(inexperiencedStudents::add);
        });

        return groups.stream()
                .filter(group -> group.getGroupStudents().contains(inexperiencedStudents.get(0)))
                .collect(Collectors.toList());
    }
}
