Feature: Wikipedia Search

  @useABrowser
  Scenario: User opens wikipedia and preformes search
    Given a user is able to open "http://en.wikipedia.org"
    When a user searches for topic "software"
    Then the page heading is "Software"

  @useABrowser
  Scenario Outline: User opens wikipedia and preformes search using examples
    Given a user is able to open "http://en.wikipedia.org"
    When a user searches for topic "<topic>"
    Then the page heading is "<heading>"

    Examples: 
      | topic  | heading |
      | cheese | cheese  |
      | dog    | dog     |
      |car	| car | 

  @useABrowser
  Scenario: User opens wikipedia and preformes search
    Given a user is able to open "http://en.wikipedia.org"
    When a user searches for topic "dog"
    When a user searches
      | Kingdom  | Phylum   | Class    | Order     | Family  |
      | Animalia | Chordata | Mammalia | Carnivora | Canidae |
