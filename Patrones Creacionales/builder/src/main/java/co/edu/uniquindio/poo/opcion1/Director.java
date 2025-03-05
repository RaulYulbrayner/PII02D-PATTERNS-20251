package co.edu.uniquindio.poo.opcion1;

public class Director {

    public Computador construirComputadorEscritorio(){
        return new Computador.Builder()
                .procesador("Intel i9")
                .ram(16)
                .almacenamiento("245")
                .tarjetaGrafica("RTX")
                .sistemaOperativo("Linux")
                .build();
    }

    public Computador construirComputadorOficina(){
        return new Computador.Builder()
                .procesador("Intel i3")
                .ram(2)
                .almacenamiento("125")
                .tarjetaGrafica("")
                .sistemaOperativo("Ubuntu")
                .build();
    }
}
