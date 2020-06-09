FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/shopify-webhook-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
COPY ./waitForIt.sh waitForIt.sh
CMD sleep 20
ENTRYPOINT ["java","-jar","-Dspring.datasource.url=${durl}","-Dspring.datasource.username=${dusername}","-Dspring.datasource.password=${dpassword}","-Dcheckhealth=${health}","-Dmanagement.endpoints.web.path-mapping.health=${health}","-Dshopify.key=${shop_key}","/app.jar"]


