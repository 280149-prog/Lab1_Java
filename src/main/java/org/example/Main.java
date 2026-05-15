package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem(5, 3);
        System.out.println(problem);

        Result result = problem.Solve(10);
        System.out.println(result);
    }
}