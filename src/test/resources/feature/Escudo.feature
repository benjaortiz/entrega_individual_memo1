Feature: Escudo


  Scenario: blocking an attack with the shield
    Given person has a shield with 100 def
    When person blocks an attack of 10
    Then person should have full hp


  Scenario: blocking and attack thats stronger than the shield
    Given person has a shield with 100 def
    When person blocks an attack of 130
    Then person should have less than full hp


  Scenario: blocking an attack breaks the shield and deals damage
    Given person has a shield with 100 def
    When person blocks an attack of 210
    Then person should have less than full hp and shield should be broken