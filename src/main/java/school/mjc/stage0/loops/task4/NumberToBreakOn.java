package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        switch (toBreakWith < numberToGoUntil ? 0 : 1){
            case 0:
                for (int i = 1; i <= toBreakWith; i++){
                    System.out.println(i);
                }
                break;
            case 1:
                System.out.println("iterating till the end");
                for (int i = 1; numberToGoUntil >= i; i++){
                    System.out.println(i);
                }
                break;
        }
    }
}
