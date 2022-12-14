package Twelve;

public class Test {
    public static void main(String[] args) {
        StringBuilderUndo sbu = new StringBuilderUndo("Hello");

        sbu.append(" world!");  // Hello world!
        sbu.append(" How are you?");  // Hello world! How are you?
        sbu.append(" I'm fine, thank you!");  // Hello world! How are you? I'm fine, thank you!
        sbu.delete(34, 46);  // Hello world! How are you? I'm fine
        System.out.println(sbu);

        sbu.undo();  // Hello world! How are you? I'm fine, thank you!
        System.out.println(sbu);

        sbu.undo();  // Hello world! How are you?
        System.out.println(sbu);

        sbu.undo();  // Hello world!
        System.out.println(sbu);

        sbu.reverse();  // !dlrow olleH
        System.out.println(sbu);

        sbu.undo();  // Hello world!
        System.out.println(sbu);
    }
}
