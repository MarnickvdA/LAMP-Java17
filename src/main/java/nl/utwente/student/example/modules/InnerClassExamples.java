package nl.utwente.student.example.modules;

public class InnerClassExamples {

    public InnerClassExamples() {
        new NestedClass().call();
    }
    public static class InnerClass {
        public void call() {
        }
    }

    public class NestedClass {
        public void call() {}
    }
}