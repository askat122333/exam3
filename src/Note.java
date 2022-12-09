import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Note extends AbstractNote implements WriteToFileable{
    private String header;

    public Note(String text, LocalDate localDate, NoteType noteType, String header) {
        super(text, localDate, noteType);
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public void makeANote(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write("              "+this.header+"        "+this.getLocalDate()+"\n");
            fileWriter.write(this.getText()+"\n"+"\n"+"_______________________________"+"\n");
            System.out.println("Запись сделана");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
