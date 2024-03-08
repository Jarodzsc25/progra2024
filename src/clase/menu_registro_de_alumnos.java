package clase;

import java.util.Scanner;

public class menu_registro_de_alumnos {
    public static void main(String[] args) {
    static void director(){
        Scanner sc =new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("REGISTRO DE ALUMNOS");
            System.out.println("-----------------------");
            System.out.println("1.- Registrar Alumno");
            System.out.println("2.- Eliminar Alumno");
            System.out.println("3.- Modificar Alumno");
            System.out.println("4.- Listar Alumno");
            System.out.println("5.- Buscar Alumno");
            System.out.println("6.- Fin");
            System.out.print(">>");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    DirectorService.crearDirector();
                    break;
                case 2:
                    DirectorService.listarDirector();
                    break;
                case 3:
                    DirectorService.editarDirector();
                    break;
                case 4:
                    DirectorService.borrarDirector();
                    break;
                case 5:
                    DirectorService.borrarDirector();
                    break;
                default:
                    break;
            }
        }while (opcion !=6 );
    }

    }

}
