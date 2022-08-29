
FROM ubuntu:20.04
USER root
######################
# Creating location for mount volume
######################
RUN mkdir home/server

WORKDIR /home/server
COPY . .

#changing permissions is not necessary
# RUN chmod 755 /home/server/entrypoint.sh
ENTRYPOINT ["/home/server/entrypoint.sh"] 
