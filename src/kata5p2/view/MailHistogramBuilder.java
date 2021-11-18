package kata5p2.view;

import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import java.util.List;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<String> mailList){
        Histogram<String> histogram = new Histogram<>();
        
        for (String mail : mailList) {
            histogram.increment(mail.substring(mail.lastIndexOf("@")+1));
        }
        
        return histogram;
    } 
    
}
