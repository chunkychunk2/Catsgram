package ru.yandex.practicum.catsgram;
package practicum;

import org.postgresql.ds.PGConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/filmsdb";
        String user = "dbuser";
        String password = "12345";

        PGConnectionPoolDataSource ds = new PGConnectionPoolDataSource();
        ds.setURL(url);
        ds.setUser(user);
        ds.setPassword(password);
        PooledConnection pooledConnection = null;
        try {
            pooledConnection = ds.getPooledConnection();
            String sql = "SELECT * FROM films WHERE kind = ? AND len_min = ?";
            PreparedStatement preparedStatement = pooledConnection.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, "Sci-Fi");
            preparedStatement.setInt(2, 110);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("title"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}