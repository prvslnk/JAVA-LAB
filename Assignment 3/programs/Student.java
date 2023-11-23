/*  Declare a variable Student which consists of a student’sname, markfor Programming, mark for Logic and a grade for Lab. A mark is a number (between 0 and100) and a grade is a letter (between A and F). Write a predicate (a boolean method) isStronger, which takes two students and returns true if and only if the first student has done better than the second in the ordering below. 
a.  the Programming mark is most important, 
b.  numerical order of Logic marks is the determining factor when two students have the same Programming mark, 
c.  alphabetical order of Lab grades is the determining factor when two students have the same Programming and Maths marks.
write a java program */

class Student {
    String name;
    int programmingMark;
    int logicMark;
    char labGrade;

    Student(String name, int programmingMark, int logicMark, char labGrade) {
        this.name = name;
        this.programmingMark = programmingMark;
        this.logicMark = logicMark;
        this.labGrade = labGrade;
    }

    public static boolean isStronger(Student student1, Student student2) {
        if (student1.programmingMark > student2.programmingMark) {
            return true;
        } else if (student1.programmingMark == student2.programmingMark) {
            if (student1.logicMark > student2.logicMark) {
                return true;
            } else if (student1.logicMark == student2.logicMark) {
                return student1.labGrade < student2.labGrade;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 80, 85, 'A');
        Student student2 = new Student("Gita", 80, 85, 'B');

        if (isStronger(student1, student2)) {
            System.out.println(student1.name + " has performed better than " + student2.name);
        } else {
            System.out.println(student2.name + " has performed better than " + student1.name);
        }
    }
}
