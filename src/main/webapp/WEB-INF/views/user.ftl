<@layout.extends name="template.ftl">

    <@layout.put block="content" type="replace">
        <h1>Hello, ${user.getUsername()}!</h1>
        <p>Here is your email: ${user.getEmail()}</p>
    </@layout.put>

</@layout.extends>