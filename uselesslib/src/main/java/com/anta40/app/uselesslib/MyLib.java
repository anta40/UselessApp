package com.anta40.app.uselesslib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLib {
    public String scrambleString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }

        Collections.shuffle(characters);

        StringBuilder scrambled = new StringBuilder();
        for (char c : characters) {
            scrambled.append(c);
        }

        return scrambled.toString();
    }
}
