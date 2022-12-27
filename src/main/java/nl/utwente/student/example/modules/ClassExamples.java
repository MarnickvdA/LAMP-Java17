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

sealed class SealedClassExample permits SealedClassDescendant1, SealedClassDescendant2 {}

final class SealedClassDescendant1 extends SealedClassExample {}
final class SealedClassDescendant2 extends SealedClassExample {}

abstract class AbstractClassExample {}