package projeto.vendas.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projeto.vendas.model.Produto;

public class DaoProduto {

    private Connection conn;

    public DaoProduto(Connection conn) {
        this.conn = conn;
    }

    public ArrayList<Produto> ListarProdutos() {
        Produto produto = null;
        ArrayList<Produto> lista = new ArrayList();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM produto");
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                produto = new Produto(  rs.getInt("CODIGO"),
                                        rs.getString("DESCRICAO"),
                                        rs.getInt("qtdEstoque"),
                                        rs.getFloat("valorUnitario"));
                System.out.println(produto);
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (lista);
    }

}
