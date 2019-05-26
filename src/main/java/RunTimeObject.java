public class RunTimeObject {

    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/java-lang-runtime-class-in-java/

       //This method returns the instance or Runtime object associated with the current Java application.
        Runtime run=Runtime.getRuntime();
        System.out.println("free memory "+run.freeMemory());
        System.out.println("Total memory "+run.totalMemory());
        System.out.println("NO of prcessors "+run.availableProcessors());

    }
}
