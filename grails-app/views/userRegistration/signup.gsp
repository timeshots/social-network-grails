<%@ page import="com.timeshots.blacklabel.socialnetwork.User" %>
<!DOCTYPE html>
<html>
	<head>
	    <title>Sign Up</title>
        <r:require module="bootstrap"/>
        <r:layoutResources />
        <link rel="shortcut icon" href="${resource(dir: 'images/timeshots', file: 'ts.ico')}" type="images/x-icon">
		<link rel="stylesheet" href="${resource(dir: 'css/signup', file: 'signup.css')}" type="text/css">
	</head>
	<body>
        <div class="container">
            <h2>Sign Up</h2>
            <form class="form-signin" role="form" controller="userRegistration" action="signup" method="POST" id="loginForm" autocomplete="off">
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleInputFirstName1" placeholder="First Name" name="firstName" />
                    <input type="text" class="form-control" id="exampleInputLastName1" placeholder="Last Name" name="lastName" />
                    <input type="text" class="form-control" id="exampleInputUserName1" placeholder="Username" name="username" />
                    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Email" name="email" />
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password" />
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Re-enter password" name="confirmPassword" />
                    <div class="checkbox">
                        <label><input type="checkbox">Check me out</label>
                    </div>
                    <button type="submit" class="btn btn-primary">Sign Up</button>
                </div>
            </form>
        </div>
        <r:layoutResources />
    </body>
</html>