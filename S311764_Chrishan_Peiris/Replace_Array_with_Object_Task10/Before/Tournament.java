class TournamentInfo {

    public void displayScore() {
        String[] row = new String[2];
        row[0] = "Liverpool";
        row[1] = "15";
        String name = row[0];
        int score = Integer.parseInt(row[1]);
        System.out.println("Team - " + name +"   "+ "Score - " + score);
    }
}

public class Tournament {
    public static void main(String[] args) {
        TournamentInfo tournamentinfo = new TournamentInfo();
        tournamentinfo.displayScore();
    }
}