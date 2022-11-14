import javax.swing.event.MouseInputAdapter;

//depending upon abstraction

class DIP{ 
    public static void main(String[] args){
        MotorDiesel hondaPX90123 = new MotorDiesel(); 
        VeiculoMotorizado minhaHonda = new Moto("Honda","XrNs232312",103223, hondaPX90123);
        System.out.println(minhaHonda.ligar());
        System.out.println(minhaHonda.desligar());
        
        MotorEletrico hondaLIZRABIAV10 = new MotorEletrico();
        VeiculoMotorizado hondaDoVizinho = new Moto("Honda","NXLE",123233232, hondaLIZRABIAV10);
        System.out.println(hondaDoVizinho.ligar());
        System.out.println(hondaDoVizinho.desligar());
        System.out.println(hondaDoVizinho.verificarEstado());
    }
}
class Carro extends VeiculoMotorizado{
    Carro(String marca, String modelo, double valor, MotorControle motor){
        super(marca, modelo, valor, motor);
    }
}
class Moto extends VeiculoMotorizado{
    Moto(String marca, String modelo, double valor, MotorControle motor){
        super(marca, modelo, valor, motor);
    }
}



abstract class Veiculo{
    String marca;
    String modelo;
    double valor;
    public Veiculo(String marca, String modelo, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }
}

interface MotorControle{
    boolean estado;
    public String ligar();
    public String desligar();
    public String verificarEstado();
}



abstract class VeiculoMotorizado extends Veiculo{
    MotorControle motor;
    VeiculoMotorizado(String marca, String modelo, double valor, MotorControle motor) {
        super(marca, modelo, valor);
        this.motor = motor; 
    }
    public String ligar(){return this.motor.ligar();}
    public String desligar(){return this.motor.desligar();}
    public String verificarEstado(){return this.motor.verificarEstado();}

}


class MotorDiesel implements MotorControle{
    boolean estado;
    public String ligar(){
        estado = true; 
        return "Ligando Diesel";
    }
    public String desligar(){
        estado = false;
        return "Desligando Diesel";
    }
    public String  verificarEstado() {
        return estado!=false?("Diesel Ligado"):("Diesel Desligado");
    }
}

class MotorGasolina implements MotorControle{
    boolean estado;
    public String ligar(){
        estado = true;
        return "Ligando Gasolina";
    }
    public String desligar(){
        estado = false;
        return "Desligando Gasolina";
    }
    public String verificarEstado() {
        return estado!=false?("Gasolina Ligado"):("Gasolina Desligado");
    }
}

class MotorEletrico implements MotorControle{
    boolean estado;
    public String desligar(){
        estado = false;
        return "Desligando Eletrico";
    }
    
    public String ligar(){
        estado = true;
        return "Ligando Eletrico";
    }
    public String verificarEstado(){
        return estado!=false?("Eletrico Ligado"):("Eletrico Desligado");
    }
    
}


