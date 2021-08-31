/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ammani
 */
public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        login LOG = new login();
        LOG.setVisible(true);
    }
}
