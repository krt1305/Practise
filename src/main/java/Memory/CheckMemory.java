package Memory;

public class CheckMemory {

    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        long memory1, memory2;
        System.out.println("Total memory is "+runtime.totalMemory());
        System.out.println("Free memory is "+runtime.freeMemory());



    }
}
