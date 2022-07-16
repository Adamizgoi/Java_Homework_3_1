public class BonusMilesService {
    public int calculate(int cost) {

        int oneMile = 20;
        int result;

        if (cost > oneMile) {
            result = cost / oneMile;
        } else {
            result = 0;
        }

        return result;

    }
}

