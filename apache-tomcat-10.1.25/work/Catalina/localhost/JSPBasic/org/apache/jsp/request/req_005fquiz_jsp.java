/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-06-25 08:46:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.request;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class req_005fquiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<h3>req_quiz_ok로 post방식으로 데이터를 넘기고, ok페이지에서는 화면에 출력</h3>\r\n");
      out.write("	\r\n");
      out.write("	<form action=\"req_quiz_ok.jsp\">\r\n");
      out.write("		아이디: <input type=\"text\" name=\"id\" placeholder=\"힌트\" size=\"7\"></br>\r\n");
      out.write("		비밀번호: <input type=\"password\" name=\"pw\"><br>\r\n");
      out.write("		\r\n");
      out.write("		<!-- checkbox, radio 속성은 '반드시' name 속성을 사용해서 하나의 그룹으로 묶어 주어야 함 -->\r\n");
      out.write("		관심분야: <!-- 여러개 체크 가능함 -->\r\n");
      out.write("		<input type=\"checkbox\" name=\"inter\" value=\"java\"> java <!-- 값을 넣어주지 않으면 기본값 on만 출력 -->\r\n");
      out.write("		<input type=\"checkbox\" name=\"inter\" value=\"jsp\"> jsp\r\n");
      out.write("		<input type=\"checkbox\" name=\"inter\" value=\"database\"> database\r\n");
      out.write("		<input type=\"checkbox\" name=\"inter\" value=\"python\"> python\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		전공분야: <!-- 그룹으로 묶어주면 그중 1개의 선택지에만 체크 가능함 -->\r\n");
      out.write("		<input type=\"radio\" name=\"major\" value=\"경영학과\"> 경영학과\r\n");
      out.write("		<input type=\"radio\" name=\"major\" value=\"컴퓨터공학과\"> 컴퓨터공학과\r\n");
      out.write("		<input type=\"radio\" name=\"major\" value=\"철학과\"> 철학과\r\n");
      out.write("		<input type=\"radio\" name=\"major\" value=\"수학과\"> 수학과\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		입사일 : \r\n");
      out.write("		<input type=\"date\" name=\"regdate\">\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		지역 :\r\n");
      out.write("		 <select name=\"region\">\r\n");
      out.write("			<option>서울시</option>\r\n");
      out.write("			<option>경기도</option>\r\n");
      out.write("			<option>부산시</option>\r\n");
      out.write("			<option>인천시</option>\r\n");
      out.write("		</select>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		자기소개: <br>\r\n");
      out.write("		<textarea rows=\"5\" cols=\"30\" name=\"introduce\"></textarea>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		사진 첨부:\r\n");
      out.write("		<input type=\"file\" name=\"profile\">\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		<!-- form 안에 데이터를 서버로 전송하는 버튼 -->\r\n");
      out.write("		<input type=\"submit\" value=\"확인\">\r\n");
      out.write("		<input type=\"reset\" value=\"다시 작성하기\">\r\n");
      out.write("		<!-- 나중에 javascript를 사용해서 기능을 붙이게 된다 -->\r\n");
      out.write("		<input type=\"button\" value=\"그냥 버튼\">\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}