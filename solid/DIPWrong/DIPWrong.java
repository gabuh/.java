package Wrong;

class DIPWrong{
    public static void main(String[] args) {
        Moto minhaHonda = new Moto("Honda","XrNs232312",103223, new MotorDiesel());
        System.out.println(minhaHonda.ligarMotorDiesel());
        System.out.println(minhaHonda.desligarMotorDiesel());

        Moto hondaDoVizinho = new Moto("Honda","NXLE",123233232, new MotorEletrico());
        
        System.out.println(hondaDoVizinho.ligarMotorEletrico());
        System.out.println(hondaDoVizinho.desligarMotorEletrico());
    }    
}

class Moto extends VeiculoMotorizado{ //Alto nivel
    Moto(String marca, String modelo, double valor, MotorEletrico motor){
        super(marca, modelo, valor, motor);
    }
    Moto(String marca, String modelo, double valor, MotorDiesel motor){
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



abstract class VeiculoMotorizado extends Veiculo{ //Alto nivel
    MotorDiesel motorDiesel;
    MotorEletrico motorEletrico;

    VeiculoMotorizado(String marca, String modelo, double valor, MotorEletrico motorEletrico) {
        super(marca, modelo, valor);
        this.motorEletrico = motorEletrico;
    }
    VeiculoMotorizado(String marca, String modelo, double valor, MotorDiesel motorDiesel) {
        super(marca, modelo, valor);
        this.motorDiesel = motorDiesel;
    }
    
    
    public String ligarMotorDiesel(){ return motorDiesel.ligar(); }

    public String desligarMotorDiesel(){ return motorDiesel.desligar(); }

    public String ligarMotorEletrico(){ return motorEletrico.ligar(); }

    public String desligarMotorEletrico(){ return motorEletrico.desligar(); }
}


class MotorDiesel{ //Baixo nivel
    boolean estado;
    public String ligar(){
        this.estado = true;
        return "Ligando Diesel"; 
    }
    public String desligar(){
        this.estado = false;
        return "Desligando Diesel"; 
    }
}

class MotorEletrico{ //Baixo nivel
    boolean estado;
    public String ligar(){
        this.estado = true;
        return "Ligando Eletrico"; 
    }
    public String desligar(){
        this.estado = false;
        return "Desligando Eletrico"; 
    }
}

// class MotorDiesel{ //Baixo nivel
//     boolean estado;
//     public void setEstado(boolean estado) {
//         this.estado = estado;
//     }
// }

// class MotorEletrico{
//     boolean estado;
//     public void setEstado(boolean estado) {
//        this.estado = estado;
//     }
// }


