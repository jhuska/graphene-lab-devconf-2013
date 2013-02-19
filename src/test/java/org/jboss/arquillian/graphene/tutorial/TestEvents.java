package org.jboss.arquillian.graphene.tutorial;

import junit.framework.Assert;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.enricher.findby.FindBy;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@RunWith(Arquillian.class)
public class TestEvents extends AbstractTicketMonsterTest {

    // events
    @FindBy(jquery = "a[data-target='#category-1-collapsible']")
    private WebElement concertHeader;
    @FindBy(css = "#category-1-collapsible")
    private WebElement concertMenu;
    @FindBy(jquery = "a[data-original-title='Rock concert of the decade']")
    private WebElement concertLink;

    // events/1
    @FindBy(css = "#venueSelector")
    private Select venueSelect;
    @FindBy(css = "#bookingWhen")
    private WebElement booking;
    @FindBy(name = "bookButton")
    private WebElement bookButton;

    // book/1/1
    @FindBy(id = "sectionSelect")
    private Select sectionSelect;
    @FindBy(name = "tickets-1")
    private WebElement numberOfTickets;
    @FindBy(name = "add")
    private WebElement addButton;
    @FindBy(className = "icon-trash")
    private WebElement trash;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(name = "submit")
    private WebElement checkout;

    @FindBy(className = "special-title")
    private WebElement pageHeader;

    @Override
    protected String getPagePath() {
        return "#events";
    }

    @Test
    public void testClickOnConcerts() {

    }

    @Test
    public void testBookConcert() {

    }

}
