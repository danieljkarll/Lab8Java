package lab1;

import lab2.IntroJavaCourse;

public class main {
    public static void main(String[] args) {
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("111", "Advanced Java", 4, "Intro To Java");
        advancedJava.displayOutput();
        System.out.println("-----------------");

        IntroToProgrammingCourse introToProgramming = new IntroToProgrammingCourse("122", "Intro To Programming", 2);
        introToProgramming.displayOutput();
        System.out.println("-----------------");

    }
}
