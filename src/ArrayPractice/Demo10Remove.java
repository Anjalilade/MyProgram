package ArrayPractice;

public class Demo10Remove {
    public static void main(String[] args) {


        int[] array = {10, 20, 30, 40};
        int elemtsToBeDeleted = 10;
        int indexOfElementsToBeDeleted = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]==elemtsToBeDeleted){
                indexOfElementsToBeDeleted=1;
                break;
            }
        }

    }
}
