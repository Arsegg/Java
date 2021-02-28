package com.github.arsegg.homework1;

class Multiplication {
    private static final int N = 10;

    public static void main(final String[] args) {
        for (var i = 1; i <= N; i++) {
            for (var j = 1; j <= N; j++) {
                final var result = i * j;
                System.out.print(result);
                // NB: overhead of this check so low comparing with StringJoiner, Collectors.joining and so on
                if (j < N) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
