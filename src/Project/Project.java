import java.time.Instant;

public class Project {

    private Long id;
    private String name;
    private String description;
    private Instant createdAt;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String describe() {
        return name + " - " + description;
    }
}
