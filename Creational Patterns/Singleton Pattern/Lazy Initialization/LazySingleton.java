
class LazySingleton {
    // The instance initially null
    private static LazySingleton instance;

    //Private constructor to prevent instantiation
    private LazySingleton() {}

    // Method to get instance
    public static LazySingleton getInstance() {

        // Check is instance null
        if(instance == null) {
            // If null create a instance
            instance = new LazySingleton();
        }
        // Return instance
        return instance;
    }
}
