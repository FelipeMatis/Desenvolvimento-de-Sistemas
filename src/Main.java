import model.Calculadora;
import view.CalculadoraView;
import controller.CalculadoraController;

public class Main {
    public static void main(String[] args){
        Calculadora model = new Calculadora();
        CalculadoraView view = new CalculadoraView();

        CalculadoraController controller =
                new CalculadoraController(model, view);

        controller.somar(5,3);
        controller.dividir(10,2);
        controller.subtrair(5,1);
        controller.multiplicar(10,2);
    }
}
