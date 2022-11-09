/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Administrador
 */

public class LlenarCombos {
    conectar cc= new conectar();
    Connection cn = cc.conexion();    
    //Variables variables = new Variables();
    LlenarCombos llenar;
    
    public void llenarCombos(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,
        String sql, String campo1, String campo2, javax.swing.JComboBox combo){
        int x=0;
        modelo.removeAllElements();
        array.clear();
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs != null){
                while (rs.next()){
                    modelo.addElement(""+rs.getString(campo2));
                    //array.add(""+con.resultado.getString("id_Ubigeo"));
                    array.add(x, ""+rs.getString(campo1));
                    combo.setModel(modelo);
                    //System.out.println(array.get(x));
                    x++;
                }
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e);
        }/*finally{
                try{
                    conexion.cerrarConexion();
                }catch(Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,e);
                }
        }*/
          
    }
    
    
       
    public void llenarListas(java.util.ArrayList array, javax.swing.DefaultListModel modelo,
            String sql, String campo1, String campo2, javax.swing.JList lst){
        int x=0;
        modelo.removeAllElements();
        array.clear();
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs != null){
                while (rs.next()){
                    modelo.addElement(""+rs.getString(campo2));
                    //array.add(""+con.resultado.getString("id_Ubigeo"));
                    array.add(x, ""+rs.getString(campo1));
                    lst.setModel(modelo);
                    //System.out.println(array.get(x));
                    x++;
                }
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e);
        }/*finally{
                try{
                    conexion.cerrarConexion();
                }catch(Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,e);
                }
        }*/
    }
    
    public void CargaCboExp(java.util.ArrayList array1,java.util.ArrayList array2,
            java.util.ArrayList array3,java.util.ArrayList array4,
            javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox combo){
        int x=0;
        
        String sql = "select id_material, desc_material,id_undmed,"
              + " pusoles_material,peso_material From  base_material "
              + " where id_fammat = '010' and stock_material > 0";
        modelo.removeAllElements();
        array1.clear();
        array2.clear();
        array3.clear();
        array4.clear();
        combo.removeAllItems();
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs != null){
                while (rs.next()){
                    modelo.addElement(""+rs.getString("desc_material"));
                    array1.add(x, ""+rs.getString("id_material"));
                    array2.add(x, ""+rs.getString("id_undmed"));
                    array3.add(x, ""+rs.getString("pusoles_material"));
                    array4.add(x, ""+rs.getString("peso_material"));
                    combo.setModel(modelo);
                    //System.out.println(array.get(x));
                    x++;
                }
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e);
        }/*finally{
                try{
                    conexion.cerrarConexion();
                }catch(Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,e);
                }
        }*/
        
    }
    
    public void CargaCboSost(java.util.ArrayList array1,java.util.ArrayList array2,
            java.util.ArrayList array3, javax.swing.DefaultComboBoxModel modelo,
            javax.swing.JComboBox combo, int condicion){
        int x=0;
        
        String sql = "select id_sost, desc_sost, id_undmed, pu_sost from base_sost "
              + " where id_tiposost='"+condicion+"' and est_sost=1";
        modelo.removeAllElements();
        array1.clear();
        array2.clear();
        array3.clear();
        combo.removeAllItems();
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs != null){
                while (rs.next()){
                    modelo.addElement(""+rs.getString("desc_sost"));
                    array1.add(x, ""+rs.getString("id_sost"));
                    array2.add(x, ""+rs.getString("id_undmed"));
                    array3.add(x, ""+rs.getString("pu_sost"));
                    combo.setModel(modelo);
                    //System.out.println(array.get(x));
                    x++;
                }
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e);
        }/*finally{
                try{
                    conexion.cerrarConexion();
                }catch(Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,e);
                }
        }*/
        
    }
    
    public void CargarComboDobleArray (java.util.ArrayList array1, java.util.ArrayList array2, javax.swing.DefaultComboBoxModel modelocombo,
        String sql, String campo1, String campo2, String campo3, javax.swing.JComboBox combo){
        int x=0;
        
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs != null){
                while (rs.next()){
                    modelocombo.addElement(""+rs.getString(campo2));
                    //array.add(""+con.resultado.getString("id_Ubigeo"));
                    array1.add(x, ""+rs.getString(campo1));
                    array2.add(x,""+rs.getString(campo3));
                    combo.setModel(modelocombo);
                    //System.out.println(array.get(x));
                    x++;
                }
            }else{
                combo.setEnabled(false);
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e);
        }/*finally{
                try{
                    conexion.cerrarConexion();
                }catch(Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,e);
                }
        }*/
    }
    
    public void CargarComboTripleArray (java.util.ArrayList array1, java.util.ArrayList array2,java.util.ArrayList array3, 
            javax.swing.DefaultComboBoxModel modelocombo,
        String sql, String campo1, String campo2, String campo3,String campo4, javax.swing.JComboBox combo){
        int x=0;
        
        try{
            PreparedStatement pst=cn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            if(rs != null){
                while (rs.next()){
                    modelocombo.addElement(""+rs.getString(campo2));
                    //array.add(""+con.resultado.getString("id_Ubigeo"));
                    array1.add(x, ""+rs.getString(campo1));
                    array2.add(x,""+rs.getString(campo3));
                    array3.add(x,""+rs.getString(campo4));
                    combo.setModel(modelocombo);
                    //System.out.println(array.get(x));
                    x++;
                }
            }
        }
        catch(SQLException e){
            javax.swing.JOptionPane.showMessageDialog(null,e);
        }/*finally{
                try{
                    conexion.cerrarConexion();
                }catch(Exception e){
                    javax.swing.JOptionPane.showMessageDialog(null,e);
                }
        }*/
    }
    
    
    public void CargaCboLab(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql = "Select BCT.id_ccostotipo, concat(BNL.desc_nomlabor,' - ',BTL.desc_tlabor) as labor "
                + "from base_ccostotipo BCT "
                + "inner join mina_labores ML on BCT.idcampo_ccostotipo=ML.id_labor "
                + "inner join base_nomlabor BNL on ML.id_nomlabor=BNL.id_nomlabor "
                + "inner join base_tlabor BTL on ML.id_tlabor=BTL.id_tlabor "
                + "where BCT.dir_ccostotipo=0 AND ML.est_labor = 1 ORDER BY 2 ASC;";
        llenar.llenarCombos(array, modelo, sql, "id_ccostotipo","labor", cbo);
    }
    
    public void CargaEqExtraccion(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql = "Select BE.id_equipo, CONCAT(BE.marca_equipo,' ', BE.modelo_equipo, ' ', BE.placa_equipo) equipo "
                + "from base_equipo BE "
                + "inner join base_tequipo BTE on BE.id_tequipo=BTE.id_tequipo "
                + "where BE.id_tequipo='TE26' OR BE.id_tequipo='TE15' AND est_equipo= 1 ";
        llenar.llenarCombos(array, modelo, sql, "id_equipo","equipo", cbo);
    }
   
    public void CargaCboPeriodo(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_periodo, desc_periodo from base_periodo where est_periodo=1";
        llenar.llenarCombos(array, modelo, sql, "id_periodo","desc_periodo", cbo);
    }
    public void CargaCboUndTrab(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_undtrab, desc_undtrab from base_undtrab where est_undtrab=1";
        llenar.llenarCombos(array, modelo, sql, "id_undtrab","desc_undtrab", cbo);
    }
    public void CargaCboNomLabor(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_nomlabor, desc_nomlabor from base_nomlabor where est_nomlabor=1 ORDER BY desc_nomlabor ASC;";
        llenar.llenarCombos(array, modelo, sql, "id_nomlabor","desc_nomlabor", cbo);
    }
    public void CargaCboEmpresa(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo, String complemento){
        llenar=new LlenarCombos();
        String sql ="Select id_empresa, desc_empresa from base_empresa where est_empresa=1" + complemento;
        llenar.llenarCombos(array, modelo, sql, "id_empresa","desc_empresa", cbo);
    }
    public void CargaCboTLabor(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_tlabor, desc_tlabor from base_tlabor where est_tlabor=1";
        llenar.llenarCombos(array, modelo, sql, "id_tlabor","desc_tlabor", cbo);
    }   
    public void CargaCboCLabor(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_clasiflab, desc_clasiflab from base_clasiflab where est_clasiflab=1";
        llenar.llenarCombos(array, modelo, sql, "id_clasiflab","desc_clasiflab", cbo);
    }
    public void CargaCboSeccion(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_seccion, desc_seccion from base_seccion where est_seccion=1";
        llenar.llenarCombos(array, modelo, sql, "id_seccion","desc_seccion", cbo);
    }
    public void CargaCboVeta(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_veta, desc_veta from base_veta where est_veta=1";
        llenar.llenarCombos(array, modelo, sql, "id_veta","desc_veta", cbo);
    }
    public void CargaCboNivel(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_nivel, CONCAT(desc_nivel,' Cota: ',cota_nivel) desc_nivel from base_nivel where est_nivel=1";
        llenar.llenarCombos(array, modelo, sql, "id_nivel","desc_nivel", cbo);
    }
    public void CargaCboFase(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_fase, desc_fase from base_fase where est_fase=1";
        llenar.llenarCombos(array, modelo, sql, "id_fase","desc_fase", cbo);
    }
    public void CargaCboCcosto(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_ccosto, desc_ccosto  from base_ccosto where est_ccosto=1";
        llenar.llenarCombos(array, modelo, sql, "id_ccosto","desc_ccosto", cbo);
    }
    public void CargaCboJerarquia(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_jerarq, desc_jerarq from base_jerarquia where est_jerarq=1";
        llenar.llenarCombos(array, modelo, sql, "id_jerarq","desc_jerarq", cbo);
    }
    public void CargaCboEquipo(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo, String idequipo){
        llenar=new LlenarCombos();
        String sql ="Select BE.id_equipo, concat(BTE.desc_tequipo, ' - ',BE.placa_equipo,' - ',BE.marca_equipo,' - ',BE.modelo_equipo,' - ') as equipo "
                + "from base_equipo BE "
                + "inner join base_tequipo BTE on BE.id_tequipo = BTE.id_tequipo "
                + "where BE.id_tequipo = '"+idequipo+"' and BE.est_equipo=1";
        llenar.llenarCombos(array, modelo, sql, "id_equipo","equipo", cbo);
    }
    public void CargaCboTEquipo(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_tequipo, desc_tequipo from base_tequipo where est_tequipo=1";
        llenar.llenarCombos(array, modelo, sql, "id_tEquipo","desc_tEquipo", cbo);
    }
    public void CargaCboUndMed(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();  
        String sql ="Select id_undmed, desc_undmed from base_undmed where est_undmed=1";
        llenar.llenarCombos(array, modelo, sql, "id_undmed","desc_undmed", cbo);
    }
    public void CargaCboZonaTrab(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_zonatrab, desc_zonatrab from base_zonatrab where est_zonatrab=1";
        llenar.llenarCombos(array, modelo, sql, "id_zonatrab","desc_zonatrab", cbo);
    }
    public void CargaCboArea(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_area, desc_area from base_area where est_area=1 order by desc_area ASC;";
        llenar.llenarCombos(array, modelo, sql, "id_area","desc_area", cbo);
    }
    public void CargaCboEstCivil(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select * from base_estcivil where est_estcivil=1";
        llenar.llenarCombos(array, modelo, sql, "id_estcivil","desc_estcivil", cbo);
    }
    public void CargaCboGradInst(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select * from base_gradinst where est_gradinst=1";
        llenar.llenarCombos(array, modelo, sql, "id_gradinst","desc_gradinst", cbo);
    }
    
    public void CargaCboSistTrab(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select * From base_sisttrab where est_sisttrab=1";
        llenar.llenarCombos(array, modelo, sql, "id_sisttrab","desc_sisttrab", cbo);
    }
    public void CargaCboDescCargo(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select * From base_desccargo where est_desccargo=1";
        llenar.llenarCombos(array, modelo, sql, "id_desccargo","desc_desccargo", cbo);
    }
    public void CargaCboSeguro(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select * From base_seguro where est_seguro=1";
        llenar.llenarCombos(array, modelo, sql, "id_seguro","desc_seguro", cbo);
    }
    public void CargaCboDpto(java.util.ArrayList array,javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select * From base_ubigeo where tipo_ubigeo='DEP'";
        llenar.llenarCombos(array, modelo, sql, "id_ubigeo","desc_ubigeo", cbo);
    }
    public void CargaCboProv(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo, String id){
        llenar=new LlenarCombos();
        String Codigo=id.substring(0,2);
        String sql="Select * From base_ubigeo where Left(id_ubigeo,2)='"+Codigo+"' "
                    + "And tipo_ubigeo='PRO'";
        llenar.llenarCombos(array, modelo, sql, "id_ubigeo","desc_ubigeo", cbo);
    }
    public void CargaCboDist(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo, String id){
        llenar=new LlenarCombos();
        String Codigo=id.substring(0,4);
        String sql="Select * From base_ubigeo where Left(id_ubigeo,4)='"+Codigo+"' "
                    + "And tipo_ubigeo='DIS'";
        llenar.llenarCombos(array, modelo, sql, "id_ubigeo","desc_ubigeo", cbo);
    }
    public void CargaCboTipoDoc(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_tipodoc, desc_tipodoc from base_tipodoc where est_tipodoc=1";
        llenar.llenarCombos(array, modelo, sql, "id_tipodoc","desc_tipodoc", cbo);
    }
    public void CargaCboZonaDesc(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_zonadesc, desc_zonadesc from base_zonadesc where est_zonadesc=1";
        llenar.llenarCombos(array, modelo, sql, "id_zonadesc","desc_zonadesc", cbo);
    }
    public void CargaCbotareo(java.util.ArrayList array, java.util.ArrayList array2, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo){
        llenar=new LlenarCombos();
        String sql ="Select id_codtareo, desc_codtareo, valido_codtareo  from base_codtareo where est_codtareo=1 order by item_codtareo ASC;";
        llenar.CargarComboDobleArray(array, array2, modelo, sql, "id_codtareo","desc_codtareo","valido_codtareo", cbo);
        
    }
    
    public void CargaCboCargo(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo, String condicion){
        llenar=new LlenarCombos();
        String sql ="Select BC.id_cargo, BDC.desc_desccargo from base_cargo BC "
            + "inner join base_desccargo BDC on BC.id_desccargo=BDC.id_desccargo where id_area='"+condicion+"' and est_cargo=1";
        llenar.llenarCombos(array, modelo, sql, "id_cargo","desc_desccargo", cbo);
    }
     public void CargaCboAprob(java.util.ArrayList array, javax.swing.DefaultComboBoxModel modelo,javax.swing.JComboBox cbo, String condicion){
         llenar=new LlenarCombos();
         String sql ="Select id_aprob, desc_aprob from base_aprob where id_area='"+condicion+"' and est_aprob=1";
         llenar.llenarCombos(array, modelo, sql, "id_aprob","desc_aprob", cbo);
     }
     
 
}
