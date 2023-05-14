/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondealquiler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sam
 */
public class app {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // Creamos listas para guardar todos los objetos instanciados
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Automovil> automoviles = new ArrayList<Automovil>();
        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

        // Instanciamos el scanner para recibir datos
        Scanner op = new Scanner(System.in);

        // Bucle para mantener el menu abierto a menos que se quiera terminar el
        // programa
        int opc = 1;
        while (opc != 8) {

            // Opciones de menu
            System.out.println(
                    "\n-------------------------INGRESA UNA OPCION-------------------------\n\n1. Ingreso de automoviles.\n2. Ingreso de clientes.\n3. Registro de alquiler.\n4. Consultar automoviles.\n5. Consultar clientes.\n6. Consultar alquileres.\n7. Consultar alquileres por cliente.\n8. Salir.\n");
            opc = op.nextInt();
            op.nextLine();

            //Variable que usaremos despues para dar unas opciones en los siguientes casos
            int continuar = 1;

            // Switch para usar casos para las diferentes opciones
            switch (opc) {

                // Opcion Ingreso de automoviles
                case 1:

                    // Bucle while para elegir si se desea volver a la opcion o salir
                    while (continuar == 1) {
                        continuar = 0;
                        System.out.println("\n-------------------------Ingrese los datos del automovil-------------------------");
                        System.out.println("\nPlaca: ");
                        String placa = op.nextLine();

                        // Comprobamos la existencia de la placa en la lista de automoviles
                        for (int k = 0; k < automoviles.size(); k++) {

                            // Si ya existe en el la lista
                            if (placa.equals(automoviles.get(k).getPlaca())) {
                                System.out.println("\n-------------------------Este vehículo ya esta registrado-------------------------");

                                //usamos la variable continuar para hacer lo siguiente
                                System.out.println("\n1: Volver a intentar el registro. 2: Volver al menú principal.\n");
                                String continuarStr = op.nextLine();
                                continuar = Integer.parseInt(continuarStr);
                            }
                        }

                        // Si se desea continuar
                        if (continuar == 1) {
                            continue;
                        }
                        // Si se desea volver al menu principal 
                        else if (continuar == 2) {
                            break;
                        }

                        //Completamos el resto del registro
                        System.out.println("\nMarca: ");
                        String marca = op.nextLine();
                        System.out.println("\nLinea: ");
                        String linea = op.nextLine();
                        System.out.println("\nEstado (1. Disponible. 2. No disponible.): ");
                        String estadoStr = op.nextLine();
                        int estado = Integer.parseInt(estadoStr);

                        //Instanciamos un objeto con los datos ingresados
                        Automovil auto = new Automovil(marca, linea, placa, estado);

                        //Lo añadimos a la lista de automoviles
                        automoviles.add(auto);

                    }

                    break;

                // Opcion Ingreso de clientes
                case 2:

                    // Bucle while para elegir si se desea volver a la opcion o salir
                    while (continuar == 1) {
                        continuar = 0;
                        System.out.println("\n-------------------------Ingrese los datos del cliente-------------------------");
                        System.out.println("\nNUIP: ");
                        String nuipStr = op.nextLine();
                        int nuip = Integer.parseInt(nuipStr);

                        //Comprobamos que no este en la lista de clientes
                        for (int k = 0; k < clientes.size(); k++) {
                            if (nuip == clientes.get(k).getNuip()) {
                                System.out.println("\n-------------------------Este cliente ya esta registrado.-------------------------\n\nIngrese otros datos o continue con el registro de su alquiler.");
                                System.out.println("\n1: Volver a intentar el registro. 2: Volver al menú principal.\n");
                                String continuarStr = op.nextLine();
                                continuar = Integer.parseInt(continuarStr);
                            }
                        }
                        if (continuar == 1) {
                            continue;
                        } else if (continuar == 2) {
                            break;
                        }

                        //Terminamos el registro
                        System.out.println("\nNombre: ");
                        String nombre = op.nextLine();
                        System.out.println("\nNumero de contacto: ");
                        Long numero = op.nextLong();
                        op.nextLine();
                        System.out.println("\nDireccion de residencia: ");
                        String direccion = op.nextLine();

                        //Instanciamos el objeto cliente
                        Cliente cliente = new Cliente(nuip, nombre, numero, direccion);

                        //Añadimos el objeto instanciado a la lista de clientes
                        clientes.add(cliente);
                    }

                    break;

                case 3:

                    while (continuar == 1) {
                        continuar = 0;

                        //Variable para comprobar despues la existencia de un cliente o automovil
                        int registrado = 0;

                        //Si la lista automoviles no tiene objetos
                        if (automoviles.size() == 0) {
                            System.out.println("\n-------------------------No hay vehiculos registrados-------------------------\n");

                            //Si la lista clientes tampoco tiene objetos
                            if (clientes.size() == 0) {
                                System.out.println("\n-------------------------No hay clientes registrados-------------------------\n");
                                break; 
                            }                
                            //Sino 
                            else {
                               break; 
                            } 
                        } 
                        // Si solo la lista de clientes no tiene objetos
                        else if (clientes.size() == 0) {
                            System.out.println("\n-------------------------No hay clientes registrados-------------------------\n");
                            break;
                        }

                        //Ingreso de los datos de alquiler
                        System.out.println("\n-------------------------Ingrese los datos del alquiler-------------------------");
                        System.out.println("\nNUIP: ");
                        String nuipStrAl = op.nextLine();
                        int nuipAl = Integer.parseInt(nuipStrAl);
                        
                        //Comprobamos en la lista clientes que exista un cliente con ese NUIP
                        for (int k = 0; k < clientes.size(); k++) {
                            //Si encuentra una coincidencia usara la variable registrado para darle un valor mayor que cero
                            if ((nuipAl == clientes.get(k).getNuip())) {
                                registrado++;
                            }
                        }
                        //Si no hay coincidencias
                        if (registrado == 0) {
                            System.out.println("\n-------------------------Este cliente no esta registrado-------------------------\n");
                            System.out.println("\n1: Volver a intentar el registro. 2: Volver al menú principal.\n");
                            String continuarStr = op.nextLine();
                            continuar = Integer.parseInt(continuarStr);
                            break;
                        }
                        if (continuar == 1) {
                            continue;
                        } else if (continuar == 2) {
                            break;
                        }

                        System.out.println("\nPlaca: ");
                        String placaAl = op.nextLine();
                        for (int k = 0; k < automoviles.size(); k++) {
                            if (placaAl.equals(automoviles.get(k).getPlaca())) {
                                registrado++;
                                if (automoviles.get(k).getEstado() == 0) {
                                    System.out.println("-------------------------El vehiculo no esta disponible-------------------------");
                                    System.out.println("\n1: Volver a intentar el registro. 2: Volver al menú principal.\n");
                                    String continuarStr = op.nextLine();
                                    continuar = Integer.parseInt(continuarStr);
                                    break;
                                }
                            } 
                        }
                        if (registrado == 0) {
                            System.out.println("\n-------------------------Este vehiculo no esta registrado-------------------------\n");
                            System.out.println("\n1: Volver a intentar el registro. 2: Volver al menú principal.\n");
                            String continuarStr = op.nextLine();
                            continuar = Integer.parseInt(continuarStr);
                            break;
                        }
                        if (continuar == 1) {
                            continue;
                        } else if (continuar == 2) {
                            break;
                        }

                        //Termino de registro de alquiler
                        System.out.println("\nFecha del alquiler: ");
                        String fechaAl = op.nextLine();
                        System.out.println("\nTiempo en dias que durara el alquiler: ");
                        String diasStrAl = op.nextLine();
                        int dias = Integer.parseInt(diasStrAl);

                        //Instanciamos el objeto alquiler
                        Alquiler alquiler = new Alquiler(nuipAl, placaAl, fechaAl, dias);

                        //Lo añadimos a la lista de alquileres
                        alquileres.add(alquiler);

                        //Va al automovil que se alquilo dentro de la lista de automoviles y le establece un 0 en su atributo Estado para que
                        //ya no este disponible ya que se acaba de alquilar
                        for (int k = 0; k < automoviles.size(); k++) {
                            if (placaAl.equals(automoviles.get(k).getPlaca())) {
                                automoviles.get(k).setEstado(0);
                            }
                        }

                    }

                    break;

                // Mostrar lista de automoviles
                case 4:

                    //Comprueba que no este vacia la lista de automoviles
                    if (automoviles.size()!=0) {
                        System.out.println("\n-------------------------Lista de automoviles con \"Marca: Placa\"-------------------------\n");

                        //Recorre la lista mostrando los automoviles
                        for (int i = 0;i < automoviles.size();i++) {
                            Automovil it = automoviles.get(i);
                            System.out.println(it.getMarca() + ": " + it.getPlaca());
                            
                        }
                    } 
                    //Si esta vacia la lista
                    else {
                        System.out.println("\n-------------------------No hay automoviles registrados-------------------------\n");
                    }
                    
                    System.out.println("\n1. Volver al menu.\n");
                    String continuarStr=op.nextLine();
                    continuar=Integer.parseInt(continuarStr);
                    if (continuar==1) {
                        break;        
                    }
                
                //Mostrar lista de clientes
                case 5:
                    
                    //Comprueba que la lista de clientes no este vacia
                    if (0!=clientes.size()) {
                        System.out.println("\n-------------------------Lista de clientes con \"Nombre: NUIP\"-------------------------\n");
                        //Recorre la lista y los muestra
                        for (int e = 0;e < clientes.size();e++) {
                            Cliente it = clientes.get(e);
                            System.out.println(it.getNombre() + ": " + it.getNuip());
                            
                        }
                    } // Si la lista esta vacia 
                    else {
                        System.out.println("\n-------------------------No hay clientes registrados-------------------------\n");
                    }
                    
                    System.out.println("\n1. Volver al menu.\n");
                    continuarStr=op.nextLine();
                    continuar=Integer.parseInt(continuarStr);
                    if (continuar==1) {
                        break;        
                    }

                //Mostrar lista de alquileres
                case 6:

                    //Comprueba que la lista de alquileres no este vacia
                    if (0!=alquileres.size()) {
                        System.out.println("\n-------------------------Lista de alquileres con \"NUIP: Placa\"-------------------------\n");
                        //Recorrea la lista y la muestra
                        for (int a = 0;a < alquileres.size();a++) {
                            Alquiler it = alquileres.get(a);
                            System.out.println(it.getNuip() + ": " + it.getPlaca());

                        }
                    }//Si esta vacia la lista 
                    else {
                        System.out.println("\n-------------------------No hay alquileres registrados-------------------------\n");
                    }
                    
                    System.out.println("\n1. Volver al menu.\n");
                    continuarStr=op.nextLine();
                    continuar=Integer.parseInt(continuarStr);
                    if (continuar==1) {
                        break;            
                    }

                //Mostrar alquiler del cliente a partir de su NUIP
                case 7:

                    //Comprueba que la lista no este vacia
                    if (0!=alquileres.size()) {

                        //Pide el NUIP que se busca
                        System.out.println("\n-------------------------Ingresa el NUIP del cliente-------------------------\n");
                        String nuipClStr = op.nextLine();
                        int nuipCl = Integer.parseInt(nuipClStr);
                        System.out.println("\n-------------------------El/los auto/s alquilado/s a nombre del NUIP \"" + nuipCl+ "\" tiene/n la siguiente placa-------------------------\n");
                        
                        //Recorre la lista
                        for (int j = 0; j < alquileres.size(); j++) {
                            //Si haya una coincidencia imprime la placa
                            if (nuipCl == alquileres.get(j).getNuip()) {
                                System.out.println(alquileres.get(j).getPlaca());
                            }
                        }
                    }//Si la lista esta vacia 
                    else {
                        System.out.println("\n-------------------------No hay alquileres registrados-------------------------\n");
                    }
                    System.out.println("\n1. Volver al menu.\n");
                    continuarStr=op.nextLine();
                    continuar=Integer.parseInt(continuarStr);
                    if (continuar==1) {
                        break;
                    }
                    
            }

        }
        op.close();
    }

}
