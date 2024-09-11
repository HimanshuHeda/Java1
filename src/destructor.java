
class MyClass {
    public MyClass() {
        System.out.println("Constructor called");
    }

    // Finalizer method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizer called");
        } finally {
            // Call superclass finalizer (optional)
            super.finalize();
        }
    }
}

public class destructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj = null; // Nullifying the reference, making the object eligible for garbage collection
        System.gc(); // Explicitly call garbage collection (not guaranteed to run immediately)
    }
}
