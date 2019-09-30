# Example skeleton

This builds with mvn `install` / `clean` / `compile` / `package` and produces fat jar in target.
Old-ass dependencies put into internal repo (see `repo` dir).

To add more jar-deps:
```
  mvn install:install-file  \
    -Dfile=path-to.jar \
    -DgroupId=uchicago -DartifactId=uchicago \
    -Dversion=1.0 -Dpackaging=jar \
    -DlocalRepositoryPath=./repo
```
