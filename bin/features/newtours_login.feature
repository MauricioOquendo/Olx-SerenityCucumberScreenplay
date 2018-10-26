#Author: your.email@your.domain.com
#Este farture se utilizara para realizar una busqueda en Olx 
#El nos enviara que queremos buscar ubicacion y el numero del item que le queremos dar click
@tag
Feature: Newtours Loggin
  I want to use this template for my feature file

  Scenario: Enter the register flight page
    Given that susan wants login on newtours
    When he enter your username and password
      | buscar| ubicacion | items |
      | moto  | Huila  | 4 |
    Then he should see the find flight page
