
### Ignite Local Setup

##### 01. Download the ignite binary [2.7.0](http://mirrors.wuchna.com/apachemirror//ignite/2.7.0/apache-ignite-2.7.0-bin.zip)

##### 02. Extract the ignite binary to File System
     C:\apache-ignite-2.7.0-bin
     
##### 03. PATH variable / Environment Configuration

Add the below System / User variables to your Environment.

    IGNITE_HOME=C:\apache-ignite-2.7.0-bin
    JAVA_HOME=C:\Program Files\Java\jdk-xxx
    
Update the `PATH` variable with below entries.

    %IGNITE_HOME%\bin
    %JAVA_HOME%\bin

##### 04. Start ignite node

Go to `C:\apache-ignite-2.7.0-bin\bin`

Open Command Prompt and type the below command and hit enter key: `ignite`

This will start one node of the ignite.

##### 05. Start the Application
Execute the class `SpringIgniteApp.java` as a Java Application from your IDE.

##### 06. Observe the Logs
Observe the logs that account records are getting associated with Ignite.


	


 

	
	
