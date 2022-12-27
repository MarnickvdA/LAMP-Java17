package nl.utwente.student.example.modules;

import java.io.Serializable;

public record RecordExamples() {
}

record RecordWithParameter(int x) {
}

record RecordWithImplements() implements Serializable {
}
