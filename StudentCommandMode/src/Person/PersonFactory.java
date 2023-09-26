package Person;

public class PersonFactory{
    public Person createPerson (String Order){
        return switch (Order) {
//            case "Student" -> new Student();
//            case "Teacher" -> new Teacher();
            case "Staff" -> new Staff();
            default -> null;
        };
    }
}
