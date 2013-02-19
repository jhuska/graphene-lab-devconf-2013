Testing web application cheaply
=========================

## Demo for Arquillian Graphene lab on DevConf 2013

### Application under test

Ticket monster available [here](https://github.com/jhuska/ticket-monster).

### Tags

1. pom.xml + .gitignore
2. Arquillian Graphene dependencies
3. Hello world from Graphene
	- it should contain html page which contains a typo
4. test for Hello World sample and fixed typo
5. preparing application WAR file for testing + version of ticket Monster = 2.0.10-SNAPSHOT
6. profile for JBoss AS remote
7. profile for JBoss AS managed
8. propagation of system properties
9. browsers: firefox, htmlunit
10. AbstractTest
11. Ugly TestEvent - elements should be there, tests no
12. Page objects in this order: TicketMonsterPage
13. Events,
14. Booking,
15. Checkout
16. Page fragments in this order: MenuItem
17. MenuGroup
18. Navigation Menu
19. Incorporating Page Fragments in Events page object.
20. Add other browsers: Chrome, Opera
