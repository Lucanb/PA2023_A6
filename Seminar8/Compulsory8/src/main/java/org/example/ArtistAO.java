    package org.example;

    import java.sql.*;

    public class ArtistAO {

        int id;
        String name = new String();

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public ArtistAO(int id, String name){
            this.id = id;
            this.name = name;
            String sql = "create table if not exists artists ( id integer NOT NULL,, name character varying NOT NULL, CONSTRAINT artists_pkey PRIMARY KEY (id))";
            try (Connection con = Database.getConnection();
                 Statement stmt = con.createStatement()) {
                stmt.executeUpdate(sql);
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        public void create(String name) throws SQLException {
            Connection con = Database.getConnection();
            try (PreparedStatement pstmt = con.prepareStatement(
                    "insert into artists (name) values (?)")) {
                pstmt.setString(1, name);
                pstmt.executeUpdate();
            }
        }

        public Integer findByName(String name) throws SQLException {
            Connection con = Database.getConnection();
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(
                         "select id from artists where name='" + name + "'")) {
                return rs.next() ? rs.getInt(1) : null;
            }
        }

        public String findById(int id) throws SQLException {
            Connection con = Database.getConnection();
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(
                         "select name from artists where id=" + id)) {
                return rs.next() ? rs.getString(1) : null;
            }
        }

        public void deleteById(int id) throws SQLException {
            Connection con = Database.getConnection();
            try (Statement stmt = con.createStatement()) {
                stmt.executeUpdate("delete from artists where id=" + id);
            }

        }

        public void update(int id, String name) throws SQLException {
            Connection con = Database.getConnection();
            try (Statement stmt = con.createStatement()) {
                stmt.executeUpdate("update artists set name='" + name + "' where id=" + id);
            }
        }

        public void list() throws SQLException {
            Connection con = Database.getConnection();
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("select * from artists")) {
                while (rs.next()) {
                       System.out.println(rs.getString(1) + " " + rs.getString(2));
                    }
                }
            }
    }

