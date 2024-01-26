package web_basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseRequestServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Userオブジェクトの生成
		User objUser = new User();
		objUser.setName("神田タロー");
		objUser.setAge(25);
		
		//リクエストスコープへのUserオブジェクトの登録
		req.setAttribute("RequestUser", objUser);
		req.getRequestDispatcher("/view/ch11/useRequest2.jsp").forward(req, resp);
	}
}
