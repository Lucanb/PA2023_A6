
package Configurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DataComponentConfig {
    private final DataSource dataSource;

    @Autowired
    public DataComponentConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void yourMethod() {
        try (Connection connection = dataSource.getConnection()) {
            // Use the connection for your database operations
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void createConnection() {
        try {
            Connection connection = dataSource.getConnection();
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
