package Patterns.Structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLeadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.getCode());
    }
}
