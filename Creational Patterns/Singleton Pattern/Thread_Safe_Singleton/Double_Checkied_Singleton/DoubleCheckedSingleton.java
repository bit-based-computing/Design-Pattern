public class DoubleCheckedSingleton {

    // The single instance, initially null and marked as volatile
    private static volatile DoubleCheckedSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        // First check is it null (not syncronized)
        if(instance == null) {
            // Syncronized on the class object
            synchronized (DoubleCheckedSingleton.class) {
                // Check is it null
                if(instance == null) {
                    // Create the instance if null
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        // Return the instance
        return instance;
    }
}
