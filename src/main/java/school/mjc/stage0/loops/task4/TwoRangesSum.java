package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        switch (numberToSkip <= lastInRow ? (lastInRow >= 0 ? 0 : 1) : 2){
            case 2:
                System.out.println("number to skip is bigger then the last");
                break;
            case 1:
                System.out.println("last number in row is negative");
                break;
            case 0:
                int skipedSum = 0;
                int sum = 0;
                for (int i = 0; i <= lastInRow; i++){
                    sum = sum + i;
                }
                for (int j = 0; j <= numberToSkip; j++){
                    skipedSum = skipedSum + j;
                }
                System.out.println("skipped sum is " + skipedSum);
                System.out.println("counted sum is " + (sum - skipedSum));
        }
    }
}
