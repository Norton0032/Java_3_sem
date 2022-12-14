public class _1 {
    public static void main(String[] args) {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Нельзя делить на 0");
        }
    }
}