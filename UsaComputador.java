import Computador;

package TrabalhosProz;
public class UsaComputador {
    public static void main(String[] args) {
        Computador c;
        c= new computador();
        c.cabinete= Cpu;
        c.fonte= SeogeUI;
        c.processador= Intel;
        c.placamae= Mainboard;
        c.gpu= UnidadeDeProcessamentoGrafico;
        c.ram= AcessorDeMemoria;
        c.rom= ReadOnlyMemory;
        c.teclado= tecladoMecanico;
        c.mouse= MouseGame;
        c.monitor= MonitorGame;
    
        System.out.println("Cabinete: " + c.cabinete);
        System.out.println("Fonte: " + c.fonte);
        System.out.println("Processador: " + c.processador);
        System.out.println("Placamae: " + c.placamae);
        System.out.println("Gpu: " + c.gpu);
        System.out.println("Ram: " + c.ram);
        System.out.println("rom: " + c.rom);
        System.out.println("Teclado: " + c.teclado);
        System.out.println("Mouse: " + c.mouse);
        System.out.println("Monitor: " + c.monitor);



    }
}
