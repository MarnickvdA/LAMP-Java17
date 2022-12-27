package nl.utwente.student.example.expressions;

public class ConditionalExamples {

    boolean isTrue = true;

    public void ifExample() {
        if (isTrue) {
            System.out.println("It's true!");
        }
    }

    public void ifElseExample() {
        if (isTrue) {
            System.out.println("It's true!");
        } else {
            System.out.println("It's false!");
        }
    }

    public void ifElseIfExample() {
        if (isTrue) {
            System.out.println("It's true!");
        } else if (42 == 42) {
            System.out.println("Who would have thought!");
        } else {
            System.out.println("Wut?");
        }
    }

    public void ifChainExample() {
        if (isTrue == false) {

        } else if (42 != 32) {

        } else if ("Hi!".equals("Bye!")) {

        } else {
            System.out.println("Stop please!");
        }
    }
}
