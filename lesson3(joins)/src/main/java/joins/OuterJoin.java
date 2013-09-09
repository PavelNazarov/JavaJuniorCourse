package joins;

public class OuterJoin {

     public static int[] getOuterJoin(int[] arr1, int[] arr2){

         int [] resultArray  = new int [getLengthForOuterJoin(arr1, arr2)];
         boolean check;
         int count = 0;

         for(int firstArrayValue: arr1){
             check = true;
             for(int secondArrayValue: arr2){
                 if(firstArrayValue == secondArrayValue){
                     check = false;
                     break;
                 }
             }
             if(check){
                 resultArray[count++] = firstArrayValue;
             }
         }

         for(int firstArrayValue: arr2){
             check = true;
             for(int secondArrayValue: arr1){
                 if(firstArrayValue == secondArrayValue){
                     check = false;
                     break;
                 }
             }
             if(check){
                 resultArray[count++] = firstArrayValue;
             }
         }
         return resultArray;
     }

    private static int getLengthForOuterJoin(int [] arr1, int [] arr2){

        int resultArrayLength = 0;
        boolean check;

        for(int firstArrayValue: arr1){
            check = true;
            for(int secondArrayValue: arr2){
                if(firstArrayValue == secondArrayValue){
                    check = false;
                    break;
                }
            }
            if(check){
                resultArrayLength++;
            }
        }

        for(int firstArrayValue: arr2){
            check = true;
            for(int secondArrayValue: arr1){
                if(firstArrayValue == secondArrayValue){
                    check = false;
                    break;
                }
            }
            if(check){
                resultArrayLength++;
            }
        }

        return resultArrayLength;

    }





}
