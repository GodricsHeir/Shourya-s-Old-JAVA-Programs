import javax.swing.JOptionPane;

class SurviveV2 {
/*
 * Welcome to SURVIVE (V2), the turn based e-card game where you need to find a way to survive a situation with WEIRD WILD CARDS
 * given to you by the game.
 * Cook up a story, cook up a scenario, cook up your plotline...AND SURVIVE MF. 
 */



    // Here, we add the cards
    static String[] Opponent = { "Darth Vader", "Black Hole", "Khali" };
    static String[] Location = { "your school", "Dhanbad", "Bathroom" };
    static String[] Weakness = { "have a boner", "have social anxiety", "need to pee", "are a Vampire in the 1800s", "Any temperature above 32*C" };
    static String[] Solution = { "a Vibrator", "Vibranium", "a 9mm Pistol", "Avatar Pussy" };
 



    
    static int Random(int max, int min) {
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        return randomNum;
    }

    static int Search(String[] A, String B) {
        int i = 0;
        while (B.equals(A[i]) != true) {
            ++i;
            if (i >= A.length) {
                return i;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        int playNo = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of players: "));
        int rounds = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rounds to be played: "));
        int[] playPoints = new int[playNo];
        String[] playName = new String[playNo];
        for (int i = 0; i < playNo; i++) {
            System.out.println();
            playName[i] = JOptionPane.showInputDialog("Enter the name of the player: " + (i + 1));
            playName[i].toUpperCase();
        }

        for (int j = 0; j < rounds; j++) {
            for (int k = 0; k < playNo; k++) {
				JOptionPane.showMessageDialog(null,"The Judge for the round is : " + playName[k].toUpperCase());
				JOptionPane.showMessageDialog(null,"You are facing against: " + Opponent[Random(Opponent.length - 1, 0)]);
				JOptionPane.showMessageDialog(null,"You are in: " + Location[Random(Location.length - 1, 0)]);
				JOptionPane.showMessageDialog(null,"You: " + Weakness[Random(Weakness.length - 1, 0)]);

                for (int i = 0; i < playNo; i++) {
                    if (playName[i] != playName[k])
						JOptionPane.showMessageDialog(null,playName[i] + " requires to have: " + Solution[Random(Solution.length - 1, 0)]
                                        + " in their solution");
                }
				JOptionPane.showMessageDialog(null,"How will you survive? ");
                int z = k;
				JOptionPane.showMessageDialog(null,"Enter the winner for this turn: ");
                while (z == k) {
                    String Winner = JOptionPane.showInputDialog("Enter the winner for this turn: ");
                    Winner.toUpperCase();
                    z = Search(playName, Winner);
                    if (z >= playNo) {
                        z = k;
						JOptionPane.showMessageDialog(null, "Name not found OR ");
                    }
                    if (z == k) {
						JOptionPane.showMessageDialog(null,"The Judge CANNOT be the winner of the round");
                    }
                }
                ++playPoints[z];
            }
            System.out.println("Points after round " + j + 1 + " are: ");
            for (int i = 0; i < playNo; i++) {
				JOptionPane.showMessageDialog(null,playName[i] + ": " + playPoints[i]);
            }
        }
        int largest = playPoints[0];
        for (int i = 0; i < playNo; i++) {
            if (playPoints[i] > largest)
                largest = playPoints[i];
        }
		JOptionPane.showMessageDialog(null,"Winner(s) with " + largest + " points is/are: ");
        for (int i = 0; i < playNo; i++) {
            if (playPoints[i] == largest) {
				JOptionPane.showMessageDialog(null,playName[i] + " ");
            }
        }
    }
}