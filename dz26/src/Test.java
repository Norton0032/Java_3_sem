public class Test {
    public static void main(String[] args) {
        var hashtab = new Hashtab();
        hashtab.add("1", "A");
        hashtab.add("2", "B");
        hashtab.add("3", "C");
        hashtab.add("4", "D");
        System.out.println(hashtab.find("1"));
        System.out.println(hashtab.find("2"));
        hashtab.delete("2");
        System.out.println(hashtab.find("2"));

        System.out.println("==============");

        // Задание 4
        hashtab = new Hashtab();
        hashtab.add("A", "A");
        hashtab.add("B", "B");
        hashtab.add("C", "C");
        hashtab.add("D", "D");
        hashtab.add("E", "E");
        hashtab.add("F", "F");
        hashtab.add("G", "G");
        hashtab.add("H", "H");
        hashtab.add("I", "I");
        hashtab.add("J", "J");

        for (int i = 0; i < 3; i++) {
            var min = hashtab.getMinimum();
            System.out.println(min);
            hashtab.delete(min);
        }
    }
}
