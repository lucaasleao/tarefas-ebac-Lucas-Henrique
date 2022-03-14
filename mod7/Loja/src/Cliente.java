/**
 * @since 2022
 *
 * @version 2.0
 *
 * @author Lucas.Henrique
 */

public class Cliente {

   private String nome;
   private String endereco;
   private int codigo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);

    }



}
