package Alura.Aplication.API.Endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String uf;
    private String cep;
    private String numero;
    private String cidade;
    private String complemento;

    public Endereco(DadosEndereço dados) {
        this.logradouro= dados.logradouro();
        this.bairro= dados.bairro();
        this.cep= dados.cep();
        this.uf= dados.uf();
        this.cidade= dados.cidade();
        this.numero= dados.numero();
        this.complemento= dados.complemento();


    }

    public void atualizarInformacoes(DadosEndereço dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.logradouro() != null) {
            this.bairro = dados.logradouro();
        }
        if (dados.logradouro() != null) {
            this.cidade = dados.cidade();
        }
        if (dados.logradouro() != null) {
            this.cep = dados.cep();
        }
        if (dados.logradouro() != null) {
            this.uf = dados.uf();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
        if (dados.numero() != null) {
            this.numero = dados.numero();
        }
    }
}
