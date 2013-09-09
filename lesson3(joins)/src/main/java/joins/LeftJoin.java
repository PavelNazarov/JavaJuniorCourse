package joins;

public class LeftJoin {

    public static int[] getLeftJoin(int[] arr1, int[] arr2){

        int [] resultArray  = new int [getLengthForInnerJoin(arr1,arr2)];
        boolean check;
        int count = 0;

        for(int firstArrayValue:arr1){
            resultArray[count++] = firstArrayValue;
        }

        for(int firstArrayValue: arr2){
            check = false;
            for(int secondArrayValue: arr1){
                if(firstArrayValue == secondArrayValue){
                    check = true;
                }
            }
            if(check) resultArray[count++] = firstArrayValue;
        }

        return resultArray;
    }



    private static int getLengthForInnerJoin(int[] arr1, int[] arr2){
        int resultArrayLength = arr1.length;
        boolean check;

        for(int firstArrayValue: arr2){
            check = false;
            for(int secondArrayValue: arr1){
                if(firstArrayValue == secondArrayValue){
                    check = true;
                }
            }
            if(check) resultArrayLength++;
        }

        return resultArrayLength;
    }


}
