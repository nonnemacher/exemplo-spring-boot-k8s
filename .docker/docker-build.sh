mvn -f ../pom.xml clean package
export PROJECT_NAME=`mvn -f ../pom.xml -q -Dexec.executable=echo -Dexec.args='${project.name}' --non-recursive exec:exec`
export PROJECT_VERSION=`mvn -f ../pom.xml -q -Dexec.executable=echo -Dexec.args='${project.version}' --non-recursive exec:exec`
docker build -t nonnemacher/${PROJECT_NAME}:${PROJECT_VERSION} -f Dockerfile ../.
docker push nonnemacher/${PROJECT_NAME}:${PROJECT_VERSION}
