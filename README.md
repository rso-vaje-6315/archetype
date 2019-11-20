# KumuluzEE archetype
> Creates default project for rest service in KumuluzEE.

## Usage

Run command:
```bash
mvn archetype:generate -P rso "-DarchetypeGroupId=si.rso.archetype" "-DarchetypeArtifactId=rso-archetype" "-DarchetypeVersion=1.8.0" "-DgroupId=si.rso.sample" "-DartifactId=sample-project" "-Dversion=1.0.0-SNAPSHOT"
```

Command will generate directory (name equals artifactId) with project content.

## Generated project

### Resolving dependencies

Project needs to run with profile 'rso'. `mvn clean package -P rso`

### Deploying library

Library is deployed with `mvn deploy -P rso deploy-lib` command. During deploy profile 'deploy-lib' must be active, otherwise no artifacts are deployed to Nexus.
