import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalkGeneratorAuthTest {

    @Test
    void dont_moving_and_returning_to_starting_point() {
        char[] walkDirection = {};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint());
    }

    @Test
    void moving_and_dont_return_to_starting_point() {
        char[] walkDirection = {'n', 'e'};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertFalse(walkGeneratorAuth.willReturnToStartingPoint());
    }

    @Test
    void simple_walk_to_return_to_starting_point() {
        char[] walkDirection = {'n', 'w', 's', 'e'};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint());

    }

    @Test
    void complex_walk_to_return_to_starting_point() {
        char[] walkDirection = {'n','s','n','s','n','s','n','s','n','s'};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint());
    }


    @Test
    void take_zero_time() {
        char[] walkDirection = {};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        int time = 0;
        Assertions.assertTrue(walkGeneratorAuth.takeTime(time));
    }

    @Test
    void take_more_than_zero_time() {
        char[] walkDirection = {'n','s','n','s','n'};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        int time = 5;
        Assertions.assertTrue(walkGeneratorAuth.takeTime(time));
    }

    @Test
    void dont_move_complete_test() {
        char[] walkDirection = {};
        int time = 0;
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint() && walkGeneratorAuth.takeTime(time));

    }

    @Test
    void simple_move_complete_test() {
        char[] walkDirection = {'n', 'w', 's', 'e'};
        int time = 4;
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint() && walkGeneratorAuth.takeTime(time));
    }

    @Test
    void return_to_starting_point_and_take_10_min() {
        char[] walkDirection = {'n','s','n','s','n','s','n','s','n','s'};
        int time = 10;
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint() && walkGeneratorAuth.takeTime(time));
    }
}
