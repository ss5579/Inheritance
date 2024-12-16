package Inheritance;

public class Skier extends Sportsman {
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }


    @Override
    public void gym() {
        super.gym();
    }


    public void skierSpeed(int time) {
        System.out.println("Лыжник " +
                getName() + " из команды " +
                getTeam() + " " +
                getAge() + " лет" +
                " завершил гонку за " + time + " мин.");
    }
}
