package ObjectClassDemo;

public class HashCodeVsToString {
    public static void main(String[] args) {
        Course course = new Course();
        //hashcode() returns integer value which is a  not a direct memory address
        //it is just number which present that actual memory address
        System.out.println(Integer.toHexString(course.hashCode()));
        System.out.println(course.toString());
    }
}
