/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Administrador
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;

public class DaoFlor {
    
     public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO flor (tamanhos, tamanhop, nomec, nomep, ano) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanhos());
            ps.setDouble(2, objeto.getTamanhop());
            ps.setString(3, objeto.getNomec());
            ps.setString(4, objeto.getNomep());
            ps.setInt(5, objeto.getAno());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     
      public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setTamanhos(4.2);
        objeto.setTamanhop(2.1);
        objeto.setNomec("Hyoranga");
        objeto.setNomep("Hostência");
        objeto.setAno(2018);
        
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        
    }
     
        public static boolean alterar(Flor objeto) {
        String sql = "UPDATE flor SET tamanhos=?, tamanhop=? , nomec = ?, nomep=?, ano= ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanhos());
            ps.setDouble(2, objeto.getTamanhop());
            ps.setString(3, objeto.getNomec()); 
            ps.setString(4, objeto.getNomep());
            ps.setInt(5, objeto.getAno());
            ps.setInt(6, objeto.getCodigo());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
        
         public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM flor WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
