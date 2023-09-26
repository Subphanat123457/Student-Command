package Person;

public class Staff implements Person{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;
    private String name;

    @Override
    public String getId(String id) {
        return id;
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public int compute_salary() {
        return 30000;
    }

    @Override
    public int compute_ot(int hours, int rates) {
        return 0;
    }

    @Override
    public int compute_ot(int hours) {
        return 0;
    }

}
