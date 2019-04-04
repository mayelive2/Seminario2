/*
 * Mayeleen Rodriguez Gomez
   cod: 2016114118
 */
package seminario2;

/**
 *
 * @author Estudiante
 */
public class Jefe extends Empleado{
    
    private float bonificacion;

    public Jefe( String nombre, float salario, int anyoAlta,float bonificacion) {
        
        super(nombre, salario, anyoAlta);
        
        //Inicializa los atributos propios
        this.bonificacion = bonificacion;
        
       
    }
    
    public String getDescripcion(){
        
        return " soy " + super.getNombre() + " y gano " + super.getSalario();
    }
    
    public float getSalario(){
        // salario+ (salario* bonificacion
        return super.getSalario()+ super.getSalario()* bonificacion;
    }
    
    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    
    
}
