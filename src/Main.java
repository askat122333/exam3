import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //заметка 1
       Note note = new Note("Когда бизнес не просто приносит деньги, но и позволяет заниматься тем,\n что тебе нравится" +
               "," +
               "" + " эффективность всегда возрастает. Поэтому сегодня мы поговорим о том,\n" +
               " на чем можно заработать на жизнь любителям животных.",LocalDate.now(),NoteType.IDEA,"Бизнес");

        //контакт 1
       Contacts contacts = new Contacts("sada",LocalDate.now(),NoteType.IDEA,
               "0700546456","Asyl",PhoneNumberType.MOBILE_PHONE_NUMBER);

        //заметка 2
       BigDecimal bigDecimal = new BigDecimal("1121212213");
        Duty duty = new Duty(contacts.getContactsName(),LocalDate.now(),NoteType.DUTY,"Долг",bigDecimal);

        //заметка 3
        Note note2 = new Note("Новогодние праздники для 60% бизнеса - время повышенного спроса.\n Миллионы людей" +
                " тратят больше среднестатистического, готовы покупать множество подарков сразу,\n обращаются в " +
                "нестандартные для себя компании, чтобы подарки отличались \nоригинальностью.",LocalDate.now(),NoteType.IDEA
        , "Бизнес плпан 2");


        //контакт 2
        Contacts contacts2 = new Contacts("w    eqweqeq",LocalDate.now(),NoteType.IDEA,
                "131345","Aigerim",PhoneNumberType.LANDLINE_PHONE_NUMBER);
        //контакт 3
        Contacts contacts3 = new Contacts("w wqeqwwdqw   eqweqeq",LocalDate.now(),NoteType.IDEA,
                "0700999999","Sasha",PhoneNumberType.MOBILE_PHONE_NUMBER);


        AbstractNote [] abstractNotes = {note,duty , note2, contacts , contacts2 , contacts3};
        for (int i = 0; i < abstractNotes.length; i++) {
            abstractNotes[i].makeANote("NoteBook.txt");
            System.out.println();
        }

    }
}