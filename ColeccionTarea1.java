/*
Componentes Utilizados en el proyecto Autonomo
 */
package colecciontarea1;

import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {
    public static void main(String[] args) {
        
    System.out.println("\t\tUniversidad de las Fuerzas Armadas Espe - Sede Latacunga");
    System.out.println("Materia: Programacion");
    System.out.println("NRC: 7450");
    System.out.println("Docente: Ing. Luis Guerra");
    System.out.println("Nombre: Ortiz Hector\n");
                                                                             //el tipo de ListaComponentesProyecto_MonitorBateria 
Collection ListaComponentesProyecto_MonitorBateria = new ArrayList<String>();// es collection
        
ListaComponentesProyecto_MonitorBateria.add("15 Resistencias de diferents ohmios");
ListaComponentesProyecto_MonitorBateria.add("\n\tCables");
ListaComponentesProyecto_MonitorBateria.add("\n\tProtoboard");
ListaComponentesProyecto_MonitorBateria.add("\n\t1 trimmer de 250 ohmios");
ListaComponentesProyecto_MonitorBateria.add("\n\t1 trimmer de 50 kiloohmios");
ListaComponentesProyecto_MonitorBateria.add("\n\t4 condensadores eletroliticos de distinta capacitancia");
ListaComponentesProyecto_MonitorBateria.add("\n\t3 diodos 1N4148");
ListaComponentesProyecto_MonitorBateria.add("\n\t3 leds (Amarillo, Verde, Rojo");
ListaComponentesProyecto_MonitorBateria.add("\n\t1 regulador 7805");
ListaComponentesProyecto_MonitorBateria.add("\n\t1 circuito integrado LM324");
ListaComponentesProyecto_MonitorBateria.add("\n\t1 base para el integrado LM324");
ListaComponentesProyecto_MonitorBateria.add("\n\t1 conector de tornillo de 3 pines \n");
ListaComponentesProyecto_MonitorBateria.add("Potenciometros");
        
System.out.println("Numero de elementos antes de ser "
        + "eliminados: \n\t" + ListaComponentesProyecto_MonitorBateria.size());
System.out.println("LOS COMPONENTES DEL PROYECTO SON: \n");
System.out.println(ListaComponentesProyecto_MonitorBateria.toString());
        
ListaComponentesProyecto_MonitorBateria.remove("15 Resistencias de diferents ohmios");
ListaComponentesProyecto_MonitorBateria.remove("\n\t1 trimmer de 250 ohmios");
ListaComponentesProyecto_MonitorBateria.remove("\n\t1 trimmer de 50 kiloohmios");
ListaComponentesProyecto_MonitorBateria.remove("\n\t4 condensadores eletroliticos de distinta capacitancia");
ListaComponentesProyecto_MonitorBateria.remove("\n\t3 diodos 1N4148");
ListaComponentesProyecto_MonitorBateria.remove("\n\t3 leds (Amarillo, Verde, Rojo");
ListaComponentesProyecto_MonitorBateria.remove("\n\t1 regulador 7805");
ListaComponentesProyecto_MonitorBateria.remove("\n\t1 circuito integrado LM324");
ListaComponentesProyecto_MonitorBateria.remove("\n\t1 base para el integrado LM324");
ListaComponentesProyecto_MonitorBateria.remove("\n\tCables");
ListaComponentesProyecto_MonitorBateria.remove("\n\tProtoboard");
ListaComponentesProyecto_MonitorBateria.remove("\n\t1 conector de tornillo de 3 pines \n");
        
 System.out.println("\nNumero de elementos despues de ser eliminados: "+ ListaComponentesProyecto_MonitorBateria.size());
        
        System.out.println("\nLOS COMPONENTES DEL PROYECTO QUE NOS QUEDAN SON: \n");
        System.out.println(ListaComponentesProyecto_MonitorBateria.toString());} 
}
        
        
    
    

