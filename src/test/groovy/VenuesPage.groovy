import geb.Page

class VenuesPage extends Page {

    static url = "panel.kontakt.io/venues"

    static content = {
        addVenueButton { $("a", class: "js-show-modal button secondary")}
    }
}
