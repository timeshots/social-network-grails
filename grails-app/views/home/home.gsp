<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Timeshots</title>
        <r:require module="bootstrap"/>
        <r:require module="core"/>
        <r:layoutResources />
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="images/x-icon">
        <link rel="stylesheet" href="${resource(dir: 'css/home', file: 'cover.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'css/home', file: 'cover.min.css')}" type="text/css"
        <g:javascript library="application" />
        <g:javascript library="jquery" />
	</head>
	<body>
        <div class="site-wrapper">
            <div class="site-wrapper-inner">
                <div class="cover-container">
                    <div class="masthead clearfix">
                        <div class="inner">
                            <h3 class="masthead-brand">Timeshots</h3>
                            <ul class="nav masthead-nav">
                                <li class="active"><a href="${createLink(controller: 'home', action:'home')}">Home</a></li>
                                <li><a href="#">Features</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="${createLink(controller: 'userRegistration', action:'signup')}">Sign up</a></li>
                                <li><a href="${createLink(controller: 'login', action:'auth')}">Sign in</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="inner cover">
                        <h1 class="cover-heading">Cover your page.</h1>
                        <p class="lead">Cover is a one-page template for building simple and beautiful home pages. Download, edit the text, and add your own fullscreen background photo to make it your own.</p>
                        <p class="lead">
                            <a href="#" class="btn btn-lg btn-default">Learn more</a>
                        </p>
                    </div>

                    <div class="mastfoot">
                        <div class="inner">
                            <p>Cover template for <a href="https://www.blogger.com/profile/08780975280708671780">Timeshots</a>, by <a href="https://www.facebook.com/redwolfgang20">Borrero, Larry M.</a>.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <g:javascript library="bootstrapMINJS"/>
    <g:javascript library="bootstrapJS"/>
    <r:layoutResources />
    </body>
</html>