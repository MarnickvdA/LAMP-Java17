package nl.utwente.student.example.modules;

import java.io.Serializable;

public interface InterfaceExamples {
}

interface InterfaceWithExtends extends InterfaceExamples {}

interface InterfaceWithMultiExtends extends Serializable, InterfaceExamples {}
