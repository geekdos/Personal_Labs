package com.geekdos.app.corba.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by theXuser on 1/5/2017.
 */
public class NotesManagerImpl extends NotesManagerPOA {
    List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student students) {
        this.students.add(students);
    }

    @Override
    public float getNote(String cne) {
        float note = 0;

        for (Student student: students) {
            if (cne.equals(student.cne)) {
                note = calculeMoyenne(student);
            }
        }
        return note;
    }

    @Override
    public Student[] getValidated() {

        return new Student[0];
    }

    @Override
    public Student getTheFirstOne() {
        double note = 0;double max = 0;
        Student magoron = null;

        for (Student student: students) {
            note = calculeMoyenne(student);
            if (note > max){
                max = note;
                magoron = student;
            }
        }
        return magoron;
    }

    @Override
    public Student[] getSortedStudentsByNote() {
        return new Student[0];
    }


    private float calculeMoyenne(Student student){
        float sommeNotes = student.noteElement1 + student.noteElement2;
        return sommeNotes / 2;
    }

}
