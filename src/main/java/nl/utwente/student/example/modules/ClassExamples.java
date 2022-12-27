package nl.utwente.student.example.modules;

import java.io.Serializable;

public class ClassExamples {
}

class ClassWithExtensions extends ClassExamples {

}

class ClassWithImplementations implements InterfaceExamples {

}

class ClassWithExtendsAndImplements extends ClassExamples implements InterfaceExamples {

}

class ClassWithMultipleImplementations implements  InterfaceExamples, Serializable {

}
