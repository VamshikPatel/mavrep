package com.example.vvce.Average;

/**
 * Hello world!
 */
public class App {
    
    public int AverageOfTwo(int a, int b) {
        return (a + b) / 2;
    }
    
    public int AverageOfThree(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.AverageOfTwo(6, 4));
        System.out.println(app.AverageOfThree(6, 4, 8));
    }
}
