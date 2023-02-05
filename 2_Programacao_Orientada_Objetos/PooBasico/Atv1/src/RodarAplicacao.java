

public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        // O método set guarda os valores, enquanto o get os apresenta

        carro1.setCor("azul");
        carro1.setModelo("BMW série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5));
        

        Carro carro2 = new Carro("cinza", "HB20", 66 );

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(7));
    }
     
    
}
