<#import "parts/common.ftl" as c>
<@c.page>
<h2>Ad addition page</h2>
<div>
    <form method="post">
        <input type="text" name="mark" placeholder="Введите сообщение" /> <br/>
        <input type="text" name="carmodel" placeholder="Введите сообщение" /><br/>
        <input type="number" name="year" placeholder="Введите сообщение" /><br/>
        <input type="text" name="stateNumber" placeholder="Введите сообщение" /><br/>
        <input type="text" name="place" placeholder="Введите сообщение" /><br/>
        <input type="text" name="type" placeholder="Введите сообщение" /><br/>
        <input type="text" name="fuel" placeholder="Введите сообщение" /><br/>
        <input type="number" name="price" placeholder="Введите сообщение" /><br/>
        <input type="text" name="text" placeholder="Введите сообщение" /><br/>
        <input type="text" name="calendar" placeholder="Введите сообщение" /><br/>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Добавить</button>
    </form>
</div>
</@c.page>