package org.example.Deck;

import java.util.Arrays;

public class Carta {
    String nome;
    String tipoDeCriatura;
    String custoDeMana;
    String descriao;
    int poder;
    int resistencia;
    String ilustrador;
    String dataDeLancamento;
    String nomeDoDeck;
    int numeroDoDeck;
    String raridadeDoDeck;
    String lingua;
    String[] prints;
    public Carta(){}

    public Carta(String nome, String tipoDeCriatura, String custoDeMana, String descriao, int poder, int resistencia, String ilustrador, String dataDeLancamento, String nomeDoDeck, int numeroDoDeck, String raridadeDoDeck, String lingua, String[] prints) {
        this.nome = nome;
        this.tipoDeCriatura = tipoDeCriatura;
        this.custoDeMana = custoDeMana;
        this.descriao = descriao;
        this.poder = poder;
        this.resistencia = resistencia;
        this.ilustrador = ilustrador;
        this.dataDeLancamento = dataDeLancamento;
        this.nomeDoDeck = nomeDoDeck;
        this.numeroDoDeck = numeroDoDeck;
        this.raridadeDoDeck = raridadeDoDeck;
        this.lingua = lingua;
        this.prints = prints;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeCriatura() {
        return tipoDeCriatura;
    }

    public void setTipoDeCriatura(String tipoDeCriatura) {
        this.tipoDeCriatura = tipoDeCriatura;
    }

    public String getCustoDeMana() {
        return custoDeMana;
    }

    public void setCustoDeMana(String custoDeMana) {
        this.custoDeMana = custoDeMana;
    }

    public String getDescriao() {
        return descriao;
    }

    public void setDescriao(String descriao) {
        this.descriao = descriao;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public String getNomeDoDeck() {
        return nomeDoDeck;
    }

    public void setNomeDoDeck(String nomeDoDeck) {
        this.nomeDoDeck = nomeDoDeck;
    }

    public int getNumeroDoDeck() {
        return numeroDoDeck;
    }

    public void setNumeroDoDeck(int numeroDoDeck) {
        this.numeroDoDeck = numeroDoDeck;
    }

    public String getRaridadeDoDeck() {
        return raridadeDoDeck;
    }

    public void setRaridadeDoDeck(String raridadeDoDeck) {
        this.raridadeDoDeck = raridadeDoDeck;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public String[] getPrints() {
        return prints;
    }

    public void setPrints(String[] prints) {
        this.prints = prints;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nome='" + nome + '\'' +
                ", tipoDeCriatura='" + tipoDeCriatura + '\'' +
                ", custoDeMana='" + custoDeMana + '\'' +
                ", descriao='" + descriao + '\'' +
                ", poder=" + poder +
                ", resistencia=" + resistencia +
                ", ilustrador='" + ilustrador + '\'' +
                ", dataDeLancamento='" + dataDeLancamento + '\'' +
                ", nomeDoDeck='" + nomeDoDeck + '\'' +
                ", numeroDoDeck=" + numeroDoDeck +
                ", raridadeDoDeck='" + raridadeDoDeck + '\'' +
                ", lingua='" + lingua + '\'' +
                ", prints=" + Arrays.toString(prints) +
                '}';
    }

    public void VisualizarIlustrador(){System.out.println("Ilustrated by " + ilustrador);}
    public void VisualizarDeck(){System.out.println("#" + numeroDoDeck + " . " + raridadeDoDeck + " . " + lingua);}
    public void VisualizarPrints(){System.out.println("Fotos");}
}