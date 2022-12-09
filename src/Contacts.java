import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Contacts extends AbstractNote implements WriteToFileable{
    private String phoneNumber;
    private String contactsName;
    private PhoneNumberType phoneNumberType;

    public Contacts(String text, LocalDate localDate, NoteType noteType,String phoneNumber,String contactsName
            ,PhoneNumberType phoneNumberType) {
        super(text, localDate, noteType);
        this.phoneNumber = phoneNumber;
        this.contactsName = contactsName;
        this.phoneNumberType = phoneNumberType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public PhoneNumberType getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    @Override
    public void makeANote(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.write(this.getLocalDate()+"\n"+this.phoneNumber+"\n"+this.contactsName+"\n"+
                    this.phoneNumberType+"\n"+this.getText()+"\n"+"\n"+"_______________________________"+"\n");
            System.out.println("Запись сделана");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
