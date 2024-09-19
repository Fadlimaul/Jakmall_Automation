Feature: CO-01

  Scenario: TC-CO-01
    Given The user is on the login page and login
    When the user click proudct display
    And the user click beli sekarang button
    And the user choose shipping method
    And the user click lanjut ke pembayaran button
    And the user choose payment method
    And the user click bayar button
    Then the user get success message