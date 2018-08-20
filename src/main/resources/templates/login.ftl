<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>
<h2>Login page</h2>
<@l.login "/login" />
    <span>Вы еще не зарегистрированы?</span>
    <a href="/register">Зарегистрироваться</a>
</@c.page>