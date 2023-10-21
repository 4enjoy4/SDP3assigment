public class Adapter implements NewSystem{
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }
    @Override
    public void newMethod() {
        System.out.println("Adapter is calling oldSystem's legacy method.");
        oldSystem.legacyMethod();
    }
}
