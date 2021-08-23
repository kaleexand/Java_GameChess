import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList <Player> players = main.createPlayers();
        for (Player player : players){
            System.out.println(player);
        }
        main.CreatePieces();

//        Player whitePlayer = new Player("Beth Harmon","beth,harmon@gmail.com", true, 2000, 20);
//        Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@gmail.com", false, 2500, 45);

//        System.out.println("The player 1 name is " + whitePlayer.getName());
//        System.out.println("The player 2 name is " + blackPlayer.getName());
//
//        System.out.println("The player 1 email is " + whitePlayer.getEmail());
//        System.out.println("The player 2 email is " + blackPlayer.getEmail());
//
//        System.out.println("The player 1 rank is " + whitePlayer.getRank());
//        System.out.println("The player 2 rank is " + blackPlayer.getRank());
//
//        System.out.println("The player 1 play white - " + whitePlayer.isWhite());
//        System.out.println("The player 2 play black - " + !blackPlayer.isWhite());
//
//        System.out.println("The player 1 age is " + whitePlayer.getAge());
//        System.out.println("The player 2 age is " + blackPlayer.getAge());

//        System.out.println(whitePlayer);
//        System.out.println(blackPlayer);
//
//        try {
//            whitePlayer.setRank(2000);
//        }
//        catch (IllegalArgumentException err){
//            System.out.println("please update rank to validate");
//        }
//        blackPlayer.setRank(-100);
    }

    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Beth Harmon","beth,harmon@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@gmail.com", false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return(players);
    }

    public void createPieces(){
        King whiteKing = new King(new Spot("h", 7), "white_king", true);
        System.out.println(whiteKing);

    }
}

