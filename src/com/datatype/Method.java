package com.datatype;

public class Method {
    public static void main(String[] args) {
        System.out.println(calcScore(true, 800, 5, 100));
        System.out.println();
        System.out.println(calcScore(true, 1000, 8, 200));
        System.out.println();
        System.out.println(calcScore(false,568, 7, 44));
        displayHighScorePosition("Mirriam", 1);

        System.out.println(calculatedHighScorePosition(1500));
        System.out.println(calculatedHighScorePosition(900));
        System.out.println(calculatedHighScorePosition(400));
        System.out.println(calculatedHighScorePosition(50));
        System.out.println();
        System.out.println();

        displayHighScorePosition("Mirriako", calculatedHighScorePosition(1500));
        System.out.println();

        displayHighScorePosition("Jem", calculatedHighScorePosition(900));
        System.out.println();

        displayHighScorePosition("Mimi", calculatedHighScorePosition(400));
        System.out.println();

        displayHighScorePosition("Mirriam", calculatedHighScorePosition(50));
        System.out.println();
        System.out.println();

        displayHighScorePosition("Brenda", calculatedHighScorePosition(1000));
        System.out.println();

        displayHighScorePosition("Winnie", calculatedHighScorePosition(500));
        System.out.println();

        displayHighScorePosition("Martha", calculatedHighScorePosition(100));
    }
    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = 0;
        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 2000;
            System.out.println("your final score was " + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculatedHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;
    }
}
