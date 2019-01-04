package com.github.chapter02.puzzlers08;

public class DosEquis {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.print(true ? x : 0);
        System.out.print(false ? i : x);
    }
}
