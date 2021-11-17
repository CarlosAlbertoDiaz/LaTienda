Feature: Realizar el proceso de cobro

Scenario Outline: cobro es o no efectivo
Given pago es con "<forma>"
When pregunto si es con efectivo
Then debo contestar que "<respuesta>"
  Examples:
    | forma    | respuesta |
    | tarjeta  | No        |
    | efectivo | Si        |
    | otros    | No        |




