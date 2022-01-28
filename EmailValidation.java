package Practiceprograms;
import java.util.regex.*;    
import java.util.*;

public class EmailValidation {

public static void main(String[] args) {
ArrayList<String> emails = new ArrayList<String>();  
        emails.add("muraliadabala@gmail.com");  
        emails.add("adabalamurali@gmail.com");  
        emails.add("murali.adabala@gmail.com");  
        emails.add("Murali.Adabala@gmail.co.in");  
        emails.add("geeksTpoint@domaincom");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("javaTpoint#domain.com");
      //Regular Expression  
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  

}

}
}
