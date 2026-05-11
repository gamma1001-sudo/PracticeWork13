public class Main {

    public static void insertionSort(
            Student[] students
    ) {

        for (int i = 1;
             i < students.length;
             i++) {

            Student current = students[i];

            int j = i - 1;

            while (
                    j >= 0
                            &&
                            students[j].idNumber
                                    >
                                    current.idNumber
            ) {

                students[j + 1] = students[j];

                j--;
            }

            students[j + 1] = current;
        }
    }

    public static void printStudents(
            Student[] students
    ) {

        for (Student s : students) {

            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        Student[] students = {

                new Student(3, "Ivan"),

                new Student(1, "Alex"),

                new Student(5, "Maria"),

                new Student(2, "Dmitry")
        };

        System.out.println(
                "До сортировки:"
        );

        printStudents(students);

        insertionSort(students);

        System.out.println(
                "\nПосле сортировки:"
        );

        printStudents(students);
    }
}