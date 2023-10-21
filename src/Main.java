public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        NewSystem adapter = new Adapter(oldSystem);

        adapter.newMethod(); // Uses the old system through the adapter
    }
}