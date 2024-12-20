package model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String sex;
    private String birthDate;
    private String phone;
    private String address;
    
    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.sex = builder.sex;
        this.birthDate = builder.birthDate;
        this.phone = builder.phone;
        this.address = builder.address;
    }
    
    // Getters
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSex() { return sex; }
    public String getBirthDate() { return birthDate; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    
    public static class StudentBuilder {
        private int id;
        private String firstName;
        private String lastName;
        private String sex;
        private String birthDate;
        private String phone;
        private String address;
        
        public StudentBuilder(int id) {
            this.id = id;
        }
        
        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public StudentBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }
        
        public StudentBuilder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        
        public StudentBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public Student build() {
            return new Student(this);
        }
    }
}
