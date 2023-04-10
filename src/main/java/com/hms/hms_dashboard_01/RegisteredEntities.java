package com.hms.hms_dashboard_01;

import java.util.ArrayList;
import java.util.Collection;

public class RegisteredEntities {
    static ArrayList<Student> students = new ArrayList<Student>(
            (Collection) new Student("student", "123")
    );
}
