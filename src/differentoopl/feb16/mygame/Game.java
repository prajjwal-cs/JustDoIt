/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 17-02-2021
 *   Time: 4:17 AM
 *   File: Game.java
 */

package differentoopl.feb16.mygame;

public class Game {
    int numberOGuesses = 0;

    public Game() {
        int random = (int) Math.random();
    }

    public int getNumberOGuesses() {
        return numberOGuesses;
    }

    public void setNumberOGuesses(int numberOGuesses) {
        this.numberOGuesses = numberOGuesses;
    }
}
