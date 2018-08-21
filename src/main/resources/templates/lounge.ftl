<#import "parts/common.ftl" as c>
<@c.page>
<div>Welcome</div>
<form method="get" action="/lounge">
    <input type="text" name="output" value="${output}">
    <button type="submit">Найти</button>
</form>
<div>List of ads:</div>
<#list ads as ad>
    <div>
        <b>${ad.id}</b>
        <span>${ad.mark}</span>
        <i>${ad.carmodel}</i>
    </div>
<#else>
No Ads found
</#list>
</@c.page>
