package org.jboss.arquillian.graphene.tutorial.page;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.enricher.findby.ByJQuery;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Events extends TicketMonsterPage {

    @FindBy(jquery = "a[data-target='#category-1-collapsible']")
    private WebElement concertHeader;
    @FindBy(css = "#category-1-collapsible")
    private WebElement concertMenu;

    @Drone
    private WebDriver browser;

    @Override
    public void waitUntilPageIsLoaded() {
        super.waitUntilPageIsLoaded();
        Graphene.waitGui()
                .until()
                .element(concertMenu)
                .is()
                .present();
    }

    public void toggleConcerts() {
        boolean expanding = !areConcertsExpanded();
        concertHeader.click();
        if (expanding) {
            Graphene.waitGui()
                    .until()
                    .element(concertMenu)
                    .attribute("style")
                    .not()
                    .equalTo("height: 0px;");
        } else {
            Graphene.waitGui()
                    .until()
                    .element(concertMenu)
                    .attribute("style")
                    .equalTo("height: 0px;");
        }
    }

    public boolean areConcertsExpanded() {
        return concertHeader.getAttribute("style") != null && concertHeader.getAttribute("style").equals("height: 0px;");
    }

    public void goToConcert(String concert) {
        Graphene.guardXhr(browser.findElement(ByJQuery.jquerySelector("a[data-original-title='"+concert+"']"))).click();
    }

}
