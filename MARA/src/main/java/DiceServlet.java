import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DiceServlet
 */
@WebServlet("/DiceServlet")
public class DiceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiceServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String matches = request.getParameter("matches");
        String player1Score = request.getParameter("player1Score");
        String player2Score = request.getParameter("player2Score");
        String losses1 = request.getParameter("losses1");
        String losses2 = request.getParameter("losses2");
        String draws1 = request.getParameter("draws1");
        String draws2 = request.getParameter("draws2");

        // Assuming you have a constructor in DiceGameDatabase that takes the connection details
        DiceGameDatabase obj = new DiceGameDatabase(matches, player1Score, player2Score, losses1, losses2, draws1, draws2);
        obj.store();
        RequestDispatcher requ= request.getRequestDispatcher("final.html");
		requ.forward(request, response);
		doGet(request, response);
    }
}

