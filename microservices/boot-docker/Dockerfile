FROM openjdk:8 
EXPOSE 8080
ADD target/boot-docker.jar boot-docker.jar
ENTRYPOINT ["java","-jar","boot-docker.jar"]
#to run jar file we need jdk

#docker build -t boot-docker-app .
#docker run -p 9090:8080 boot-docker-app on localhost:9090/greet we get o/p

#to stop a terminal in cmd runing dockerfile .open another cmd on target and press cd..
#docker ps -a and it opens all the id and current running id is on top left and copy it and give
#docker stop 97fc97502ffe and go back to old terminal and see stopped terminal