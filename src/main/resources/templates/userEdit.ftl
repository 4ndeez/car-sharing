<#import "parts/common.ftl" as c>
<@c.page>
<div>
    User Editor
</div>
<a href="/controlpanel">Back</a>
<form action="/controlpanel/user/" method="post">
    <input type="text" value="${user.username}" name="username">
    <#list roles as role>
    <div>
    <label><input type="checkbox" name="${role}" ${user.roles?seq_contains(role)?string("checked", "")}>${role}</label>
    </div>
    </#list>
    <input type="hidden" value="${user.id}" name ="userId">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button type="submit">Save</button>
</form>
</@c.page>