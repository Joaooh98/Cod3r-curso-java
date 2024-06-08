package poo.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Course {
    
    String name;
    List<SchoolBoy> schoolBoys = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addSchoolBoy(SchoolBoy schoolBoy){
        this.schoolBoys.add(schoolBoy);
        schoolBoy.courses.add(this);
    }

    @Override
    public String toString() {
        return "Course [name=" + name + "]";
    }
}
