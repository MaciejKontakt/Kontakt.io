import geb.Page

/**
 * class with log in page
 *
 * @author Maciej Bialy
 */
class LoginPage extends Page {

    static at = {heading.text() == "Panel | Kontakt" }

    static content = {
        userEmail { $("#sign-in-username")}
        userPassword { $("#sign-in-password")}
        submitButton { $(button.text("Sign in"))}
        wrongPassNotification { $("p", class: "message error")}
    }
}
