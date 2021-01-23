Based on this tutorial:
https://medium.com/@greut/java11-jlink-and-docker-2fec885fb2d

1. Using Gradle to create the jar:
1.1. Run using the correct JDK version: (copy the jdk to this folder due to permissions on the original path)
gradle build -Dorg.gradle.java.home=jdk-11.0.4/ --stacktrace

1. Creating manually the jar:
 1.1. -e = Entry point, the class where the main method will be used
 1.2. -C = location of the classes that will be packed to the jar
jar --create --file hello.jar -e com.test.Main -C target/classes/ .



2. Executing the jar
"/C/Program Files/Java/jdk-11.0.4/bin/java.exe" -jar hello.jar

3. Jlink => Create the custom jre to run the jar
 3.1. compress = 1 => Level 1: Constant string sharing
jlink --compress=1 --add-modules java.base --output jre

or put the complete path to the Jlink if you have multiple jdks installed
C\:/Program\ Files/Java/jdk-11.0.4/bin/jlink.exe

4. Run the app with the custom JRE
jre/bin/java -jar hello.jar



2. Build Docker image build (The same when you already have the jar file, Jlink to build the jre to use)
docker build -t jlink/0-Hello .

3. Run Docker image
 3.1. rm to remove the image after usage
docker run -rm jlink/0-Hello
