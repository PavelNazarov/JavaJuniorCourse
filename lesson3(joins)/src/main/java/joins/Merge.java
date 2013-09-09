package joins;

public class Merge {


    public static int[] getMerge(int[] arr1, int[] arr2){

        int [] resultArray  = new int [getLengthForMerge(arr1,arr2)];
        boolean check;
        int count = 0;

        for(int firstArrayValue:arr1){
            resultArray[count++] = firstArrayValue;
        }

        for(int firstArrayValue: arr2){
            check = true;
            for(int secondArrayValue: arr1){
                if(firstArrayValue == secondArrayValue){
                    check = false;
                }
            }
            if(check) resultArray[count++] = firstArrayValue;
        }

        return resultArray;
    }

    private static int getLengthForMerge(int[] arr1, int[] arr2){

        int resultArrayLength = arr1.length;
        boolean check;

        for(int firstArrayValue: arr2){
            check = true;
            for(int secondArrayValue: arr1){
                if(firstArrayValue == secondArrayValue){
                    check = false;
                }
            }
            if(check) resultArrayLength++;
        }

        return resultArrayLength;
    }



}
