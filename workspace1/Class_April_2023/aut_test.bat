@echo Off
echo Cleaning project... &
mvn clean & echo Compiling source code...& mvn compile & echo Compiling test source code... & mvn test-compile & echo Running tests... & mvn install & mvn cobertura:cobertura