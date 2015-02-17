<@layout.extends name="template.ftl">

    <@layout.put block="content" type="replace">
        <div class="jumbotron content">
            <h2>Informacje o wstawionym uzytkowniku:</h2>
            <table>
                <tr>
                    <td>Nazwa:</td>
                    <td>${user.getUsername()}</td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td>${user.getEmail()}</td>
                </tr>
            </table>
        </div>
    </@layout.put>

</@layout.extends>