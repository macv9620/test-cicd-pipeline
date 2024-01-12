package macv.cursos;

public class Main {
    public static void main(String[] args) {
        String nombre = System.getenv("VAR_WF_NOMBRE_PERSONA");
        String ciudad = System.getenv("VAR_GITHUB_CIUDAD_PROCEDENCIA");

        System.out.println("Hola soy " + nombre + " y vivo en " + ciudad);
    }
}