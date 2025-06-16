public class Main {
    public  static void main(String[] args)
    {
        Student student2 = new Student("2023001", "신주헌", "재학", "2003-08-29", "010-5297-6743");

        student2.addCourse("Java");
        student2.addCourse("Python");

        System.out.println("학생2의 정보");
        student2.printInfo();

        Professor professor = new Professor("P051", "박교수", "재직", "1992-12.21", "010-2361-1231");
        professor.addLecture("Java");
        professor.addLecture("Application Security");

        System.out.println("교수의 정보");
        professor.printInfo();




    }
}
//    final static int studentNum = 3;
//    // 0:id, 1:name, 2:status, 3: birthdate, 4:contact
//    static String[][] students = new String[studentNum][5];
//    static ArrayList<String>[] courseLists = new ArrayList[studentNum];
//
//    public static void main(String[] args) {
//        for(int i = 0; i < studentNum; i++)
//            courseLists[i] = new ArrayList<>();
//
//        setStudent(0, "2023001", "신주헌", "재학", "2003-08-29", "010-5297-6743");
//        setStudent(1, "2023002", "홍길동", "휴학", "2003-03-22", "010-2343-5654");
//        setStudent(2, "2023003", "이순신", "재학", "2003-06-26", "010-4364-2344");
//
//        addCourse(0, "자료구조");
//        addCourse(0, "운영체제");
//
//        addCourse(1, "데이터베이스");
//
//        addCourse(0, "자료구조");
//
//        addCourse(2, "자료구조");
//        addCourse(2, "운영체제");
//        addCourse(2, "데이터베이스");
//        removeCourse(2, "자료구조");
//
//        printAllStudents();
//
//        }
//
//        public static void setStudent(int index, String id, String name, String status ,String birthdate , String contact) {
//            students[index][0] = id;
//            students[index][1] = name;
//            students[index][2] = status;
//            students[index][3] = birthdate;
//            students[index][4] = contact;
//        }
//
//        public static void addCourse(int index, String CourseName)
//        {
//            courseLists[index].add(CourseName);
//        }
//
//        public static void removeCourse(int index, String CourseName)
//        {
//            courseLists[index].remove(CourseName);
//        }
//
//        public static int getCourseNumber(int index)
//        {
//            return courseLists[index].size();
//        }
//
//        public static void printAllStudents()
//        {
//            for(int i = 0; i < students.length; i++)
//            {
//                printStudentInfo(i);
//                System.out.println();
//            }
//        }
//        public static void printStudentInfo(int index)
//        {
//                System.out.print("=== 학생" + (index + 1) + " 정보 ===\n");
//                System.out.println(students[index][0]);
//                System.out.println(students[index][1]);
//                System.out.println(students[index][2]);
//                System.out.println(students[index][3]);
//                System.out.println(students[index][4]);
//
//                int courseNum = getCourseNumber(index);
//
//                System.out.println("\n<수강 교과목: 총 " + courseNum + " 개>");
//                if(courseLists[index].isEmpty())
//                    System.out.print("없음");
//                else
//                    for(String course : courseLists[index])
//                        System.out.println(course);
//                System.out.println();
//            }
//
//        }
