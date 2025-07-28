
/**
 * Write a description of class Simulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simulation
{
    UserInputReceiver UI = new UserInputReceiver();

    //direction for up(0), down(1), left(2), and right(3). represented by a number from 0 to 3
    //the X and Y axis start at the bottem left corrner with Y being vertical and X being horisontal    
    public Simulation(UserInputReceiver UI, People population) {
        for (Person movement : population.everyBody) {
            if (movement.direction == 0 && movement.y < UI.inputedSpaceLength) {
                movement.y++;
            } else if (movement.direction == 1 && movement.y > 0) {
                movement.y--;
            } else if (movement.direction == 2 && movement.x > 0) {
                movement.x--;
            } else if (movement.direction == 3 && movement.x < UI.inputedSpaceWidth) {
                movement.x++;
            }
        }
    }   
}