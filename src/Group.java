import java.util.ArrayList;

public class Group {

    public ArrayList<Student> studentList = new ArrayList<>();
    public static Group sGroup;

    public static Group getInstance() {

        if(sGroup == null){
            sGroup = new Group();

        }
        return sGroup;

    }
    public Group() {
        initGroup();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    private void initGroup(){
        studentList.add(new Student("Valera", 8, 7, 4, 3, 2, 1));
        studentList.add(new Student("Piotr", 3, 8, 7, 2, 1, 4));
        studentList.add(new Student("David", 2, 1, 8, 7, 3, 4));
        studentList.add(new Student("Karola", 1, 2, 4, 8, 7, 3));
        studentList.add(new Student("Jaroslav", 10, 6, 4, 9, 8, 7));
        studentList.add(new Student("Elmo", 4, 3, 2, 1, 7, 8));
        studentList.add(new Student("Shano", 3, 3, 2, 7, 8, 5));
        studentList.add(new Student("Snickers", 4, 1, 7, 8, 2, 3));
        studentList.add(new Student("Elly", 1, 7, 8, 5, 2, 1));
        studentList.add(new Student("Michal", 7, 8, 4, 2, 1, 3));
        studentList.add(new Student("Nadya", 4, 20, 1, 4, 4, 3));
        studentList.add(new Student("Tomek", 3, 2, 1, 20, 2, 3));
        studentList.add(new Student("Lukash", 1, 2, 3, 2, 2, 20));
    }

    public void call() {
        for (Student aStudentList : studentList) {
            aStudentList.list();
        }
        VoteForLife.vote();
    }

}
