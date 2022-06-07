# ChallengeMeli

Challenge técnico Meli

Este proyecto contiene la capa de servicios de la prueba técnica correspondiente.

## Requisitos

Este proyecto fue creado con las siguientes herramientas sobre Windows 11:
- Java 11
- Springboot 2.7.0
- Herramienta cliente para la prueba de los servicios REST. Para este proyecto se usó Postman (Se encuentran los scripts de referencia en la carpeta postman, listas para ser importada en su espacio de trabajo en postman)
- Se hosteó el API en una instancia de EC2 en AWS, con los siguientes endpoints:
	- GET 54.237.160.237:8080/quasar-fire-1.0.0/topsecret/example-bodyin
	- POST 54.237.160.237:8080/quasar-fire-1.0.0/topsecret/
	- POST 54.237.160.237:8080/quasar-fire-1.0.0/topsecret_split/{satelite_name}
	- GET 54.237.160.237:8080/quasar-fire-1.0.0/topsecret_split/
	- GET 54.237.160.237:8080/quasar-fire-1.0.0/topsecret_split/reset


## Getting started

Para ejecutar el proyecto, se facilita el siguiente botón para instalar el ambiente del cliente con algunos ejemplos aplicados:

Level 2:

<div class="postman-run-button"
data-postman-action="collection/import"
data-postman-var-1="67edf6768c2746258929"
data-postman-param="env%5BAWS%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiNTQuMjM3LjE2MC4yMzciLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6IjU0LjIzNy4xNjAuMjM3Iiwic2Vzc2lvbkluZGV4IjowfSx7ImtleSI6InBvcnQiLCJ2YWx1ZSI6IjgwODAiLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6IjgwODAiLCJzZXNzaW9uSW5kZXgiOjF9LHsia2V5IjoiY29udGV4dHJvb3QiLCJ2YWx1ZSI6Ii9xdWFzYXItZmlyZS0xLjAuMC8iLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6Ii9xdWFzYXItZmlyZS0xLjAuMC8iLCJzZXNzaW9uSW5kZXgiOjJ9XQ=="></div>
<script type="text/javascript">
  (function (p,o,s,t,m,a,n) {
    !p[s] && (p[s] = function () { (p[t] || (p[t] = [])).push(arguments); });
    !o.getElementById(s+t) && o.getElementsByTagName("head")[0].appendChild((
      (n = o.createElement("script")),
      (n.id = s+t), (n.async = 1), (n.src = m), n
    ));
  }(window, document, "_pm", "PostmanRunObject", "https://run.pstmn.io/button.js"));
</script>


Level 3:

<div class="postman-run-button"
data-postman-action="collection/import"
data-postman-var-1="799e811f08876dfa9eef"
data-postman-param="env%5BAWS%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiNTQuMjM3LjE2MC4yMzciLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6IjU0LjIzNy4xNjAuMjM3Iiwic2Vzc2lvbkluZGV4IjowfSx7ImtleSI6InBvcnQiLCJ2YWx1ZSI6IjgwODAiLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6IjgwODAiLCJzZXNzaW9uSW5kZXgiOjF9LHsia2V5IjoiY29udGV4dHJvb3QiLCJ2YWx1ZSI6Ii9xdWFzYXItZmlyZS0xLjAuMC8iLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6Ii9xdWFzYXItZmlyZS0xLjAuMC8iLCJzZXNzaW9uSW5kZXgiOjJ9XQ=="></div>
<script type="text/javascript">
  (function (p,o,s,t,m,a,n) {
    !p[s] && (p[s] = function () { (p[t] || (p[t] = [])).push(arguments); });
    !o.getElementById(s+t) && o.getElementsByTagName("head")[0].appendChild((
      (n = o.createElement("script")),
      (n.id = s+t), (n.async = 1), (n.src = m), n
    ));
  }(window, document, "_pm", "PostmanRunObject", "https://run.pstmn.io/button.js"));
</script>