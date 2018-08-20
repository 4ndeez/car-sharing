<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>
<@l.logout/>
<div>Welcome</div>
<div>
    <form method="post">
        <input type="text" name="username" placeholder="Input user" />
        <input type="text" name="password" placeholder="password" />
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Add</button>
    </form>
</div>
<div>List of users:</div>
<#list users as user>
    <div>
        <b>${user.id}</b>
        <span>${user.username}</span>
        <i>${user.password}</i>
    </div>
<#else>
No users found
</#list>
</@c.page>
