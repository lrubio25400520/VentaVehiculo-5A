
public class cliente {
    private String rs;
    private String rfc;
    private String email;
    
    public cliente (String rs, String rfc, String email){
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
        
    }
    public String getRs(){
        return this.rs;
    }
    
    public void setRs(String rs){
        this.rs = rs;
    }
    
    @Override
    public  String toString(){
        return "Razon social: " +this.rs +"/n"+
                "RFC : " +this.rfc + "/n"+
                 "Email : " + this.email +"/n";
    }
}
