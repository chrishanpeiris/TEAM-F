
// defined the object instead of an array
class TournamentObject {
    private String name; // variables to keep object values
    private int score; // variables to keep object values

    // implement a method to set name
    public void setName(String arg) {
        name = arg; // assign the passed argument value to the variable
    }

    // implement a method to set score
    public void setScore(String arg) {
        score = Integer.parseInt(arg); // assign the passed argument value to the variable
    }

    // implement a method to get the name
    public String getName() {
        return name;
    }

    // implement a method to get the score
    public int getScore() {
        return score;
    }

}

class TournamentInfo {
    TournamentObject row = new TournamentObject(); // create an Object instance of TournamentObject class

    public void displayScore() {
        row.setName("Liverpool"); // call the setName method via created object instance and passed the argument
        row.setScore("15"); // call the setScore method via created object instance and passed the argument

        String name = row.getName(); // call the getName method via created object instance and retrive the set value
        int score = row.getScore();// call the getScore method via created object instance and retrive the set
                                   // value
        System.out.println("Team - " + name + "   " + "Score - " + score);
    }
}

public class Tournament {
    public static void main(String[] args) {
        TournamentInfo tournamentinfo = new TournamentInfo(); // create an Object instance of TournamentInfo class
        tournamentinfo.displayScore(); // call displayScore method via the created instance
    }
}