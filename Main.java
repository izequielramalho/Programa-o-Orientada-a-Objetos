package estudos.Izequiel.orientadaObjetos;

public class Main {

    public static void main(String[] args) {

        Carro carro2 = new Carro("Preto", "Auddi A5", 66);

        carro2.setCor("Branco");

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotal(6.46));


    }

}
