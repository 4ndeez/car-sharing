<#macro login path isRegisterForm>
<form action="${path}" method="post">
    <div class="form-group-row">
        <label class="col-sm-2 col-form-label">E-mail: </label>
        <div class="col-sm-6">
            <input type="email" name="username" class="form-control" placeholder="example@mail.com" />
        </div>
    </div>
    <div class="form-group-row">
        <label class="col-sm-2 col-form-label">Password:</label>
        <div class="col-sm-6">
            <input type="password" name="password" class="form-control"/>
        </div>
    </div>
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button class="btn btn-primary m-2" type="submit">Войти</button>
    <#if !isRegisterForm>
        <span>Вы еще не зарегистрированы? </span><a href="/register">Зарегистрироваться</a>
    <#else>
    <span>Вы уже зарегистрированы? </span>
    <a href="/login">Войти</a>
    </#if>
</form>
</#macro>

<#macro logout>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button class="btn btn-outline-danger btn-sm ml-2" type="submit">Выйти</button>
    </form>
</#macro>