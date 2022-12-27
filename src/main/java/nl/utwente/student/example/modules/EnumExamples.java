package nl.utwente.student.example.modules;

public enum EnumExamples {
    ONE
}

enum EnumWithMultipleConstants {
    ONE, TWO, THREE
}

enum EnumWithConstructor {
    ONE(1), TWO(2), THREE(3);

    EnumWithConstructor(int number) {}
}

enum EnumWithOverrides {
    FIRST("1st") {
        @Override
        int getNumber() {
            return 1;
        }
    }, SECOND("2nd"), THIRD("3rd");

    EnumWithOverrides(String name) {}

    int getNumber() {
        return Integer.parseInt(name().substring(0, 1));
    }
}
