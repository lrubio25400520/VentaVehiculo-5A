public class Vehiculo {
    private String marca;
    private double precio;
    private String motor;
    
    public Vehiculo (String marca, double precio, String motor){
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
        
    }
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    @Override
    public  String toString(){
        return "Marca: " +this.marca +"/n"+
                "Precio: " +this.precio + "/n"+
                 "Motor: " + this.motor +"/n";
    }
}
