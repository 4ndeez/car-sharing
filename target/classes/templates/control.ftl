<#import "parts/common.ftl" as c>
<@c.page>
<div>
    List of users:
</div>
<table>
    <thead>
    <tr>
        <th>Username</th>
        <th>Role</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
    <tr>
        <td>${user.username}</td>
        <td><#list user.roles as role>${role}<#sep>, </#list></td>
        <td><a href="/controlpanel/user/${user.id}">Edit</a></td>
    </tr>
    </#list>
    </tbody>
</table>
</@c.page>