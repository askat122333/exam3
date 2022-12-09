import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Duty extends Note implements WriteToFileable {
    private BigDecimal dutySum;

    public Duty(String text, LocalDate localDate, NoteType noteType,String header,BigDecimal dutySum) {
        super(text, localDate, noteType,header);
        this.dutySum =dutySum;
    }

    @Override
    public void makeANote(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write("              "+this.getHeader()+"        "+this.getLocalDate()+"\n");
            fileWriter.write(this.getText()+" должен - "+this.dutySum+"\n"+"\n"+"_______________________________"+
                    "\n");
            System.out.println("Запись сделана");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
