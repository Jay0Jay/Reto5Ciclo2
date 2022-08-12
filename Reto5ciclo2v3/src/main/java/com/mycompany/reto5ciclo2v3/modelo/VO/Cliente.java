
package com.mycompany.reto5ciclo2v3.modelo.VO;


public class Cliente {
    
    private  int id_compra;
    private String Constructora ;
    private String Banco;  

    public Cliente() {
    }

    public Cliente(int id_compra, String Constructora, String Banco) {
        this.id_compra = id_compra;
        this.Constructora = Constructora;
        this.Banco = Banco;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Contructora) {
        this.Constructora = Contructora;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_compra=" + id_compra + ", Contructora=" + Constructora + ", Banco=" + Banco + '}';
    }   
}
