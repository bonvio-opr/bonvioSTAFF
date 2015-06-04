<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<form class="form-signin" action="/j_spring_security_check" method="POST">

    <input type="text"
           placeholder="Login"
           required="" name="j_username">
    <input type="password"
           placeholder="Password"
           required=""
           name="j_password">

    <div class="checkbox">
        <label>
            <input type="checkbox"
                   value="remember-me"
                   name="_spring_security_remember_me"> Remember me
        </label>
    </div>
    <button type="submit">Singin</button>
</form>

</body>
</html>