package co.com.mentoria.programacionfuncional;
import java.util.List;
import java.util.stream.Collectors;
public class Calculadora {
    private final List<Double> b;
    private final List<Double> a;
    private Long longitudResultado;
    public Calculadora(List<Double> a, List<Double> b) {
        this.a = a;
        this.b = b;
        System.out.println("ListaNumeros A: " + this.a);
        System.out.println("ListaNumeros B: " + this.b);
        cantidadDeElementosDelResultado();
    }
    public Long cantidadDeElementosDelResultado() {
        Long cantidadElementosA = a.stream().count();
        Long cantidadElementosB = b.stream().count();
        if (cantidadElementosA > cantidadElementosB) {
            return this.longitudResultado = cantidadElementosB;
        }
        return this.longitudResultado = cantidadElementosA;
    }
    public List<Double> sumar() {
        if (this.a.stream().count() == this.longitudResultado) {
            List<Double> suma = this.a.stream()
                    .map(elementA -> elementA + this.b.get((this.a.indexOf(elementA))))
                    .collect(Collectors.toList());
            return suma;
        }
        List<Double> suma = this.b.stream()
                .map(elementB -> elementB + this.a.get((this.b.indexOf(elementB))))
                .collect(Collectors.toList());
        return suma;
    }
    public List<Double> restar() {
        if (this.a.stream().count() == this.longitudResultado) {
            List<Double> resta = this.a.stream()
                    .map(elementA -> elementA - this.b.get((this.a.indexOf(elementA))))
                    .collect(Collectors.toList());
            return resta;
        }
        List<Double> resta = this.b.stream()
                .map(elementB -> -elementB + this.a.get((this.b.indexOf(elementB))))
                .collect(Collectors.toList());
        return resta;
    }
    public List<Double> multiplicar() {
        if (this.a.stream().count() == this.longitudResultado) {
            List<Double> multiplicacion = this.a.stream()
                    .map(elementA -> elementA * this.b.get((this.a.indexOf(elementA))))
                    .collect(Collectors.toList());
            return multiplicacion;
        }
        List<Double> multiplicacion = this.b.stream()
                .map(elementB -> elementB * this.a.get((this.b.indexOf(elementB))))
                .collect(Collectors.toList());
        return multiplicacion;
    }
    public List<Double> dividir() {
        if (this.a.stream().count() == this.longitudResultado) {
            List<Double> division = this.a.stream()
                    .map(elementA -> elementA / this.b.get((this.a.indexOf(elementA))))
                    .collect(Collectors.toList());
            return division;
        }
        List<Double> division = this.b.stream()
                .map(elementB -> this.a.get((this.b.indexOf(elementB))) / elementB)
                .collect(Collectors.toList());
        return division;
    }
    public List<Double> modulo() {
        if (this.a.stream().count() == this.longitudResultado) {
            List<Double> modulo = this.a.stream()
                    .map(elementA -> elementA % this.b.get((this.a.indexOf(elementA))))
                    .collect(Collectors.toList());
            return modulo;
        }
        List<Double> modulo = this.b.stream()
                .map(elementB -> this.a.get((this.b.indexOf(elementB))) % elementB)
                .collect(Collectors.toList());
        return modulo;
    }
    public void usandoReduce(){
        Double newA = this.a.stream()
                .reduce((acumulador, numero) -> {
                    return acumulador + numero;
                })
                .get();
        Double newB = this.b.stream()
                .reduce((acumulador, numero) -> {
                    return acumulador + numero;
                })
                .get();
        System.out.println("El resultado de sumar todos los elementos de A es: "+newA);
        System.out.println("El resultado de sumar todos los elementos de B es: "+newB);
    }
}
