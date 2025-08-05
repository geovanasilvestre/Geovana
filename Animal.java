public class Animal { 
    // Atributos da classe
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    
    //Método para imprimir os atributos do animal
    public void printStatus(){
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Número de patas: " +numeroDePatas);
        System.out.println("Tem rabo? " +temRabo);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo de alimentação: " + tipoAlimentacao);
        System.out.println("Genero: " + genero);
        System.out.println("------------------------------------------------");
    }
    
    //Método principal main
    public static void main(String[] args){
        //Criando o primeiro animal
        Animal cachorro = new Animal();
        cachorro.nomeAnimal = "Euclides";
        cachorro.numeroDePatas = 4;
        cachorro.temRabo = true;
        cachorro.cor = "Tigrado";
        cachorro.idade = 4;
        cachorro.tipoAlimentacao = "Ração";
        cachorro.genero = 'M';
        
        //Criando o segundo animal
        Animal gato = new Animal();
        gato.nomeAnimal = "julianagio";
        gato.numeroDePatas = 3;
        gato.temRabo= true;
        gato.cor = "rosa";
        gato.idade = 6;
        gato.tipoAlimentacao = "Peixe";
        gato.genero = 'F';
        
        //Criando o terceiro animal
        Animal cavalo = new Animal();
        cavalo.nomeAnimal = "trovao";
        cavalo.numeroDePatas = 4;
        cavalo.temRabo = true;
        cavalo.cor = "preto";
        cavalo.idade = 5;
        cavalo.tipoAlimentacao = "Feno";
        cavalo.genero = 'M';
        //Chamando os métodos para imprimir os atributos
        cachorro.printStatus();
        gato.printStatus();
        cavalo.printStatus();
    
    }
    
}