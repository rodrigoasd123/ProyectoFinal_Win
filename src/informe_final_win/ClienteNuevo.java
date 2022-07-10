
package informe_final_win;
    
public class ClienteNuevo extends Cliente{

    public ClienteNuevo(String Nombres, String Apellidos, String dni, String distrito, String direccion, String tipocliente, 
            String tipoPlan) {
        super(Nombres, Apellidos, dni, distrito, direccion, tipocliente, tipoPlan);
    }
    
    @Override 
    public double CalcularMontoInstalacion(){ 
        return 120;
    }
    
    public double CalcularPlan(){
        if(tipoPlan.equals("100 mbps"))
           return 79;
        if(tipoPlan.equals("200 mbps"))
           return 99;
        if(tipoPlan.equals("600 mbps"))
           return 169;
        if(tipoPlan.equals("600 mbps plus"))
           return 259;
        if(tipoPlan.equals("1000 mbps"))
           return 459;
        else return 0;
    }
    
    @Override
    public double CalcularMontoTotal(){
        return CalcularMontoInstalacion()+CalcularPlan();
    }
                  
}
