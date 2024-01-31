import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DiceGameDatabase {
    String dbUrl = "jdbc:mysql://localhost:3306/ngpdb";
    String dbUname = "root";
    String dbPassword = "";
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String matches, player1Score, player2Score, losses1, losses2, draws1, draws2;

    // Constructor that takes all necessary parameters
    public DiceGameDatabase(String matches, String player1Score, String player2Score,
                            String losses1, String losses2, String draws1, String draws2) {
        this.matches = matches;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.losses1 = losses1;
        this.losses2 = losses2;
        this.draws1 = draws1;
        this.draws2 = draws2;
    }

    void store() {
        Connection con = null;
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
            String sql = "INSERT INTO dresults (Matches, WinPlayer1, WinPlayer2, losses1, losses2, draws1, draws2) VALUES ('" +
                    matches + "', '" + player1Score + "', '" + player2Score + "','" + losses1 + "','" + losses2 + "','" +
                    draws1 + "','" + draws2 + "')";
            Statement s = con.createStatement();
            s.execute(sql);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}