Feature: Ingresar a github de manera exitosa

  @Logingithub
  Scenario: ingresar con el usuario y clave
    Given el cliente ingresa a la pagina web
    When cuando este en la opcion login colocar usuario y clave e ingresar
    Then Validar que el ingreso sea exitoso