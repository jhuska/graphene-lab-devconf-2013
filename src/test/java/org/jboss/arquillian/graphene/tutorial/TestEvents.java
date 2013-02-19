package org.jboss.arquillian.graphene.tutorial;

import junit.framework.Assert;
import org.jboss.arquillian.graphene.spi.annotations.Page;
import org.jboss.arquillian.graphene.tutorial.page.Booking;
import org.jboss.arquillian.graphene.tutorial.page.Checkout;
import org.jboss.arquillian.graphene.tutorial.page.Events;
import org.jboss.arquillian.graphene.tutorial.page.TicketMonsterPage;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestEvents extends AbstractTicketMonsterTest {

    @Page
    private Events events;
    @Page
    private Booking booking;
    @Page
    private Checkout checkout;
    @Page
    private TicketMonsterPage finished;

    @Override
    protected String getPagePath() {
        return "#events";
    }

    @Test
    public void testClickOnConcerts() {
        events.waitUntilPageIsLoaded();
        Assert.assertFalse(events.areConcertsExpanded());
        events.toggleConcerts();
    }

    @Test
    public void testBookConcert() {
        events.waitUntilPageIsLoaded();
        events.toggleConcerts();
        events.goToConcert("Rock concert of the decade");

        booking.selectVenue("Toronto : Roy Thomson Hall");
        booking.book();

        checkout.addTickets("A - Premier platinum reserve", 2);
        checkout.checkout("example@example.com");

        Assert.assertEquals("Booking #1 confirmed!", finished.getTitle());
    }

}
