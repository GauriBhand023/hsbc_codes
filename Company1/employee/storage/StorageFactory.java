package Company1.employee.storage;

public class StorageFactory {
    public static Storage getStorage() {
        return new StorageImpl();
    }
}
