public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getPackage().getImplementationVersion());
        System.out.println(CommonMain.class.getPackage().getImplementationVersion());
    }
}
