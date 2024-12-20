package factory;

import dao.*;

public class DAOFactory {
    public static DAO createDAO(String type) {
        switch (type.toLowerCase()) {
            case "student":
                return new StudentDAO();
            case "course":
                return new CourseDAO();
            case "score":
                return new ScoreDAO();
            default:
                throw new IllegalArgumentException("Unknown DAO type: " + type);
        }
    }
}
