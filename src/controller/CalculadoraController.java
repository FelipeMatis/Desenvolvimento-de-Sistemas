package controller;
import model.Calculadora;
import view.CalculadoraView;

public class CalculadoraController {

    private Calculadora model;
    private CalculadoraView view;

    public CalculadoraController(Calculadora model, CalculadoraView view){
        this.model = model;
        this.view = view;
    }
    public void somar(int a, int b){
        int resultadoSoma = model.somar(a,b);
        view.mostrarResultadoSoma(resultadoSoma);
    }

    public void subtrair(int a, int b){
        int resultadoSubtrair = model.subtrair(a,b);
        view.mostrarResultadoSubtracao(resultadoSubtrair);
    }

    public void dividir(int a, int b){
        int resultadoDividir = model.dividir(a,b);
        view.mostrarResultadoDivisao(resultadoDividir);
    }

    public void multiplicar(int a, int b){
        int resultadoMultiplicar = model.multiplicar(a,b);
        view.mostrarResultadoMultiplicacao(resultadoMultiplicar);
    }


}
