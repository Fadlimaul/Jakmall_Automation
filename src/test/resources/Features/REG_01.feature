Feature: REG-01

  Scenario: TC-REG-01
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05"
    And The user enter nama lengkap field "Maulana Fadli"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-02
    Given The user is on the register page
    When The user click batal button
    And The user enter nama lengkap field "Maulana Fadli"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-03
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05@gmail.com"
    And The user enter nama lengkap field "Ma"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user get warning nama lengkap message

  Scenario: TC-REG-04
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05@gmail.com"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-05
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05@gmail.com"
    And The user enter nama lengkap field "Maulana"
    And The user enter telepon field "0"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-06
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05@gmail.com"
    And The user enter nama lengkap field "Maulana"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-07
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05@gmail.com"
    And The user enter nama lengkap field "Maulana"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fad"
    And The user click daftar akun button
    Then the user get warning password message

  Scenario: TC-REG-08
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlimaul05@gmail.com"
    And The user enter nama lengkap field "Maulana"
    And The user enter telepon field "08517105013"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-09
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "fadlianaksehat@gmail.com"
    And The user enter nama lengkap field "Maulana Fadli"
    And The user enter telepon field "089867542794"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user directed to register success page

  Scenario: TC-REG-10
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "testing2@gmail.com"
    And The user enter nama lengkap field "Maulana"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user get warning email message

  Scenario: TC-REG-11
    Given The user is on the register page
    When The user click batal button
    And The user enter email field "akuadalahkau@gmail.com"
    And The user enter nama lengkap field "Maulana"
    And The user enter telepon field "08517105013"
    And The user enter password field "Fadli123"
    And The user click daftar akun button
    Then the user still on the register page

  Scenario: TC-REG-12
    Given The user is on the register page
    When The user click batal button
    And The user enter password field "Fadli123"
    And The user click eye icon
    Then the password should be displayed