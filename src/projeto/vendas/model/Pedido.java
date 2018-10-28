
package projeto.vendas.model;

import java.sql.Date;



public class Pedido {
    private int codigo;
    private String clienteCod;
    private int vendedorCod;
    private String dtPedido;
    private float total;
    private int Situcao;

    public Pedido(int codigo, String clienteCod, int vendedorCod, String dtPedido, float total, int Situcao) {
        this.codigo = codigo;
        this.clienteCod = clienteCod;
        this.vendedorCod = vendedorCod;
        this.dtPedido = dtPedido;
        this.total = total;
        this.Situcao = Situcao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClienteCod() {
        return clienteCod;
    }

    public void setClienteCod(String clienteCod) {
        this.clienteCod = clienteCod;
    }

    public int getVendedorCod() {
        return vendedorCod;
    }

    public void setVendedorCod(int vendedorCod) {
        this.vendedorCod = vendedorCod;
    }

    public String getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(String dtPedido) {
        this.dtPedido = dtPedido;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getSitucao() {
        return Situcao;
    }

    public void setSitucao(int Situcao) {
        this.Situcao = Situcao;
    }

  


    
    
}
