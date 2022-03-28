import java.util.ArrayList;

public class WalkGeneratorAuth {
    char[] walkDirection;

    public WalkGeneratorAuth(char[] walkDirection) {
        this.walkDirection = walkDirection;
    }

    public boolean willReturnToStartingPoint() {
        int nDirection = 0;
        int sDirection = 0;
        int eDirection = 0;
        int wDirection = 0;
        for (char direction: this.walkDirection) {
            switch (direction){
                case 'n':
                    nDirection++;
                    break;
                case 's':
                    sDirection++;
                    break;
                case 'e':
                    eDirection++;
                    break;
                case 'w':
                    wDirection++;
                    break;
            }

        }
        return (nDirection == sDirection) && (eDirection == wDirection);
    }

    public boolean takeTime(int time) {
        return this.walkDirection.length == time;
    }
}
