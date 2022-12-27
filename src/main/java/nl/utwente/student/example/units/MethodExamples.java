package nl.utwente.student.example.units;

import nl.utwente.student.example.modules.ClassExamples;
import nl.utwente.student.example.modules.EnumExamples;

public class MethodExamples {

    public void example() {}

    public void exampleWithParam(int x) {}

    public void exampleWithMultiParams(int x, String y) {}

    public String exampleWithReturnValue() {
        return "Example";
    }

    public ClassExamples exampleWithClassReturn() {
        return new ClassExamples();
    }

    public EnumExamples exampleWithEnumReturn() {
        return EnumExamples.ONE;
    }

    public String exampleWithBody(int x) {
        System.out.println("Today we are going to print " + x);
        System.out.printf("Or we do it with the format way: %d", x);

        return Integer.toString(x);
    }
}
