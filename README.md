Testing web application cheaply
=========================

## Demo for Arquillian Graphene lab on DevConf 2013

### What it is ?

Nowadays there is a big stress on testing. Automated testing can bring lot of advantages to your project, however, it can be quite expensive (setting up test harness, developing tests, test maintenance). In this demo we would like to show you that it can be done in a cheaper way. Showcase you that developing tests can be even fun! 

* We will use **Arquillian Graphene** ([documentation](https://docs.jboss.org/author/display/ARQGRA2/Home)) which runs on top of the testing framework by JBoss, the [Arquillian](http://arquillian.org/).
* One should be familiar at least a little bit with *Java* and *Maven* in order to grasp the most from the demo.

### How demo works ?

* There are 21 tags listed below
* Each tag represents one step in the process of setting up the test suite for application under test
* It covers things like setting up the test harness (Arquillian), and writing actual tests in a proper way, see the description of each tag
* Tags follow each other, so once you are lost in one step you can checkout next tag to see the proper solution

### Application under test

Ticket monster, sources available [here](https://github.com/jhuska/ticket-monster). You can check out live demo [here](https://ticketmonster-jdf.rhcloud.com/).

### Tags

1. -setup — pom.xml, .gitignore and README.md
2. -dependencies — dependencies
3. -helloworld-1 — Hello World sample with typo
4. -helloworld-2 — test for Hello World sample and fixed typo
5. -full-setup-1 — preparing application WAR file for testing
6. -full-setup-2 — added profile for JBoss AS remote
7. -full-setup-3 — added profile for JBoss AS managed
8. -full-setup-4 — propagation of system properties (browser.capabilities)
9. -full-setup-5 — profiles for browsers
10. -ugly-tests-1 — abstract class for ticket monster tests
11. -ugly-tests-2 — ugly test for clicking on concerts
12. -ugly-tests-3 — ugly test for booking a concert
13. -page-objects-1 — general ticket monster page
14. -page-objects-2 — events page
15. -page-objects-3 — booking page
16. -page-objects-4 — checkout page
17. -page-objects-5 — TestEvents refactored to use page objects
18. -page-fragments-1 — page fragment for menu item
19. -page-fragments-2 — page fragment for menu group
20. -page-fragments-3 — page fragment for navigation menu
21. -page-fragments-4 — using page fragment for navigation menu in events page