# author: Rigoberto Henao,
Feature: Buenas prácticas de automatización
  Yo como analista automatizador de pruebas
  Necesito realizar un inicio de sesión
  Para comprobar enseñar la implementación de buenas prácticas

  Scenario Outline: Login Guru99
    Given "Analista" desea iniciar sesión en la página "<pageName>"
    When ingresa la información del usuario de "<pageName>"
      | <userName> | <password> |
    Then valida que se presenta el mensaje de éxito con texto "<msg>"

    Examples:
      | pageName | userName   | password | msg                    |
      | guru     | mngr610790 | uqUnegE  | Manger Id : mngr610790 |

