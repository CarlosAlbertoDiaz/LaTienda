Feature: Is it Friday yet?
  Queremos saber si todavia es viernes

Scenario Outline: Hoy es o no es Viernes
  Given hoy es "<dia>"
  When pregunto si es Viernes
  Then debo responder que "<respuesta>"
  Examples:
    | dia                | respuesta |
    | Domingo            | No        |
    | Viernes            | Si        |
    | Cualquier otro dia | No        |



