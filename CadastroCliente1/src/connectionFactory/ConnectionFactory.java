/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allan Aguiar
 */
public class ConnectionFactory {
    
    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost:3307/bdCadCliente", "root", "usbw");

        } catch (SQLException erro) {
             throw new RuntimeException(erro);

        }
    }
    
}
