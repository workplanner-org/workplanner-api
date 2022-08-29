
FROM ubuntu:20.04
USER root

######################
# Creating location for mount volume
######################
RUN mkdir home/server

######################
# Installing Java
######################
RUN apt-get update \
    apt-get upgrade \ 
    apt install openjdk-17-jdk openjdk-17-jre


WORKDIR /home/server
COPY . .

#changing permissions is not necessary
# RUN chmod 755 /home/server/entrypoint.sh
ENTRYPOINT ["/home/server/entrypoint.sh"] 
