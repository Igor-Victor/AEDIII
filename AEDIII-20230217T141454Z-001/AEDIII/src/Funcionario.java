public class Funcionario {
    private String nome;
    private double salario;
    private int posicao;

    private Funcionario funcionarios[];

    public static void exibeOpcoes() {
        System.out.println("O que você que fazer?");
        System.out.println("1 - Cadastrar funcionários");
        System.out.println("2 - Listar os dados dos funcionários");
        System.out.println("3 - Buscar funcionário");
        System.out.println("4 - Verificar se funcionário existe");
        System.out.println("5 - Buscar funcionário com a posição inválida");
        System.out.println("6 - Listar funcionarios em ordem alfabética");
        System.out.println("7 - Remover registro de funcionário");
        System.out.println("8 - Tentar remover registro não existente de funcionário");
        System.out.println("Digite '9' para sair");
        System.out.println(">>> ");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(int tamanho) {
        this.funcionarios = new Funcionario[tamanho];
        this.posicao = 0;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void adiciona(Funcionario func) {
        this.funcionarios[posicao] = func;
        this.posicao++;
    }

    public void busca(String funcBusca) {
        for(int i = 0; i < this.posicao; i++) {
            if(funcionarios[i].getNome().equalsIgnoreCase(funcBusca)) {
                System.out.println("Funcionário encontrado na posição [ " + i + " ] do vetor");


            } else {
                System.out.println("Funcionário não encontrado!");
            }
        }
    }

    private boolean posicaoOcupada(int posicao) {
        if(posicao >= 0 && posicao < funcionarios.length) {
            if(funcionarios[posicao] != null) {
                return true;
            }
        }
        return false;
    }

    public void remove(int posicao) {
        int tamanhoLista = funcionarios.length;
        int tamanhoAtual = funcionarios.length;
        if(posicao >= 0 && posicao < tamanhoLista) {
            for(int i = posicao; i < tamanhoLista-1; i++) {
                funcionarios[i] = funcionarios[i + 1];
            }
            tamanhoLista--;
        }
    }

    public boolean contem(String nome) {
        boolean situacao = false;
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                situacao = true;
            }
        }
        return situacao;
    }

    public int tamanho() {
        int cont = 0;
        for(int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null);
            cont++;
        }
        return cont;
    }

    public void imprimeLista() {
        for(int i = 0; i < this.posicao; i++) {
            System.out.println("Nome: " + funcionarios[i].nome + "\nSalário: " + funcionarios[i].salario);
        }
    }

    public void ordenaPorNome() {
        Funcionario aux;
        for(int i = 0; i < funcionarios.length; i++) {
            for(int j = 0; j < i; j++) {
                if(funcionarios[i].getNome().compareToIgnoreCase(funcionarios[j].getNome()) > 0) {
                    aux = funcionarios[i];
                    funcionarios[i] = funcionarios[j];
                    funcionarios[j] = aux;
                }
            }
        }
    }


}