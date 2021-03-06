package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeWilmingtonTest {

    ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();




    @Test
    void hostLectureTest1() {

        double expected = 5;
        System.out.println(instructors.getArray()[1]);

        zipCodeWilmington.hostLecture(instructors.getArray()[0],5);
        double actual = students.getArray()[1].getTotalStudyTime();

        Assert.assertEquals(expected, actual,0);
    }

    @Test
    void hostLectureTest2() {
        double expected = students.getArray()[1].getTotalStudyTime() + 5;

        zipCodeWilmington.hostLecture (1, 5);
        System.out.println("Expected Instructor name is Leon and actual is " + instructors.getArray()[0]);

      double actual =  students.getArray()[1].getTotalStudyTime();

      Assert.assertEquals(expected, actual, 0);
    }


}