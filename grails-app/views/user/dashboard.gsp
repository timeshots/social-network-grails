<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Login Page</title>
        <r:require module="bootstrap"/>
        <r:layoutResources />
        <link rel="shortcut icon" href="${resource(dir: 'images/timeshots', file: 'ts.ico')}" type="images/x-icon">
        <link rel="stylesheet" href="${resource(dir: 'css/dashboard', file: 'dashboard.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'css/dashboard', file: 'cover.css')}" type="text/css">
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
                    Login as : ${session.user} : <g:link controller="user" action="logout">Logout</g:link>
                </div>
            </g:if>
        </div>

    <r:layoutResources />
    </body>
</html>