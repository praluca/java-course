package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object oriented, platform independent language");
        languages.put("Python", "an interpreted, high level, object oriented programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "BEGINNERS ALL PURPOSES SYMBOLIC INSTRUCTION CODE");
        languages.put("Lisp", "Therein lies madness ");
        System.out.println(languages.get("Java"));

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
