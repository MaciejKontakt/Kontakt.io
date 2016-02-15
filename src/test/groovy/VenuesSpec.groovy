import geb.spock.GebSpec

/**
 * test scenarios for create/update/delete the venue
 *
 * @author Maciej Bialy
 */

class VenuesSpec extends GebSpec {

    def "verify that there is no venue yet"(){
        given:
        to HomePage

        when:
        venuesLink.click()

        then:
        assert $("h2").text() == "Your venues (0)"

    }

    def "create new venue"(){
        given:
        to VenuesPage

        when:
        addVenueButton.click()
        $("#name") << "Venue1"
        $("#description") << "Venue description"
        $("button", type: "submit").click()

        then:
        assert $("h2").text() == "Your venues (1)"

    }

    def "update venue"(){
        given:
        to VenuesPage

        when:
        $("i", class: "icon icon-pencil").click()
        $("#name") << "Venue1-updated"
        $("button", type: "submit").click()
        $("a", text: "Manage your venue").click()

        then:
        assert $("td", class: "col-name").text() == "Venue1-updated"

    }

    def "delete venue"(){
        given:
        to VenuesPage

        when:
        $("i", class: "icon icon-trash").click()
        $("button", type: "submit").click()

        then:
        assert $("h2").text() == "Your venues (0)"

    }
}
