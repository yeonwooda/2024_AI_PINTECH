<%@ page contentType="text/html; charset=UTF-8" %>
  <%@ page isErrorPage="true" %>
  <h1>에러 발생!!</h1>
  // 에러나면 이 페이지로 넘겨주는 버퍼가 치환되서 바뀌는
  <%
      out.write("<h1>" + exception.getMessage() + "</h1>");
      exception.printStackTrace();
  %>

