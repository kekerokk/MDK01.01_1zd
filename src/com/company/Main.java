package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("mass.txt"))) {
            OptionalInt optionalMax = in.lines().mapToInt(Integer::parseInt).max();
            if (optionalMax.isPresent()) {
                System.out.println("Max: " + optionalMax.getAsInt());
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}