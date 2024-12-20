package observer;

import java.util.ArrayList;
import java.util.List;

public class StudentObserver {
    private List<StudentListener> listeners = new ArrayList<>();
    
    public void addListener(StudentListener listener) {
        listeners.add(listener);
    }
    
    public void removeListener(StudentListener listener) {
        listeners.remove(listener);
    }
    
    public void notifyStudentAdded(String studentName) {
        for (StudentListener listener : listeners) {
            listener.onStudentAdded(studentName);
        }
    }
    
    public void notifyStudentUpdated(String studentName) {
        for (StudentListener listener : listeners) {
            listener.onStudentUpdated(studentName);
        }
    }
    
    public void notifyStudentDeleted(String studentName) {
        for (StudentListener listener : listeners) {
            listener.onStudentDeleted(studentName);
        }
    }
}

interface StudentListener {
    void onStudentAdded(String studentName);
    void onStudentUpdated(String studentName);
    void onStudentDeleted(String studentName);
}
