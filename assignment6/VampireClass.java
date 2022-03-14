package java_assignments.assignment6;

import java.util.Arrays;

public class VampireClass {
    public void printVampireNumbers(int numberOfVampires){
        int foundVampireCount = 0;
        for(long iterator = 10; foundVampireCount < numberOfVampires; iterator++ ){

            if(numberOfDigits(iterator)%2 != 0) {
                iterator = getSeriesLastNumber(iterator);
                continue;
            }

            if( isVampire(iterator) ){
                foundVampireCount++;
                System.out.println(foundVampireCount+" : "+iterator);
            }
        }
    }

    private boolean isVampire(long iterator){
        for(long fang1 = 2; fang1 < highestDivisor(iterator); fang1++){
            if(isDivisible(iterator,fang1)){
                long fang2 = iterator / fang1;
                if(isValidFangs(iterator, fang1, fang2) && fang1 <= fang2)
                    return true;
            }
        }
        return false;
    }
    private boolean isValidFangs(long original, long fang1, long fang2){
        String fang1AsString = Long.toString(fang1);
        String fang2AsString = Long.toString(fang2);

        if(hasTrailingZeros(fang1AsString) && hasTrailingZeros(fang2AsString)) return false;

        int originalLength = numberOfDigits(original);
        if(numberOfDigits(fang1) != originalLength / 2 || numberOfDigits(fang2) != originalLength / 2) return false;

        byte[] originalBytes = Long.toString(original).getBytes();
        byte[] fangBytes = (fang1AsString + fang2AsString).getBytes();

        Arrays.sort(originalBytes);
        Arrays.sort(fangBytes);

        return Arrays.equals(originalBytes, fangBytes);
    }
    private  int numberOfDigits(long num){
        return Long.toString(Math.abs(num)).length();
    }
    private long getSeriesLastNumber(long iterator){
        return iterator * 10 - 1;
    }
    private long highestDivisor(long iterator){
        return (long) (Math.sqrt(iterator) + 1);
    }
    private boolean isDivisible(long iterator, long fang1){
        return iterator % fang1 == 0;
    }
    private boolean hasTrailingZeros(String fang){
        return fang.endsWith("0");
    }
}
