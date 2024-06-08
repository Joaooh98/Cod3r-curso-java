package poo.manytomany;

public class CourseTest {
    public static void main(String[] args) {
        SchoolBoy schoolBoy1 = new SchoolBoy("John");
        SchoolBoy schoolBoy2 = new SchoolBoy("Smith");
        SchoolBoy schoolBoy3 = new SchoolBoy("Carter");
        
        Course course1 = new Course("Java");
        Course course2 = new Course("JDK 17");
        Course course3 = new Course("Amazon Cloud");
        
        course1.addSchoolBoy(schoolBoy1);
        course1.addSchoolBoy(schoolBoy2);
        course1.addSchoolBoy(schoolBoy3);
        course2.addSchoolBoy(schoolBoy2);
        course2.addSchoolBoy(schoolBoy3);
        course2.addSchoolBoy(schoolBoy2);
        course3.addSchoolBoy(schoolBoy1);

        for (SchoolBoy schoolBoy : course1.schoolBoys) {
            System.out.println(schoolBoy.name+" one school to many Course Boy:: "+course1.name);
        }

        for (Course course : schoolBoy1.courses) {
            System.out.println(course.name+" one Course to many school Boy: "+schoolBoy1.name);
        }

        Course courseResponse = schoolBoy1.getCourseByName("Java");

        if (courseResponse != null) {
            System.out.println(courseResponse.name);
            System.out.println(courseResponse.schoolBoys);
        }
    }
}
