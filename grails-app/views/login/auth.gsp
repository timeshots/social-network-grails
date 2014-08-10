<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
	    <title>Login Page</title>
        <r:require module="bootstrap"/>
        <r:layoutResources />
        <link rel="icon" href="${resource(dir: 'images/timeshots', file: 'ts.ico')}">
		<link rel="stylesheet" href="${resource(dir: 'css/login', file: 'signin.min.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css/login', file: 'signin.css')}" type="text/css">
	</head>
	<body>
        <div class="container">
            <g:form class="form-signin" role="form" controller="Login" action="authenticate" method="POST" id="loginForm" autocomplete="off">
                <g:if test="${flash.message}">
                    <div class="alert alert-danger">${flash.message}</div>
                </g:if>

                <h2 class="form-signin-heading">Please sign in</h2>
                <input type="text" class="form-control" placeholder="Email address" name="username" required autofocus>
                <input type="password" class="form-control" placeholder="Password" name="password" required>
                <label class="checkbox">
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </g:form>
        </div>
        <r:layoutResources />
    </body>
</html>