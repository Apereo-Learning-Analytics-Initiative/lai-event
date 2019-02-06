# Apereo LAI Event

This repository contains the shared event data models (xAPI and IMS Caliper).


### Command to build the package:
> Don't forget to edit the -Dversion
```bash
mvn package
cd target/
mvn install:install-file -DgroupId=org.apereo.event -DartifactId=lai-event -Dversion=1.1.1 -Dfile=lai-event-1.1.1.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=. -DcreateChecksum=true
```