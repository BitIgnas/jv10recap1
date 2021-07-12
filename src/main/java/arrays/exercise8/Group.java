package arrays.exercise8;

import arrays.exercise8.exception.MaximumNumberOfStudentsReachedException;

import java.util.List;
import java.util.Set;

public class Group {

    private String groupName;
    private Trainer groupTrainer;
    private Set<Student> groupStudents;

    public Group(String groupName, Trainer groupTrainer, Set<Student> groupStudents) {
        this.groupName = groupName;
        this.groupTrainer = groupTrainer;
        this.groupStudents = groupStudents;

    }

    public Group() {

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Trainer getGroupTrainer() {
        return groupTrainer;
    }

    public void setGroupTrainer(Trainer groupTrainer) {
        this.groupTrainer = groupTrainer;
    }

    public Set<Student> getGroupStudents() {
        return groupStudents;
    }

    public void setGroupStudents(Set<Student> groupStudents) {
        if(groupStudents.size() > 5) {
            throw new MaximumNumberOfStudentsReachedException("Max student size reached");
        } else {
            this.groupStudents = groupStudents;
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", groupTrainer=" + groupTrainer +
                ", groupStudents=" + groupStudents +
                '}';
    }

}
