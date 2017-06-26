import java.util.HashMap;
import java.util.Map;

public class Challenge {

    private String author;
    private String type;
    private String task;
    private String notes;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "=================================================\r\n" +
                "Challenge : " +
                "\nauthor : '" + author + '\'' +
                ", \r\ntype : '" + type + '\'' +
                ", \ntask : '" + task + '\'' +
                ", \nnotes : '" + notes + '\'' +
                "\r\n=================================================";

    }
}
