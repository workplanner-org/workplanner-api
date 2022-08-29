# workplanner-api
Workplanner Application API

> This is the API for the workplanner application. It is java api boostraped with `Spring Boot`.
> The api will reference a MYSQL Database using the `MySQL` driver dependency provided by Spring Boot. 

### To start using the API :

1. Clone this repo to the location of your choice 
```bash
 https : git clone https://github.com/workplanner-org/workplanner-api.git
 ssh  : git clone git@github.com:workplanner-org/workplanner-api.git
```

2. Once cloned, open the Repo in visual studio code and run :
```bash 
docker-compose up --build -d
```

3. Once your container is running, get into it by running :
```bash
docker-exec -it workplanner-api /bin/sh
```

4. Now you can view the inside of the container and run any unix based commands that you wish. 
 -- start with `ls` to make sure that you are in the project folder
 -- run the web api with : `./gradlew bootRun`
 
 
