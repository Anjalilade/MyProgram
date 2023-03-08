package ArrayPractice;

public class Demo8ReverseCharArray {


    public static void main(String[] args) {
        /*
        char[] array = {'A', 'C', 'V', 'F',};
        for(int left=0, right=array.length-1; left<right; left++,right--){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int index=0; index< array.length; index++){
            System.out.println(array[index]);
        }*/

        //second way
        String name="Welcome to Cyber Success";
        char[] array=name.toCharArray();
        for(int left=0, right=array.length-1; left<right; left++,right--){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int index=0; index< array.length; index++){
            System.out.println(array[index]+" ");
        }


    }
    }
