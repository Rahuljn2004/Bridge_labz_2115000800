class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentRecordManagement {
    Student head;

    public void addStudent(int rollNo, String name, int age, String grade, boolean atEnd) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null || !atEnd) {
            newStudent.next = head;
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newStudent;
        }
    }

    public void deleteStudent(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void searchStudent(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student Not Found");
    }

    public void updateGrade(int rollNo, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayStudents() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        srm.addStudent(1, "Alice", 20, "A", true);
        srm.addStudent(2, "Bob", 22, "B", true);
        srm.displayStudents();
        srm.searchStudent(1);
        srm.updateGrade(1, "A+");
        srm.displayStudents();
        srm.deleteStudent(2);
        srm.displayStudents();
    }
}
