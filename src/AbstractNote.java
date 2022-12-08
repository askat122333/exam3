import java.time.LocalDate;

public abstract class AbstractNote implements WriteToFileable {
private  String text;
private LocalDate localDate;
private NoteType noteType;

    public AbstractNote(String text, LocalDate localDate, NoteType noteType) {
        this.text = text;
        this.localDate = localDate;
        this.noteType = noteType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }
}
