import java.util.Comparator;

public class Checker implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Player player1 = (Player) o1;
        Player player2 = (Player) o2;
        if (player1.score == player2.score){
            return player1.name.compareTo(player2.name);
        }
        return player2.score-player1.score;
    }
}
