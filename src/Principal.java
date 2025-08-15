import br.com.alura.conversorDeMoedas.funcoes.Menu;
import br.com.alura.conversorDeMoedas.service.ConsumoApi;

import br.com.alura.conversorDeMoedas.funcoes.Conversor;
import br.com.alura.conversorDeMoedas.service.DadosMoedas;
import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcao;
        String par;
        double valorParaConverter;
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        menu.mensagemDeBoasVindas();
        menu.menuDeOpcoes();
        opcao = scanner.nextInt();
        par = menu.escolhaMoeda(opcao);


        while (par != null){

            var consumoApi = new ConsumoApi();
            var json = consumoApi.obterDados(par);
            //System.out.println(json);

            DadosMoedas novoDadosMoedas = gson.fromJson(json, DadosMoedas.class);
            Conversor novoConversor = new Conversor(novoDadosMoedas);

            //System.out.println("Dados da moeda convertidos");
            //System.out.println(novoDadosMoedas);
            System.out.println(novoConversor);

            System.out.println("Digite o valor que deseja converter: ");
            valorParaConverter = scanner.nextDouble();
            novoConversor.converterMoeda(valorParaConverter);

            menu.menuDeOpcoes();
            opcao = scanner.nextInt();
            par = menu.escolhaMoeda(opcao);
        }
    }
}
