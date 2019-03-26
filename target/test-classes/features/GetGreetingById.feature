Feature: Wikipedia Search

  Background: 
    Given Open http://en.wikipedia.org

  Scenario: User opens wikipedia and preformes search
    Given a user is able to open wikipedia
    When a user searches for topic "software"
    Then the url contains software
