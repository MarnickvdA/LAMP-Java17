package nl.utwente.student.example.expressions;

import nl.utwente.student.example.modules.InnerClassExamples;

public class UnitCallExamples {

    public void call() {}

    public void simpleCall() {
        call();
    }

    public void nestedCall() {
        System.out.println("Nested Call");
    }

    public void anotherNestedCall() {
        InnerClassExamples c = new InnerClassExamples();

        new InnerClassExamples.InnerClass().call();
    }
}
