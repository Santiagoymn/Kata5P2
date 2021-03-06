package kata5p2.model;


public class Mail {
    
    private final String fileName;
    
    public Mail(String mail){
        this.fileName = mail;
    }
    
    public String getDomain(){
        return this.fileName.substring(this.fileName.indexOf("@") + 1);
    }
    
    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }    
}
