<#include "security.ftl">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Carsharing</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ">
                <a class="nav-link" href="/lounge">Lounge</a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="#">Test</a>
            </li>
            <#if isAdmin>
            <li class="nav-item ">
                <a class="nav-link" href="/controlpanel">Admin</a>
            </li>
            </#if>
        </ul>
        <div class="navbar-text"><a href="/user/${id}">${name}</div></a>
    </div>
</nav>