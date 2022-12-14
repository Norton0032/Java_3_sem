package thirth;

public class Test {
    public static void main(String[] args) {
        StringBuilderNotifier sbn = new StringBuilderNotifier("Hello");

        sbn.actionManager.addActionListener(StringBuilderAction.APPEND,() -> System.out.println("Вызван метод append()"));
        sbn.actionManager.addActionListener(StringBuilderAction.APPENDCODEPOINT, () -> System.out.println("Вызван метод appendCodePoint()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETE, () -> System.out.println("Вызван метод delete()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETECHARAT, () -> System.out.println("Вызван метод deleteCharAt()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REPLACE, () -> System.out.println("Вызван метод replace()"));
        sbn.actionManager.addActionListener(StringBuilderAction.INSERT, () -> System.out.println("Вызван метод insert()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REVERSE, () -> System.out.println("Вызван метод reverse()"));
        sbn.append(" world!");  // Вызван метод append()
        sbn.append(" How are you?");  // Вызван метод append()
        sbn.append(" I'm fine, thank you!");  // Вызван метод append()
        sbn.delete(34, 46);  // Вызван метод delete()
        sbn.reverse();  // Вызван метод reverse()
        sbn.replace(0, 5, "Hello, world!");  // Вызван метод replace()
    }
}
