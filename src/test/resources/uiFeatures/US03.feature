@run
Feature: US03

  Scenario: Kullanıcı ALL menusunden herhangi bir kategori seçebilmeli ve alt kategorilerin listelendiğini görebilmeli
  Given Kullanıcı www.amazon.com sayfasına gider
  And Kullanıcı All kategorisine tıklar
  And Kullanıcı "Computer" menusunu seçer
  Then Kullanıcı 15 kategori olduğunu assert eder