import java.util.Arrays;

public class TheBlueOceanReverse {

    public static void main(String[] args) {
        TheBlueOceanReverse theBlueOceanReverse = new TheBlueOceanReverse();

        int[] arr = {1,2,3,4,5};
        theBlueOceanReverse.getReverseData(arr, 5);

    }

    public int[] getReverseData(int[] listNumber, int search) {
        int[] result = {};
        for (int i=0; i<listNumber.length; i++) {
            if (listNumber[i] != (search))
                result = new int[i];
        }
        return result;
    }
}
