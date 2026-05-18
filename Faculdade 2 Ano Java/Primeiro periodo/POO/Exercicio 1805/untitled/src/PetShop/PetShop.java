package PetShop;

import Animal.Animal;
import Servico.Servico;

import java.util.ArrayList;

public abstract class PetShop implements Calculavel, Relatorio {
    private ArrayList<Animal> listaAnimais;
    private ArrayList<Servico> listaServicos;

    public PetShop() {
        this.listaAnimais = new ArrayList<>();
        this.listaServicos = new ArrayList<>();
    }

    // Registra o vínculo adicionando ambos nos respectivos ArrayLists
    public void registrarAtendimento(Animal a, Servico s) {
        listaAnimais.add(a);
        listaServicos.add(s);
    }

    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    // RF05 - Iteração usando o mesmo índice para cruzar as duas listas
    @Override
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < listaServicos.size(); i++) {
            Servico s = listaServicos.get(i);
            Animal a = listaAnimais.get(i); // Recupera o animal correspondente pelo índice
            total += s.calcularCusto(a);
        }
        return total;
    }

    // RF05 - Geração do relatório cruzando os dados de forma polimórfica
    @Override
    public String gerarRelatorio() {
        if (listaServicos.isEmpty()) {
            return "Nenhum serviço registrado hoje.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO DE ATENDIMENTOS DIÁRIOS ===\n\n");

        for (int i = 0; i < listaServicos.size(); i++) {
            Servico s = listaServicos.get(i);
            Animal a = listaAnimais.get(i);

            sb.append(String.format("Animal: %s\n", a.toString()));
            sb.append(String.format("Serviço: %s (%d min)\n", s.getDescricao(), s.getDescricao()));
            sb.append(String.format("Custo: R$ %.2f\n", s.calcularCusto(a)));
            sb.append("-------------------------------------------\n");
        }

        sb.append(String.format("\nFaturamento Total do Dia: R$ %.2f", calcularTotal()));
        return sb.toString();
    }
}
