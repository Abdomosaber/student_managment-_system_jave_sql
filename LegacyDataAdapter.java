package adapter;

import model.Student;
import java.util.Map;

public class LegacyDataAdapter {
    public Student adaptFromLegacyData(Map<String, String> legacyData) {
        return new Student.StudentBuilder(Integer.parseInt(legacyData.get("student_id")))
                .firstName(legacyData.get("first_name"))
                .lastName(legacyData.get("last_name"))
                .sex(legacyData.get("gender"))
                .birthDate(legacyData.get("dob"))
                .phone(legacyData.get("contact"))
                .address(legacyData.get("addr"))
                .build();
    }
    
    public Map<String, String> adaptToLegacyData(Student student) {
        Map<String, String> legacyData = new java.util.HashMap<>();
        legacyData.put("student_id", String.valueOf(student.getId()));
        legacyData.put("first_name", student.getFirstName());
        legacyData.put("last_name", student.getLastName());
        legacyData.put("gender", student.getSex());
        legacyData.put("dob", student.getBirthDate());
        legacyData.put("contact", student.getPhone());
        legacyData.put("addr", student.getAddress());
        return legacyData;
    }
}
