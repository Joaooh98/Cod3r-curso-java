package poo.manytomany;

import java.util.ArrayList;
import java.util.List;

public class SchoolBoy {

    final String name;
    final List<Course> courses = new ArrayList<>();
    
    SchoolBoy(String name) {
        this.name = name;
    }

    void addCourse(Course course){
        this.courses.add(course);
        course.schoolBoys.add(this);
    }

    Course getCourseByName(String name){
        for (Course course : this.courses) {
            if (course.name.equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "SchoolBoy [name=" + name + "]";
    }   
    
}
