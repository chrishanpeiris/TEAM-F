//Chrishan Peiris - S311764 - Group F

//add an abstract class to define the template
abstract class GameTemplate {
   abstract void initialize();//define abstract methods
   abstract void startPlay();//define abstract methods
   abstract void endPlay();//define abstract methods

   //create template method - used final keyword to keep it as a constant template - used void keyword as it does not have any return type
   final void play(){

      //create the order for methods to be run - based on the defined template order, the methods will be executed

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }
}

 //retrive the features from super class "GameTemplate" to sub class "Cricket" using extends keyword
 class Cricket extends GameTemplate {

   //overide the already defined common methods as we want in sub class
   @Override
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   //overide the already defined common methods as we want in sub class
   @Override
   void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   //overide the already defined common methods as we want in sub class
   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}

 //retrive the features from super class "GameTemplate" to sub class "Football" using extends keyword
 class Football extends GameTemplate {

   //overide the already defined common methods as we want in sub class
   @Override
   void endPlay() {
      System.out.println("Football Game Finished!");
   }

   //overide the already defined common methods as we want in sub class
   @Override
   void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }

   //overide the already defined common methods as we want in sub class
   @Override
   void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
}

public class Game {
   //initialize main method
   public static void main(String[] args) {

      GameTemplate game = new Cricket(); // create an object of GameTemplate class and assign to new instance of Cricket class
      game.play(); // using the created GameTemplate object call the method inside Cricket class
      System.out.println();
      game = new Football(); // reassign the GameTemplate object to new instance of Football class
      game.play();// using the created GameTemplate object call the method inside Football class		
   }
}