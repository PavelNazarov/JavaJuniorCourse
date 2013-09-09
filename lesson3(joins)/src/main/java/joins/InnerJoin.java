package joins;

public class InnerJoin {

    public static int[] getInnerJoin(int[] arr1, int[] arr2){

        int [] resultArray  = new int [getLengthForInnerJoin(arr1, arr2)];
        boolean check;
        int count = 0;

        for(int firstArrayValue: arr1){
            check = false;
            for(int secondArrayValue: arr2){
                if(firstArrayValue == secondArrayValue){
                    check = true;
                    break;
                }
            }
            if(check) resultArray[count++] = firstArrayValue;
        }
        return resultArray;
    }


    private static int getLengthForInnerJoin(int[] arr1, int[] arr2){
        int resultArrayLength = 0;
        boolean check;
        for(int firstArrayValue: arr1){
            check = false;
            for(int secondArrayValue: arr2){
                if(firstArrayValue == secondArrayValue){
                    check = true;
                    break;
                }
            }
            if(check)resultArrayLength++;
        }
       return resultArrayLength;
    }


}
