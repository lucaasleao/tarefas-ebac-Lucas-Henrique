public class PrimeiraClasse {
    public static void main (String args[] ){
        Cliente cliente = new Cliente();
        System.out.println("Olá Lucas");
        cliente.cadastrarEndereco("Rua Drummond");
        System.out.println(cliente.getEndereco());
        cliente.setCodigo(20);
        System.out.println(cliente.getCodigo());




}
}
