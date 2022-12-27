package nl.utwente.student.example.expressions;

import java.util.function.Function;

public class LambdaExamples {
    private final Function<Integer, Integer> lambda = integer -> integer * integer;

    private final Function<Integer, Integer> lambdaUnitRef = lambda::apply;

    private final Function<Integer, Integer> lambdaFieldRef = lambda;

    private final Function<Integer, Integer> lambdaCall = integer -> lambda.apply(integer);

    private final Function<Integer, Integer> lambdaWithBody = integer -> {
        int answerToTheUniverse = 42;

        answerToTheUniverse += integer;

        return answerToTheUniverse;
    };
}
