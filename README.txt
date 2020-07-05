Based on this tutorial:
https://medium.com/@greut/java11-jlink-and-docker-2fec885fb2d

1. Creating manually the jar:
 1.1. -e = Entry point, the class where the main method will be used
 1.2. -C = location of the classes that will be packed to the jar
jar --create --file hello.jar -e com.test.Main -C target/classes/ .

2. Executing the jar
"/C/Program Files/Java/jdk-11.0.4/bin/java.exe" -jar hello.jar

3. Jlink => Create the custom jre to run the jar
jlink --compress=1 --add-modules java.base --output jre

 3.1. Run the app with the custom JRE
	jre/bin/java -jar hello.jar


