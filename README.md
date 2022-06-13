# ChallengeMeli

Challenge técnico Meli

Este proyecto contiene la capa de servicios de la prueba técnica correspondiente.

## Requisitos

Este proyecto fue creado con las siguientes herramientas sobre Windows 11:
- Java 11
- Springboot 2.7.0
- Herramienta cliente para la prueba de los servicios REST. Para este proyecto se usó Postman (Se encuentran los scripts de referencia en la carpeta postman, listas para ser importada en su espacio de trabajo en postman)
- Se hosteó el API en una instancia de EC2 en AWS, con los siguientes endpoints:
	- GET http://fuegoquasar-env.eba-g9s3rwyg.us-east-1.elasticbeanstalk.com/topsecret/example-bodyin
	- POST http://fuegoquasar-env.eba-g9s3rwyg.us-east-1.elasticbeanstalk.com/topsecret/
	- POST http://fuegoquasar-env.eba-g9s3rwyg.us-east-1.elasticbeanstalk.com/topsecret_split/{satelite_name}
	- GET http://fuegoquasar-env.eba-g9s3rwyg.us-east-1.elasticbeanstalk.com/topsecret_split/
	- GET http://fuegoquasar-env.eba-g9s3rwyg.us-east-1.elasticbeanstalk.com/topsecret_split/reset


## Getting started

Para ejecutar el proyecto, se facilita el siguiente botón para instalar el ambiente del cliente con algunos ejemplos aplicados:

Level 2:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/67edf6768c2746258929?action=collection%2Fimport#?env%5BAWS%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2Z1ZWdvcXVhc2FyLWVudi5lYmEtZzlzM3J3eWcudXMtZWFzdC0xLmVsYXN0aWNiZWFuc3RhbGsuY29tLyIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiaHR0cDovL2Z1ZWdvcXVhc2FyLWVudi5lYmEtZzlzM3J3eWcudXMtZWFzdC0xLmVsYXN0aWNiZWFuc3RhbGsuY29tLyIsInNlc3Npb25JbmRleCI6MH0seyJrZXkiOiJwb3J0IiwidmFsdWUiOiI4MDgwIiwiZW5hYmxlZCI6ZmFsc2UsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiODA4MCIsInNlc3Npb25JbmRleCI6MX0seyJrZXkiOiJjb250ZXh0cm9vdCIsInZhbHVlIjoiL3F1YXNhci1maXJlLTEuMC4wLyIsImVuYWJsZWQiOmZhbHNlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6Ii9xdWFzYXItZmlyZS0xLjAuMC8iLCJzZXNzaW9uSW5kZXgiOjJ9XQ==)


Level 3:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/799e811f08876dfa9eef?action=collection%2Fimport#?env%5BAWS%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2Z1ZWdvcXVhc2FyLWVudi5lYmEtZzlzM3J3eWcudXMtZWFzdC0xLmVsYXN0aWNiZWFuc3RhbGsuY29tLyIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiaHR0cDovL2Z1ZWdvcXVhc2FyLWVudi5lYmEtZzlzM3J3eWcudXMtZWFzdC0xLmVsYXN0aWNiZWFuc3RhbGsuY29tLyIsInNlc3Npb25JbmRleCI6MH0seyJrZXkiOiJwb3J0IiwidmFsdWUiOiI4MDgwIiwiZW5hYmxlZCI6ZmFsc2UsInR5cGUiOiJkZWZhdWx0Iiwic2Vzc2lvblZhbHVlIjoiODA4MCIsInNlc3Npb25JbmRleCI6MX0seyJrZXkiOiJjb250ZXh0cm9vdCIsInZhbHVlIjoiL3F1YXNhci1maXJlLTEuMC4wLyIsImVuYWJsZWQiOmZhbHNlLCJ0eXBlIjoiZGVmYXVsdCIsInNlc3Npb25WYWx1ZSI6Ii9xdWFzYXItZmlyZS0xLjAuMC8iLCJzZXNzaW9uSW5kZXgiOjJ9XQ==)