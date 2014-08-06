<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>Dashboard</title>
	</head>
	<body>
        <div class="container">
            <g:if test="${flash.message}">
                <div class="message">
                    ${flash.message}
                </div>
            </g:if>

            <br/>
            <br/>
            <br/>
            <br/>

            <g:if test="${session.user}">
                <br/>
                <div class="message">
                    Login as : ${session.user} : <g:link controller="Login" action="logout">Logout</g:link>
                </div>
            </g:if>
        </div>
    </body>
</html>