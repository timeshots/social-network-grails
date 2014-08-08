<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
	    <title>Login Page</title>
        <r:require module="bootstrap"/>
        <r:layoutResources />
		<link rel="stylesheet" href="${resource(dir: 'css/login', file: 'auth.css')}" type="text/css">
	</head>
	<body>
        <div class="container">
            <g:if test="${flash.message}">
                <div class="alert alert-danger">${flash.message}</div>
            </g:if>

            <form class="form-signin" role="form" controller="Login" action="authenticate" method="POST" id="loginForm" autocomplete="off">
                <div class="form-group">
                    <label for="exampleInputEmail1">Username :</label>
                    <input type="text" class="text_ form-control" id="exampleInputEmail1" placeholder="Username" name="username" />

                    <label for="exampleInputPassword1">Password :</label>
                    <input type="password" class="text_ form-control" id="exampleInputPassword1" placeholder="Password" name="password" />
                </div>
                <div class="checkbox">
                    <label><input type="checkbox">Check me out</label>
                </div>
                <button type="submit" class="btn btn-primary">Sign in</button>
            </form>

            <g:if test="${session.user}">
                <br/>
                <div class="message">
                    Login as : ${session.user} : <g:link controller="Login" action="logout">Logout</g:link>
                </div>
            </g:if>
        </div>

        <r:layoutResources />
    </body>
</html>