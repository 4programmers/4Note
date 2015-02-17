<@layout.extends name="template.ftl">

    <@layout.put block="content" type="replace">
        <div class="jumbotron content">
            <h1>Hello, ${user.getUsername()}!</h1>
            <p>Here is your email: ${user.getEmail()}</p>
        </div>
    </@layout.put>

</@layout.extends>