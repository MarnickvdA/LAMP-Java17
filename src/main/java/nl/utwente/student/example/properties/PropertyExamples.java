package nl.utwente.student.example.properties;

import nl.utwente.student.example.modules.ClassExamples;

import java.util.function.Function;

public class PropertyExamples {
    public static final int CONSTANT_FIELD = 5;
    public int uninitializedField;
    public int initializedField = 5;
    private final int multiModifierField = 5;
    public String stringField = "Hi!";
    public ClassExamples classField = new ClassExamples();
    public Function<Integer, Integer> lambdaField = integer -> integer * integer;
}
