package nl.utwente.student.example.expressions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatchExamples {
    public void tryCatch() {
        try {
            System.out.println("Something");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String tryWithResourcesCatch() {
        try (FileReader fr = new FileReader("fakepath");
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
