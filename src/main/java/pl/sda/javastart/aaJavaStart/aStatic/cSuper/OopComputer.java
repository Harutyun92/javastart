package pl.sda.javastart.aaJavaStart.aStatic.cSuper;

public class OopComputer {
    public static void main(String[] args) {
        Notebook notebook=new Notebook(100,444,222);
        notebook.coolDown();
        System.out.println(notebook.getCpuTemperature()); // za pomoca metody wyzej obnizylismy o 1 stop WartoscAbsolutna nastepnie o 2
        System.out.println(notebook); // z toString wyswietla co cchemy

    }
}
