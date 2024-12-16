package Inheritance;

public class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public void gym() {
        super.gym();
    }

    public void scoringGoalsFor(int assists) {
        System.out.println("Хоккеист " +
                getName() + " из команды " +
                getTeam() + " " +
                getAge() + " лет" +
                " забил " + assists + " шайбы.");
    }
}