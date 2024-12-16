package Inheritance;

public class Footballer extends Sportsman{
    public Footballer(String name,  String team, int age) {
        super(name, team, age);
    }

    @Override
    public void gym() {
        System.out.println(getName() + " занимается спортом");
    }


    public void scoringGoals(int goals) {
        System.out.println("Футболист " +
                getName() + " из команды " +
                getTeam() + " " +
                getAge() + " лет" +
                " забил " + goals + " мяча.");
    }

}
