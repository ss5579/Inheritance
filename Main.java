package Inheritance;

public class Main {
    public static void main(String[] args) {

        Footballer footballer = new Footballer("Роналдо", "Реал", 27);
        Footballer footballer1 = new Footballer("Пеле", "Сантос", 45);

        HockeyPlayer hockeyPlayer = new HockeyPlayer("Овечкин", "Вашингтон Кэпиталз", 39);
        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Сушинский", "Авангард", 35);

        Skier skier = new Skier("Большунов", "Россия", 26);
        Skier skier1 = new Skier("Устюгов", "Россия", 30);

        footballer.gym();
        footballer.scoringGoals(3);

        footballer1.gym();
        footballer1.scoringGoals(2);

        hockeyPlayer.gym();
        hockeyPlayer.scoringGoalsFor(2);

        hockeyPlayer1.gym();
        hockeyPlayer1.scoringGoalsFor(3);

        skier.gym();
        skier.skierSpeed(118);

        skier1.gym();
        skier1.skierSpeed(116);

    }
}
