public class MostRecurringString {
    public static void main(String[] args) {

        String name = "Elites";
        String name2 = new String("Elites");
        String name4 = new String("Elites").intern();
        String name3 = "Elites";
        System.out.println(name == name4);
    }
}
