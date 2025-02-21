package duke.tasklist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    protected LocalDate by;
    protected String parse;

    public Deadline(String description, String by) {
        super(description);
        this.by = LocalDate.parse(by);
        this.parse = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }

    @Override
    public String toSave() {
        return "[D]" + super.toString() + " (by: " + parse + ")";
    }
}
