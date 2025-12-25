import java.util.ArrayList;
import java.util.Scanner;

public class aplicacion {

    public static void main(String[] args){
        boolean variable = true;
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> listaTareas = new ArrayList<>();
        ArrayList<String> listaEstados = new ArrayList<>();

        while (variable == true){

            System.out.print("Inserta la tarea que tienes pendiente: ");
            String tarea = entrada.nextLine();

            if (tarea.toLowerCase().equals("stop")){
                variable = false;
                System.out.println("Cerrando aplicacion");

            }else if(tarea.toLowerCase().equals("show")){
                System.out.println("Lista de tareas: ");
                for (int i = 0; i < listaTareas.size(); i++){
                    System.out.println(i + "." + listaTareas.get(i) + " - " +  listaEstados.get(i));
                }

            }else if(tarea.toLowerCase().equals("check")){
                System.out.println("Que numero de tarea has completado: ");
                int pregunta = entrada.nextInt();
                entrada.nextLine();
                if (pregunta >= 0 && pregunta < listaTareas.size()){
                    listaEstados.set(pregunta, "Completada");
                    System.out.println("Tarea numero " + pregunta + " completada");
                }else{
                    System.out.println("Error, la tarea numero " + pregunta + " no existe");
                    continue;
                }
                
            }else{
                listaTareas.add(tarea);
                listaEstados.add("Pendiente");
                System.out.println("Tarea guardada");
            }
            
        }
        entrada.close();
    }
}