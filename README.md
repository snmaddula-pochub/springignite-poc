
# Spring Ignite POC App

<hr />

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


    [17:11:39] Ignite node started OK (id=72408e7b, instance name=spring-ignite-poc)
    [17:11:39] Topology snapshot [ver=1, locNode=72408e7b, servers=1, clients=0, state=ACTIVE, CPUs=8, offheap=3.2GB, heap=3.5GB]
    ************ Accounts by FirstName : Alpha
    Account[accountId=1,firstName=Alpha,lastName=Omega]
    Account[accountId=2,firstName=Alpha,lastName=B]
    ************ Accounts by LastName : Omega
    Account[accountId=1,firstName=Alpha,lastName=Omega]
    Account[accountId=3,firstName=Alpha_3,lastName=Omega]
    [17:11:39] Ignite node stopped OK [name=spring-ignite-poc, uptime=00:00:00.600]



	


 

	
	
