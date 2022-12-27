package nl.utwente.student.example.expressions;

public class AssignmentExamples {
    int x = 0;

    void simpleAssignment() {
        x = 5;
    }

    void preUnaryAssignment() {
        ++x;
    }

    void postUnaryAssignment() {
        x++;
    }

    void operatorAssignment() {
        x += 1;
    }
}
