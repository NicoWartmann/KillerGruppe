package ch.killergruppe.game;

public class Main {

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        final Game game = new Game();
        game.gameSetup();
        }
}
