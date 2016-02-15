import geb.Page

/**
 * class with home page
 *
 * @author Maciej Bialy
 */

class HomePage extends Page{
    static url = "panel.kontakt.io/app/devices"

    static content = {
        devicesLink { $("#js-devices-link")}
        venuesLink { $("#js-venues-link")}
        accountsLink { $("#js-accounts-link")}
    }
}
