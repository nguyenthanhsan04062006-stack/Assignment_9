package Lec11_ExceptionHandling.ThrowsExample;

public class ThrowsExample {

    public static void readFile() throws Exception {
        throw new Exception("File not found");
    }
}
