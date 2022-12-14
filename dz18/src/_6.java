public class _6 {
    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (Exception e){
            System.out.println("Message is empty");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( " null key in getDetails"  );
        }
        return "Сообщение:  " + key;
    }

    public static void main(String[] args) {
        printMessage("null");
    }
}
