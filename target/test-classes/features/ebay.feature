Feature: Ebay Arama

  @ebay @urunarama #senaryomuzun tag degeri bosluk birakarak birden fazla yazabiliyoruz
  Scenario: TC01_kullanici ebayda urun arar
    Given kullanici "https://ebay.com" sayfasina gider
    And kullanici aramaKutusuna "stroller" yazar
    Then kullanici sonucsayisini ekrana yazar