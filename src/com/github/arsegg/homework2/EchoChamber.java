package com.github.arsegg.homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

class EchoChamber {
    public static void main(final String[] args) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final List<String> result = bufferedReader.lines()
                .takeWhile(s -> !"".equals(s))
                .collect(Collectors.toUnmodifiableList());
        result.forEach(System.out::println);
    }
}
