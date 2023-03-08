package ArrayPractice;

public class Demo5LenearSearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,8,9,10,12,14,17};
        int key=1;
        boolean isPresent=false;
        for (int index=0;  index< array.length; index++){
            if (key==array[index]){
                isPresent=true;
                break;
            }
        }
        System.out.println(isPresent? "present": "not present");

      }
      }







