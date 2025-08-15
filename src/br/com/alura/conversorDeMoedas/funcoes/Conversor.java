package br.com.alura.conversorDeMoedas.service;

public class Conversor {
    //private String data;
    private String moedaBase;
    private String moedaAlvo;
    private double cotacao;


    public Conversor(DadosMoedas meusDadosMoedas) {
        //this.data = meusDadosMoedas.time_last_update_utc();
        this.moedaBase = meusDadosMoedas.base_code();
        this.moedaAlvo = meusDadosMoedas.target_code();
        this.cotacao = meusDadosMoedas.conversion_rate();
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaAlvo() {
        return moedaAlvo;
    }

    public double getCotacao() {
        return cotacao;
    }

    @Override
    public String toString() {
        return "Cotação: " + moedaBase + " em " + moedaAlvo + " hoje é: " + cotacao;
    }
}
