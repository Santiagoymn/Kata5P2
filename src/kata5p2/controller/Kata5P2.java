package kata5p2.controller;

import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.HistogramDisplay;
import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import java.util.List;
import kata5p2.view.MailListReader;

public class Kata5P2 {
    
    public static Histogram<String> histogram;
    public static List<Mail> mailList;

    public static void main(String[] args) {
        
        execute();
    
    }
    
    public static void input(){
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }
    
    public static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public static void output(){
        new HistogramDisplay(histogram).execute(); 
    }
    
    public static void execute(){
        input();
        process();
        output();
    }
}
