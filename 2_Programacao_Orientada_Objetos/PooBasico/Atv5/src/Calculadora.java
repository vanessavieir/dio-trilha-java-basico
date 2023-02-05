import javax.sql.rowset.spi.SyncResolver;

class Calculadora implements OperacaoMatematica {


    // O override sobrescreve um método sobre outro
    @Override
    public void adicao(double numero1,  double numero2){
        System.out.println("Resultado da soma: " +  (numero1+numero2));
    }

    @Override
    public void subtracao(double numero1,  double numero2){
        System.out.println("Resultado da soma: " +  (numero1-numero2));
    }

    @Override
    public void multiplicacao(double numero1,  double numero2){
        System.out.println("Resultado da soma: " +  (numero1*numero2));
    }

    @Override
    public void divisao(double numero1,  double numero2){
        System.out.println("Resultado da soma: " +  (numero1/numero2));
    }

    
}
