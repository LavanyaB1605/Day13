public class GenericUc {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Max of Integer %d , %d , %d is %d\n\n", 5,4,3,maximum(5,4,3));
        System.out.printf("Max of Float %f , %f , %f is %f\n\n", 7.4,3.7,9.8, maximum(7.4,3.7,9.8));
        System.out.printf("Max of String %s , %s , %s is %s\n\n", "Apple","Peach","Banana",maximum("Apple","Peach","Banana"));
        //Maximum number given at Third position
        System.out.printf("Max of Integer when in 2nd position %d , %d , %d is %d\n", 4,5,3,maximum(4,5,3));
        System.out.printf("Max of Float when in 2nd position %f , %f , %f is %f\n", 3.7,9.4,6.8, maximum(3.7,9.4,6.8));
        System.out.printf("Max of String when in 2nd position %s , %s , %s is %s\n\n", "Apple","Peach","Banana",maximum("Apple","Peach","Banana"));
        //Maximum number given at Third position
        System.out.printf("Max of Integer when in 3rd position %d , %d , %d is %d\n", 4,3,5,maximum(5,4,3));
        System.out.printf("Max of Float when in 3rd position %f , %f , %f is %f\n", 3.7,6.8,9.4, maximum(7.4,3.7,9.4));
        System.out.printf("Max of String when in 3rd position %s , %s , %s is %s\n\n", "Banana","Apple","Peach",maximum("Apple","Peach","Banana"));
    }
}
