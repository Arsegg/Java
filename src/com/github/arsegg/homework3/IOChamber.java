package com.github.arsegg.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

class IOChamber {
    public static void main(final String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if (args.length > 0) {
            try {
                bufferedReader = Files.newBufferedReader(Path.of(args[0]));
            } catch (IOException ignore) {
                System.out.println("Файл не распознан. Введите ваши сообщения.");
            }
        }

        final List<String> result = bufferedReader.lines()
                .takeWhile(s -> !"".equals(s))
                .collect(Collectors.toUnmodifiableList());
        result.forEach(System.out::println);
    }
}
