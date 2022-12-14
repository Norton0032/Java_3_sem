public class IllegalAddress extends Error{
    public IllegalAddress(String address){
        super("Неверный адрес: " + address);
    }
}
