<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>Login Page</title>
	</head>
	<body>
        <div class="container">
            <g:if test="${flash.message}">
                <div class="message">
                    ${flash.message}
                </div>
            </g:if>

            <g:form controller="Login" action="authenticate" style="padding-left:200px">
                <div style="width:300px">
                    <label>Username :</label><input type="text" name="username" /><br/>
                    <label>Password :</label><input type="password" name="password" />
                    <br/><input type="submit" value="Login" />
                </div>
            </g:form>

            <g:if test="${session.user}">
                <br/>
                <div class="message">
                    Login as : ${session.user} : <g:link controller="Login" action="logout">Logout</g:link>
                </div>
            </g:if>
        </div>
    </body>
</html>