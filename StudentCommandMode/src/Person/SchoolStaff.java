package Person;

public abstract class SchoolStaff {
    public final void register(int i){
        enterData();
        takePhoto();
        uploadDocument();
        generateID(i);
        saveData();
        printID();
    }
    public abstract void enterData();
    public abstract void takePhoto();
    public abstract void uploadDocument();
    public abstract void generateID(int i);
    public abstract void saveData();
    public abstract void printID();
}
