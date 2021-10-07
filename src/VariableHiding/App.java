package VariableHiding;

public class App {
    public static void main(String[] args) {
        Parrent child = new Child();
        child.name = "Eko";
        child.doIt();

        /*
        Ketika method doit di akses, maka yang keluar akan tetap doit form child. karena hakikatnya parent
        yang di samakan dengan child. bukan child yang di samakan dengan parrent
         */
        Parrent parrent = (Parrent) child;
        parrent.doIt();
    }
}
