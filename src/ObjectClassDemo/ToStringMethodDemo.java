package ObjectClassDemo;

import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;

public class ToStringMethodDemo{
    public static void main(String[] args) {
        int number=10;
        System.out.println("Binary"+Integer.toBinaryString(number));
        System.out.println("Octal"+Integer.toOctalString(number));
        System.out.println("Hexadecimal"+Integer.toHexString(number));


        Course course=new Course();;
        int hashcode=course.hashCode();
        System.out.println("Decimal hashcode"+hashcode);
        System.out.println("Hexadecimal hashcode"+Integer.toHexString(hashcode));
        //ObjectClassDemo.Course@4554617c
        System.out.println(course.toString());
    }


}
