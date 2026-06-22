public class Test {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First Message");
        logger2.log("Second Message");

        System.out.println(logger1 == logger2);
    }
}



/* OUTPUT:
cd "c:\Users\monik\OneDrive\文件\Desktop\Placement-Preparation-2026\DesignPatterns\" && javac Test.java && java Test
Logger Created
LOG: First Message
LOG: Second Message
true
*/