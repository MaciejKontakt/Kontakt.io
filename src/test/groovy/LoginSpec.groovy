import geb.spock.GebSpec

/**
 * test scenarios for log in
 *
 * @author Maciej Bialy
 */

class LoginSpec extends GebSpec {

   def "login to Panel|Kontakt with wrong password"(){
       given:
       to LoginPage

       when:
       userEmail << 'bialy.maciej@gmail.com'
       userPassword << 'password'

       and:
       submitButton.click()

       then:
       assert wrongPassNotification.contains() == "Wrong email and/or password"

   }

    def "login to Panel|Kontakt with wrong email name"(){
        given:
        to LoginPage

        when:
        userEmail << 'aaa'
        userPassword << 'password'

        and:
        submitButton.click()

        then:
        assert wrongPassNotification.contains() == "Enter a valid email address"

    }

    def "login to Panel|Kontakt with empty password"(){
        given:
        to LoginPage

        when:
        userEmail << 'test@gmail.com'
        userPassword << ''

        and:
        submitButton.click()

        then:
        assert wrongPassNotification.contains() == "Password is required"

    }
}
