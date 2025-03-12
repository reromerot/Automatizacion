# author: reromerot,
Feature: Buenas prácticas de automatización
  Yo como analista automatizador de pruebas
  Necesito realizar un inicio de sesión
  Para enseñar la implementación de buenas prácticas de automatización

  Scenario Outline: Login Guru99
    Given "Analista" desea iniciar sesión en la página "<pageName>"
    When ingresa la información del usuario de "<pageName>"
      | <userName> | <password> |
    Then valida que se presenta el mensaje de éxito con texto "<msg>"

    Examples:
      | pageName | userName   | password | msg                    |
      | guru     | mngr615949 | zYzYtUr  | Manger Id : mngr615949 |

