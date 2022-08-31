
FROM gradle:jdk17
USER root
RUN cd /
######################
# Creating location for mount volume
######################
RUN mkdir /home/server

WORKDIR /home/server
COPY . .
WORKDIR /home/server/workplanner

ENTRYPOINT ["/home/server/entrypoint.sh"] 
