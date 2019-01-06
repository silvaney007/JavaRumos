
import Animal.Reptil.*;
import Servivo.Estimacao;
public class Main {

    public static void main (String [] args){

        Pessoa.Trabalhador trabalhador = new Pessoa.Trabalhador("ney",30,98,"M");
        Cobra cobra = new Cobra("boby",5,15,"F");
        Estimacao estimacao = new Estimacao(trabalhador,cobra);
        System.out.println(trabalhador.info());
        System.out.println(cobra.info());
        System.out.println(estimacao.toString());

    }
}
