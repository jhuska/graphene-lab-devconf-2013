package org.jboss.arquillian.graphene.tutorial.page;

import com.google.common.base.Predicate;
import static org.jboss.arquillian.graphene.Graphene.waitAjax;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.jboss.arquillian.graphene.tutorial.page.fragment.MenuGroup;
import org.jboss.arquillian.graphene.tutorial.page.fragment.NavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Events extends TicketMonsterPage {

    @FindBy(id = "itemMenu")
    private NavigationMenu verticalMenu;

    @FindBy(className = "special-title")
    private WebElement titleOfTheConcert;

    @Override
    public void waitUntilPageIsLoaded() {
        verticalMenu.waitUntilMenuIsLoaded();
    }

    public void toggleConcerts() {
        verticalMenu.getMenuGroup(0).expand();
    }

    public boolean areConcertsExpanded() {
        return verticalMenu.getMenuGroup(0).isExpanded();
    }

    public void goToConcert(final String concert) {
        MenuGroup concerts = verticalMenu.getMenuGroup(0);
        concerts.getMenuItem(concert).toggle();
        waitAjax().until(new Predicate<WebDriver>() {
            @Override
            public boolean apply(WebDriver input) {
                return titleOfTheConcert.getText().trim().equals(concert);
            }
        });
    }

}
