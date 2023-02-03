
public class Persona {
  
  public String nombre;
  public String apellidos;
  public int edad;
  
  public Persona(String nombre, String apellidos, int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public void cumpleanios() {
    edad++;
    System.out.print(edad);
  }
  
  public void datosPersona() {
    System.out.print(edad);
    System.out.print(nombre);
    System.out.print(apellidos);
  }

}
