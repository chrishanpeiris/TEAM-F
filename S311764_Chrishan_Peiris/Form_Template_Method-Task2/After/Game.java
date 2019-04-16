
class Cricket {
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
   void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }
 }

 class Football {
   void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
   void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }
   void endPlay() {
      System.out.println("Football Game Finished!");
   }
 }

 public class Game {
   public static void main(String[] args) {

      Cricket cricket = new Cricket();
      cricket.startPlay();
      cricket.initialize();
      cricket.endPlay();

      System.out.println();

      Football football = new Football();
      football.startPlay();		
      football.initialize();
      football.endPlay();
   }
}