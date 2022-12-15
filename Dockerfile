FROM openjdk:latest

	EXPOSE 8086
	
	ARG JAR_FILE=target/*.jar
	COPY ${JAR_FILE} app.jar
	 
	  ENTRYPOINT ["java","-jar","/app.jar"]
