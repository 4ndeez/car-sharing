<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>
<h2>Register page</h2>
    ${message?ifExists}
    <@l.login "/register" />
    <span>Вы уже зарегистрированы?</span>
<a href="/login">Войти</a>
</@c.page>