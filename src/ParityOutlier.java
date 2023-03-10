public class ParityOutlier {

    public static void main(String[] args) {

        int[] arr = {2,4,0,100,4,11,2602,36};
        int result = findParityOutlier(arr);
        System.out.println(result);


    }

    static int findParityOutlier(int[] integers){
        int even = 0; int odd = 0; int i = 0; int numEven = 0;
        while ((even == 0 || odd ==0) && i < integers.length) {
            if (integers[i]%2 == 0) {
                even=i;
                numEven++;
            }
            else {odd=i;}
            i++;
        }
        return numEven > 1 ? integers[odd] : integers[even];
    }
}
