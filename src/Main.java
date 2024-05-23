import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int searchStudent(int id, ArrayList<StudentRegistration> student) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int genderCheck(String gender){
        if (gender.equals("Male") || gender.equals("male")){
            return 1;
        } else if (gender.equals("Female") || gender.equals("female")){
            return 2;
        }
        return -1;
    }

    public static int findCourse(String courseCode, ArrayList<CourseInformation> courseInformation){
        for (int i = 0; i < courseInformation.size(); i++){
            if (courseInformation.get(i).courseCode.equals(courseCode)) return i;
        }
        return -1;
    }


    public static void main(String[] args) {


        Scanner inputInteger = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int option, id, courseCredit, totalCourse;
        String studentName, gender, fathersName, mothersName, mobileNo, email,courseCode, courseTitle;
        String division, district, subDistrict, village, house;

        ArrayList<StudentRegistration> student = new ArrayList<>();
        int numberOfStudent = 0;
        do {
            System.out.println("Choose an option to continue:\n1. Add student\n2. Student information correction\n3. Address correction\n4. Add/remove courses\n5. ");
            System.out.println("15. Display all student");
            option = inputInteger.nextInt();


            if (option == 1) { //Adding new student
                //User input

                /*System.out.print("Enter student name: ");
                studentName = inputString.nextLine();
                System.out.print("Enter student id: ");
                id = inputInteger.nextInt();
                System.out.print("Enter student's gender: ");
                gender = inputString.nextLine();
                System.out.print("Enter student's father's name: ");
                fathersName = inputString.nextLine();
                System.out.print("Enter student's mother's name: ");
                mothersName = inputString.nextLine();
                System.out.print("Enter student,s mobile number: ");
                mobileNo = inputString.nextLine();
                System.out.print("Enter student's email: ");
                email = inputString.nextLine();

                    System.out.println("Enter student's address:");
                    System.out.print("Enter student's division: ");
                    division = inputString.nextLine();
                    System.out.print("Enter student's district: ");
                    district = inputString.nextLine();
                    System.out.print("Enter student's sub district: ");
                    subDistrict = inputString.nextLine();
                    System.out.print("Enter student's village: ");
                    village = inputString.nextLine();
                    System.out.print("Enter student's house: ");
                    house = inputString.nextLine();


                    System.out.println("Enter course information.");
                    if (genderCheck(gender) == 1) System.out.print("How many course he has? ");
                    if (genderCheck(gender) == 2) System.out.print("How many course she has? ");
                    totalCourse = inputInteger.nextInt();

                    for (int i = 0; i < totalCourse; i++){
                        System.out.print("Enter course code: ");
                        courseCode = inputString.nextLine();
                        System.out.print("Enter course title: ");
                        courseTitle = inputString.nextLine();
                        System.out.print("Enter credit hour: ");
                        courseCredit = inputInteger.nextInt();

                        student.get(numberOfStudent).courseInformation.add(i, new CourseInformation(courseCode, courseTitle, courseCredit));
                    }
                    */

            //Default for check

            studentName = "Afiq" + numberOfStudent;
            id = 1 + numberOfStudent;
            gender = "Male" + numberOfStudent;
            fathersName = "Akram" + numberOfStudent;
            mothersName = "Nasim" + numberOfStudent;
            mobileNo = "754" + numberOfStudent;
            email = "fsdcaxz" + numberOfStudent;

            division = "Dhaka" + numberOfStudent;
            district = "Dhaka" + numberOfStudent;
            subDistrict = "Dhamrai" + numberOfStudent;
            village = "Pachlaxmi" + numberOfStudent;
            house = "H-4" + numberOfStudent;

            student.add(numberOfStudent, new StudentRegistration(studentName, id, gender, fathersName, mothersName, mobileNo, email));
            student.get(numberOfStudent).address = new Address(division, district, subDistrict, village, house);
            for (int i = 0; i < 6; i++) {
                courseCode = "CRS" + i;
                courseTitle = "CTL" + i;
                if (i < 2) courseCredit = 1;
                else if (i < 3) courseCredit = 2;
                else courseCredit = 3;

                student.get(numberOfStudent).courseInformation.add(i, new CourseInformation(courseCode, courseTitle, courseCredit));
            }

            numberOfStudent++;
        }
            else if (option == 2) { //Update student information
                System.out.print("Enter student id: ");
                int found, search = inputInteger.nextInt();

                found = searchStudent(search, student);
                if (found != -1) {
                    System.out.println("What do you want to make correction?\n1. Name\n2. Father's name\n3. Mother's name\n4. Mobile no\n5. email");
                    int upgrade = inputInteger.nextInt();

                    switch (upgrade) {
                        case 1:
                            System.out.print("Enter correct name: ");
                            studentName = inputString.nextLine();
                            student.get(found).setStudentName(studentName);
                            break;
                        case 2:
                            System.out.print("Enter correct father's name: ");
                            fathersName = inputString.nextLine();
                            student.get(found).setStudentName(fathersName);
                            break;
                        case 3:
                            System.out.print("Enter correct mother's name: ");
                            mothersName = inputString.nextLine();
                            student.get(found).setStudentName(mothersName);
                            break;
                        case 4:
                            System.out.print("Enter correct mobile no: ");
                            mobileNo = inputString.nextLine();
                            student.get(found).setStudentName(mobileNo);
                            break;
                        case 5:
                            System.out.print("Enter correct email: ");
                            email = inputString.nextLine();
                            student.get(found).setStudentName(email);
                            break;
                        default:
                            System.out.println("Please enter correct number.");
                    }
                } else {
                    System.out.println("Id " + search + " not found.");
                }
            }
            else if (option == 3) {
                System.out.print("Enter student id: ");
                int found, search = inputInteger.nextInt();

                found = searchStudent(search, student);
                if (found != -1) {
                    System.out.println("What do you want to make correction?\n1.Division\n2. District\n3. Sub District\n4. Village\n5. House;");
                    int upgrade = inputInteger.nextInt();

                    switch (upgrade) {
                        case 1:
                            System.out.print("Enter correct division: ");
                            division = inputString.nextLine();
                            student.get(found).address.setDivision(division);
                            break;
                        case 2:
                            System.out.print("Enter correct district: ");
                            district = inputString.nextLine();
                            student.get(found).address.setDistrict(district);
                            break;
                        case 3:
                            System.out.print("Enter correct sub district: ");
                            subDistrict = inputString.nextLine();
                            student.get(found).address.setSubDistrict(subDistrict);
                            break;
                        case 4:
                            System.out.print("Enter correct village: ");
                            village = inputString.nextLine();
                            student.get(found).address.setVillage(village);
                            break;
                        case 5:
                            System.out.print("Enter correct house: ");
                            house = inputString.nextLine();
                            student.get(found).address.setHouse(house);
                            break;
                        default:
                            System.out.println("Please enter correct number.");
                    }
                }
            }
            else if (option == 4) {
                System.out.print("Enter student id: ");
                int found, search = inputInteger.nextInt();

                found = searchStudent(search, student);
                if (found != -1){
                    System.out.println("What you want to do? \n1. Add a course\n2. Remove a course");
                    int addOrRemove = inputInteger.nextInt();

                    if (addOrRemove == 1){
                        System.out.print("Enter course code: ");
                        courseCode = inputString.nextLine();
                        System.out.print("Enter course title: ");
                        courseTitle = inputString.nextLine();
                        System.out.print("Enter credit hour: ");
                        courseCredit = inputInteger.nextInt();

                        student.get(found).courseInformation.add(student.get(found).courseInformation.size(), new CourseInformation(courseCode,courseTitle,courseCredit));
                    } else if (addOrRemove == 2) {
                        System.out.print("Enter course code to remove course: ");
                        courseCode = inputString.nextLine();

                        if (findCourse(courseCode, student.get(found).courseInformation) != -1) {
                            student.get(found).courseInformation.remove(findCourse(courseCode, student.get(found).courseInformation));
                        } else System.out.println("Please enter correct course code.");
                    }
                }
            }
            else if (option == 5) {
                System.out.println("Update obtained marks: ");
            }
            else if (option == 15) {
                int count = 1;
                for (StudentRegistration studentNo : student) {
                    String studentInfo = "Student Name: " + studentNo.getStudentName() + "\n" +
                            "Student id: " + studentNo.getId() + "\n" +
                            "Father's Name: " + studentNo.getFathersName() + "\n" +
                            "Mother's Name: " + studentNo.getMothersName() + "\n" +
                            "Mobile Number: " + studentNo.getMobileNo() + "\n" +
                            "Email: " + studentNo.getEmail() + "\n\n" +
                            "Address: \n" +
                            "Division: " + studentNo.address.getDivision() +
                            "\nDistrict: " + studentNo.address.getDistrict() +
                            "\nSub district: " + studentNo.address.getSubDistrict() +
                            "\nVillage: " + studentNo.address.getVillage() +
                            "\nHouse no: " + studentNo.address.getHouse();

                    System.out.println("Student " + count + "\n" + studentInfo);
                    System.out.println("\nCourse information\n");
                    for (int i = 0; i < studentNo.courseInformation.size(); i++){
                        System.out.print("Course code: " + studentNo.courseInformation.get(i).getCourseCode());
                        System.out.print(" Course title: " + studentNo.courseInformation.get(i).getCourseTitle());
                        System.out.println(" Credit hour: " + studentNo.courseInformation.get(i).getCourseCredit());
                    }

                    System.out.println("----------------------------------");
                    count++;
                }
            }
        } while (option != 0);
    }
}