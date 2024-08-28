# Lazy Initialization

This approach creates the singleton object only when it's needed.

 ```java
   class LazySingleton {
    // The instance initially null
    private static LazySingleton instance;
    
        //Private constructor to prevent instantiation
        private LazySingleton() {}
    
        // Method to get instance
        public static LazySingleton getInstance() {
    
            // Check if instance is null
            if(instance == null) {
                // If null create a new instance
                instance = new LazySingleton();
            }
            // Return instance
            return instance;
        }
    }
```
[Code Link](https://github.com/bit-based-computing/Design-Pattern/blob/main/Creational%20Patterns/Singleton%20Pattern/Lazy%20Initialization/LazySingleton.java)

## Advantage
- if the singleton is never used in the application, it does not crete the object (saving resources).
    
## Disadvantage
- This approach is not thread-safe. 
- If multiple threads call **getInstance()** simultaneously when **instance** is null, 
  it's possible to create multiple instances.
