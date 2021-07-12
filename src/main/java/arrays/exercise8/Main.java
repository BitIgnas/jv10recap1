package arrays.exercise8;

public class Main {
    public static void main(String[] args) {
        GroupManager manager = new GroupManager();
        // System.out.println(manager.sortStudentsAlphabeticallyByLastName());
        System.out.println(manager.findBiggestGroup());
        System.out.println(manager.findSmallestGroup());
        manager.findBestStudentInGroups().forEach(s -> System.out.print(s + "\n"));
        System.out.println(manager.findBestStudentFromGroup(InitGroups.initGroups()));
        System.out.printf("Younger than 25: %s ", manager.findStudentsYoungerThan25());
        System.out.printf("\nStudents that have experience: %s ", manager.findStudentsWithPreviousJavaExperience());
        System.out.println("\n___________________________");
        System.out.println(manager.findNumberWithExperienceAndWithout());
        System.out.println(manager.findGroupWithMostInexperiencedStudents());
    }
}
