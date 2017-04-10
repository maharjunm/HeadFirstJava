package com.tw.guessGame;

public class GuessGame {

    Player player1;
    Player player2;
    Player player3;
    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        while(true) {
            int target = (int)Math.random()*10;
            System.out.println("I am guessing a number between 0 to 9");
            player1.guess();
            player1.guess();
            player2.guess();
            player3.guess();

            if(target == player1.number ){
                System.out.println("Player 1 won the Game");
            } else if(target == player2.number) {
                System.out.println("Player 2 won the Game");
            } else if(target == player3.number){
                player3IsRight = true;
            }

            if(player1IsRight || player2IsRight || player3IsRight) {
                System.out.println("Is the player1 guess is correct " + player1IsRight);
                System.out.println("Is the player2 guess is correct " + player2IsRight);
                System.out.println("Is the player3 guess is correct " + player3IsRight);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("Players have to Try again");
            }
        }
    }
}
