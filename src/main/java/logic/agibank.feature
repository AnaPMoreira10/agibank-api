# language: pt
  @agibank
Funcionalidade: Validar apis com status e retorno

  Esquema do Cenario: Validar lista de dogs e raca
    Dado que usuario acesse api
    Então valido retorno e statusCode "<raca>" e "<subRaca>" e <status>

    Exemplos:
      |raca             |   subRaca           |status|
      | bullterrier     |  staffordshire      |200|


  Esquema do Cenario: Validar api imagem random
    Dado que usuario acesse api random
    Então valido retorno da api random e statusCode "<msg>" e "<sucesso>" e <statusCode>

    Exemplos:
      |msg      |   sucesso     |statusCode|
      | .jpg    |  success      |200   |


  Esquema do Cenario: Validar api hound imagem
    Dado que usuario acesse api hound imagem
    Então valido retorno da api hound e statusCode "<msg>" e <statusCode>

    Exemplos:
      |msg    |statusCode|
      | .jpg  |200       |