import java.util.Scanner; 

class Player {
    String name;
    int score;
    int numberOfMatches;

    
    public Player(String name, int score, int numberOfMatches) {
        this.name = name;
        this.score = score;
        this.numberOfMatches = numberOfMatches;
    }

    
    public String toString() {
        return "Player: " + this.name + " | Score: " + this.score + " | Matches: " + this.numberOfMatches;
    }
}

public class PlayerComparison {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        Player[] players = new Player[5];

        System.out.println("--- Enter Data for 5 Players ---");
       
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nEnter details for Player #" + (i + 1));

        
            System.out.print("Name: ");
            String name = scanner.nextLine();

      
            System.out.print("Score: ");
            int score = scanner.nextInt();

          
            System.out.print("Matches Played: ");
            int matches = scanner.nextInt();

            scanner.nextLine(); 

            
            players[i] = new Player(name, score, matches);
        }
        
        
        scanner.close();

       
        Player highestScorer = players[0];

       
        for (int i = 1; i < players.length; i++) {
            if (players[i].score > highestScorer.score) {
                highestScorer = players[i];
            }
        }
        
      
        System.out.println("\n--- All Player Details ---");
        for (Player p : players) {
            System.out.println(p);
        }

        System.out.println("\n --- HIGHEST SCORER --- ");
        System.out.println("The player with the highest score is:");
        System.out.println(highestScorer);
    }
}