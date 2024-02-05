package arrays.challenge;

import java.util.Arrays;

public class ForeachChallenge {
    public static void main(String[] args) {
        double[] studentNotes = new double[4];

        System.out.println(Arrays.toString(studentNotes));

        studentNotes[0] = 7.9;
        studentNotes[1] = 8;
        studentNotes[2] = 6.9;
        studentNotes[3] = 9.7;

        System.out.println(Arrays.toString(studentNotes));
        System.out.println(studentNotes[0]); // first element
        System.out.println(studentNotes[3]); // last elemento
        // System.out.println(studentNotes[4]); // error

        double totalStudentA = 0;
        for (double d : studentNotes) {
            totalStudentA += d;
        }

        System.out.println(totalStudentA / studentNotes.length);

        final double storedNote = 5.9;
        double[] studentNoteB = { 6.9, 8.9, storedNote, 10 };

        double totalStudentB = 0;
        for (double d : studentNoteB) {
            totalStudentB +=d;
        }
        System.out.println(totalStudentB / studentNoteB.length);
    }
}
