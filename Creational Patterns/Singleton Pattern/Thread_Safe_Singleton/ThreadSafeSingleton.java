class ThreadSafeSingleton {

    // The singleton instance initially null
    private static ThreadSafeSingleton instance;

    // Private construction to prevent instantiation
    private ThreadSafeSingleton() {}

    // Method to get the instance with synchronized keyword
    public static synchronized ThreadSafeSingleton getInstance() {

        //Check if instance in null
        if(instance == null) {
            // Create a new instance, if null
            instance = new ThreadSafeSingleton();
        }
        // Return the instance
        return instance;
    }
}
