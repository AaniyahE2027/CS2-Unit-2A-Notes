public class Main {

   public static void main(String []args) {
      // BOOLEAN VARIABLES can only hold true or false
      boolean lightsOn = false;
      boolean dannyPresent = true;

      // BOOLEAN EXPRESSIONS are like questions (or comparisons)
      // where the only possible answer are true or false
      boolean exp1 = (dannyPresent == true); // is Danny here?
      boolean exp2 = (lightsOn != true); //are the lights NOT on? (off)

      // Comparing numerical values
      int x = 6;
      int y = 7;

      //Check for EQUALITY using the == operator
      System.out.println(x==y);
      
      // Check for NOT equal using the != operator
      boolean exp3 = (x != y); //store the boolean exp result in a variable
      System.out.println(exp3);

      // Compare numeric value (int, double) using RELATIONAL OPERATORS
      System.out.println(x < y); //true (6 IS LESS THAN 7)
      System.out.println(x > y); //false
      System.out.println(x <= y); //true
      System.out.println(x >= y); //false
      System.out.println(y > y); //true
      System.out.println(y == y); //true
      
      double z = 6.0;
      System.out.println( x == z); // true 6 and 6.0 are the same value!

      // IF STATEMENTS: use boolean expressions to make
      // DECISIONS about which code to excute

      //Determine what value or condition your choice rests on
      //EX: Using the elevator at BWL depends on TIME
      
      double time = 8.5; // means 8:30 AM
      time = 7.75; // mean 7:45 AM
      time = 9; // means 9 AM
      
      if (time < 8) {
         // if statement BODY only runs if CONDITIONS were TRUE
         System.out.println("you can take the elevator!");
      }
      // Statement below is outside of the if statement, so it'll run anyway
      System.out.println("The elevator is only available before 8 AM!");

      // TWO-WAY SELECTION: if block + else block
      if (time < 8) {
         System.out.println("Eligible for elevator!");
      }
   
      else {
         // STATEMENT in ELSE block runs when IF block is false
         System.out.println("Take the stairs...");
      }

      // Another example of TWO-WAY SELECTION
      // in this case, using just a boolean VALUE (not an EXPRESSION)
      boolean heads = false; 
      // if (true)
      if (heads) {
         System.out.println("Flipped heads! Wear White");
      }
      else {
         System.out.println("Flipped tails Wear Black!");
      }
      
      // MULTI-WAY SELECTION
      //1. NESTING if statements if like asking "follow-up questions"
      int age = 16;
      boolean havePermit = false;
      System.out.println("Let's see if you can take this road test...");
      if (age >= 16) {
         System.out.println("Alright, I guess you're old enough...");
         //After passing the first condition (age>=16)
         // you ask a FOLLOW-UP (another if statement)
         if ( havePermit == true){
            System.out.println("Fine, get in the car");
         }
      }
      else {
         System.out.println("you're too young, womp womp");
      }

      //2. ELSE IF BLOCKS (chained conditionals)
      // when your are accounting for multiple possible answer
      int battery = 19;
      // Always start the with an IF statement
      if (battery >= 95){
         System.out.println("Unplug your phone!🔋");
      }
      // ORDER MATTER FOR ELSE IF BLOCKS
      // as soon as a condition is met, the rest of the chain is SKIPPED!
      else if ( battery < 20) {
         System.out.println("LOW POWER MODE 🪫");
      }
      else if ( battery <= 50) {
         System.out.println("Plug in your phone soon...");
      }
      else{
         System.out.println("..otherwise");
      }



   } // main method
} // this closes the main class
