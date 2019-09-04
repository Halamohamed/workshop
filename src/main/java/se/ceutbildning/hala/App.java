package se.ceutbildning.hala;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LocalDate birthDate = LocalDate.parse("1976-09-11");
        String[] certs = {"OCA"};
        String[] skills = {"java","c++","c#","php","sql"};
        //Prgrammer erik = new Prgrammer("testid", "Erik Svensson",birthDate,certs ,skills);
        Prgrammer begners = new Prgrammer(LocalDate.parse("1985-12-12"));
        //System.out.println(erik);
        System.out.println(begners);
    }
}
