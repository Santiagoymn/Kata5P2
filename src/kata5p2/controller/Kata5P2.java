package kata5p2.controller;

import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReaderBD;

public class Kata5P2 {
    
    private static List<String> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args) {
        execute();
    }
    
    private static void execute() {
        input();
        process();
        output();
    }
    
    private static void input() {
        mailList = MailListReaderBD.read();
    }
    
    private static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        new HistogramDisplay(histogram).execute(); 
    }
}