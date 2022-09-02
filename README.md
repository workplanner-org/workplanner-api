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

##### Verification of access rights for the files
2. take a look at the permissions of your files in the system
```bash
ls -l
```
***Do this for both the `entryfile.sh` and `server/gradlew`.***
if you see that you don't have execute rights for these files, change the permissions to enable execution. You can do this with :
```bash
chmod 777 ./filepath
```


3. Once cloned, open the Repo in visual studio code and run :
```bash 
docker-compose up --build
```
 
